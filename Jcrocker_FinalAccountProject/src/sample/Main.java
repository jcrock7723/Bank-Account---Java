package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.Scanner;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Account Transaction Home");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        launch(args);

        // For Testing
        /*Account account = new Account("George", 1122, 1000);
        account.withdraw(100);
        account.deposit(2500);
        System.out.println(account.toString());*/


    }




}
