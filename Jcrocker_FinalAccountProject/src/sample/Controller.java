package sample;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    // Input Fields
    @FXML private TextField userField;
    @FXML private TextField idField;
    @FXML private TextField validField;
    @FXML private TextField withdrawField;
    @FXML private TextField depositField;

    // Output Fields
    @FXML private TextField balanceField;
    @FXML private TextArea finalizeField;

    // Buttons
    @FXML private Button newUserBtn;
    @FXML private Button existingUsrBtn;
    @FXML private Button withdrawBtn;
    @FXML private Button depositBtn;
    @FXML private Button finalizeBtn;
    @FXML private Button clearAllBtn;

    private ArrayList<Account> accountArrayList = new ArrayList<>();
    private Account account1;

    // method to create a new user
    public void newUser() {
        account1 = new Account(userField.getText(), Integer.parseInt(idField.getText()),0.00, new ArrayList<Transaction>());
        //account1.setName(userField.getText());
        //account1.setId(Integer.parseInt(idField.getText()));
        //account1.setBalance(0.00);
        //account1.setTransactions(null);
        accountArrayList.add(account1);
        //Account account1 = new Account(userField.getText(), Integer.parseInt(idField.getText()), 0.00);
        finalizeField.setText("**New Account Created**\n" + account1.toString());
        balanceField.setText("$0.00");
        validField.setText("Validated");
        //account1.clearTransactions();

    }

    // method to get an existing user
    public void existingUser() {
        int id = Integer.parseInt(idField.getText());
        //for (Account e: accountArrayList) {
        for (int i = 0; i<accountArrayList.size(); i++) {
            if (accountArrayList.get(i).getId() == id) {
                validField.setText("Validated");
                userField.setText(accountArrayList.get(i).getName());
                finalizeField.setText(accountArrayList.get(i).toString());
                balanceField.setText("$"+ String.valueOf(accountArrayList.get(i).getBalance()));
                account1 = accountArrayList.get(i);
                break;
            } else validField.setText("User Not Found");
        }
        //Account account1 = new Account(userField.getText(), Integer.parseInt(idField.getText()), 0.00);
        //finalizeField.setText(account1.toString());
        //balanceField.setText("$0.00");

    }

    public void makeWithdraw() {
        double amount = Double.parseDouble(withdrawField.getText());
        account1.withdraw(amount);
        balanceField.setText("$" + String.format("%.2f", account1.getBalance())); //String.valueOf(account1.getBalance()));
        withdrawField.setText("");
    }

    public void makeDeposit() {
        double amount = Double.parseDouble(depositField.getText());
        account1.deposit(amount);
        balanceField.setText("$" + String.format("%.2f", account1.getBalance())); //String.valueOf(account1.getBalance()));
        depositField.setText("");
    }

    public void finalizeTransactions() {
        finalizeField.setText(account1.toString());
    }

    public void clearAll() {
        userField.setText("");
        idField.setText("");
        validField.setText("");
        balanceField.setText("$");
        withdrawField.setText("");
        depositField.setText("");
        finalizeField.setText("");
    }







    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
