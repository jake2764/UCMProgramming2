//Jake Beahan
//Assignment 6 - CheckingAccount.java
//Mar 17 2024

public class CheckingAccount extends Account{
    private double overdraft;


    public CheckingAccount(){
        this.overdraft = 0.0;
        setBalance(0.0);
        setID(0);
    }

    public CheckingAccount(int id, double balance, double overdraft){
        setID(id);
        setBalance(balance);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public String toString(){
        return "Checking Account\nID: " + getID() + "\nBalance: $" + getBalance() + "\nOverdraft: $" + overdraft + "\nDate Created: " + getDateCreated();
    }
}