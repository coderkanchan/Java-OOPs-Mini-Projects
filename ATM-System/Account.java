//package ATM-System;

public class Account {
  private int pin = 1234;
  private double balance = 5000.5;

  public double getBalance() {
    return balance;
  }

  public boolean checkPin(int inputPin) {
    return this.pin == inputPin;
  }

  public void deposit(double amount) {
    if (amount > 0) {
      balance += amount;
      System.out.println("Successfully deposited :" + amount + "your total balance is :" + balance);
    }
  }

  public void withdraw(double amount) {
    if (amount > balance) {
      System.out.println("Insufficient funds!");
    } else {
      balance -= amount;
      System.out.println("Please collect your cash:" + amount);
      System.out.println("now your current balance is :" + balance);
    }
  }

  public void setPIN(int oldPIN, int newPIN) {
    if (this.pin == oldPIN) {
      this.pin = newPIN;
      System.out.println("PIN successfully changed!");
    }else if(this.pin == newPIN){
      System.out.println("PIN already in use Transaction failed.");
    }
     else {
      System.out.println("Old PIN is incorrect. Transaction failed.");
    }
  }
}
