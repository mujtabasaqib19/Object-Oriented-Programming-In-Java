//q5 lab3
import java.util.Scanner;
public class BankAccount {
    private String acc_num;
    private String acc_owner;
    private double balance;
    public BankAccount(String acc_num, String acc_owner, double balance) {
        this.acc_num = acc_num;
        this.acc_owner = acc_owner;
        this.balance = balance;
    }
    public void setAcc_num(String acc_num) {
        this.acc_num = acc_num;
    }
    public void setAcc_owner(String acc_owner) {
        this.acc_owner = acc_owner;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public String getAcc_num() {
        return acc_num;
    }

    public String getAcc_owner() {
        return acc_owner;
    }

    public void deposit(double amount) {
        if(amount>0)
        {
            balance += amount;
            System.out.println("Deposit successful");
        }
        else
        {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw(double amount) {
        if(amount>0 & balance>=amount)
        {
            balance=balance-amount;
            System.out.println("withdrawl successful");
        }
            else if ( amount<0 || amount>balance )
            {
                System.out.println("Not enough amount to do transaction");
            }
        else
        {
            System.out.println("Invalid withdrawal amount");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BankAccount b1=new BankAccount("223243","Mujtaba",78900.87);

        System.out.println("Enter 1.deposit\n2.withdrawal ");
        int choice=scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter amount to deposit ");
                double depositAmount=scanner.nextDouble();
                b1.deposit(depositAmount);
                break;

            case 2:
                System.out.print("Enter amount to withdraw ");
                double withdrawAmount=scanner.nextDouble();
                b1.withdraw(withdrawAmount);
                break;

            default:
                System.out.println("Invalid choice");
        }
        System.out.println("\nAccount Details:");
        System.out.println("Account Number " + b1.getAcc_num());
        System.out.println("Account Owner " + b1.getAcc_owner());
        System.out.println("Balance " + b1.getBalance());

        scanner.close();
    }
}
