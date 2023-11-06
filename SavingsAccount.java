import java.util.*;

public class SavingsAccount {
    private double balance;
    public static double interestRate = 0; 

    public SavingsAccount() {
        this.balance = 0;
    }

    public static void setInterestRate(double newRate) {
        interestRate = newRate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public double withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return amount;
        } else {
            return 0;
        }
    }

    public void addInterest() {
        double interest = balance * interestRate;
        this.balance += interest;
    }

    public static void showBalance(SavingsAccount account) {
        System.out.println("The Current Balance is " + account.getBalance());
    }
}

public class RunSavingsAccount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SavingsAccount savings = new SavingsAccount();

        System.out.println("Enter Interest Rate: ");
        double interestRate = s.nextDouble();
        SavingsAccount.setInterestRate(interestRate);

        System.out.println("Enter Deposit Amount: ");
        double depositAmount = s.nextDouble();
        savings.deposit(depositAmount);

        while (true) {
            System.out.println("Press D for another deposit or W to withdraw: ");
            String input = s.next();

            if (input.equalsIgnoreCase("D")) {
                System.out.println("Enter Deposit Amount: ");
                double deposit = s.nextDouble();
                savings.deposit(deposit);

               System.out.println("Your new Balance is " + savings.getBalance());
            } else if (input.equalsIgnoreCase("W")) {
                System.out.println("Your new Balance is " + savings.getBalance());
                System.out.println("Thank you for Withdrawing, have a nice day.");
                break;
            } else {
                System.out.println("Wrong Input, please try again!");
            }
        }
    }
}
