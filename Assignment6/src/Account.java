//Jake Beahan
//Assignment 6 - Account.java
//Mar 17 2024

import java.util.Date;

public class Account {

    private int id;
    private double balance;
    private Date dateCreated = new Date();


    public Account(){
        id = 0;
        balance = 0.0;
    }

    public Account(int id, double balance){
        this.id = id;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String toString(){
        return "Account\nID: " + id + "\nBalance: $" + balance + "\nDate Created: " + dateCreated;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount;
    }
}