import java.util.Scanner;

public class ATMApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account myAccount = new Account();

    System.out.println("Welcome to Java ATM!");

    System.out.print("Enter your PIN: ");

    int enteredPin = sc.nextInt();

    if (myAccount.checkPin(enteredPin)) {
      int choice;
      do {
        System.out.println("\n1. Check Balance  \n2. Deposit  \n3. Withdraw  \n4. Change PIN  \n5. Exit");

        System.out.print("Choose an option: ");

        choice = sc.nextInt();

        switch (choice) {
          case 1:
            System.out.println("Current Balance: " + myAccount.getBalance());
            break;
          case 2:
            System.out.print("Enter amount to deposit: ");
            double dAmount = sc.nextDouble();
            myAccount.deposit(dAmount);
            break;
          case 3:
            System.out.print("Enter amount to withdraw: ");
            double wAmount = sc.nextDouble();
            myAccount.withdraw(wAmount);
            break;
          case 4:
            System.out.print("Enter your Current PIN: ");
            int currentPIN = sc.nextInt();
      
            System.out.print("Enter your new PIN: ");
            int newPIN = sc.nextInt();

            myAccount.setPIN(currentPIN, newPIN);
            break;
        }
      } while (choice != 5);
      System.out.println("Thank you for using our ATM!");
    } else {
      System.out.println("Wrong PIN! Access Denied.");
    }
  }
}