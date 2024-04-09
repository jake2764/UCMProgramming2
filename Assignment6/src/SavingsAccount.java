//Jake Beahan
//Assignment 6 - SavingsAccount.java
//Mar 17 2024

public class SavingsAccount extends Account{

    private double annualInterestRate;

    public SavingsAccount(){
        this.annualInterestRate = 0.0;
        setBalance(0.0);
        setID(0);
    }

    public SavingsAccount(int id, double balance, double annualInterestRate){
        setID(id);
        setBalance(balance);
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public String toString(){
        return "Savings Account\nID: " + getID() + "\nBalance: $" + getBalance() + "\nAnnual Interest Rate: " + annualInterestRate + "\nDate Created: " + getDateCreated();
    }
}