import java.util.Scanner;
interface BankAccount{
    void deposit(double amount);
    void withdraw(double amount);
    double Getbalance();
}
class SavingAccount implements BankAccount{
    static private double Balance;
    public SavingAccount() {
    }
    @Override
    public void deposit(double amount) {
    Balance=Balance+amount;
        System.out.println("Your deposited "+amount+" Your new new balance is "+Balance);
    }
    @Override
    public void withdraw(double amount) {
    if(Balance>=amount){
        Balance=Balance-amount;
    }
    else{
        System.out.println("Insufficient balance to withdraw");
    }
    }
    @Override
    public double Getbalance() {
        return Balance;
    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SavingAccount savingAccount=new SavingAccount();
        int n=0;
        while(n!=4){
            System.out.println("(1) for deposit\n2) for withdraw\n3) to get total balance\n4) for exit the application\n");
            n = scanner.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter amount to deposit ");
                    double x = scanner.nextDouble();
                    savingAccount.deposit(x);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw ");
                    double y = scanner.nextDouble();
                    savingAccount.withdraw(y);
                    break;
                case 3:
                    System.out.println(savingAccount.Getbalance());
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice enter again");
                    break;
            }
        }

    }
}