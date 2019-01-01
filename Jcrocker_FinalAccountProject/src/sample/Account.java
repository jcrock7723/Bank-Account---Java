package sample;


import java.util.ArrayList;
import java.util.Date;

public class Account {

    //define variables
    private  String name;
    private int id;
    private double balance;
    private java.util.Date created;
    private ArrayList<Transaction> transactions = new ArrayList<>();


    // default constructor
    public Account() {
        created = new java.util.Date();
    }

    public Account(String name, int id, double balance, ArrayList transactions) {
        this.name = name;
        this.id = id;
        this.balance = balance;
        created = new java.util.Date();
        this.transactions = transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public void withdraw(double amount) {
        balance -= amount;
        transactions.add(new Transaction('W', amount, balance, "Withdrawal"));
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction('D', amount, balance, "Deposit"));
    }

    @Override
    public String toString() {
        return "Account Info; " +
                "Owner: " + name +
                ", Id number: " + id +
                ", Balance: $" + String.format("%.2f", balance) +
                ", Created: " + created +
                ", \n] **Transactions** " + transactions.toString();
    }

    public void clearTransactions() {
        transactions.clear();
    }
}
