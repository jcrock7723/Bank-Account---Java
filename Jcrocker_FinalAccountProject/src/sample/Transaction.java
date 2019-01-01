package sample;

import java.util.Date;

public class Transaction {

    private java.util.Date timestamp;
    private char type;
    private double amount;
    private double balance;
    private String description;



    public Transaction( char type, double amount, double balance, String description) {
        timestamp = new java.util.Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "\nTransaction{" +
                "timestamp=" + timestamp +
                ", type=" + type +
                ", \n\t\tamount=$" + String.format("%.2f", amount) +
                ", balance=$" + String.format("%.2f", balance) +
                ", description='" + description +
                '}';
    }
}
