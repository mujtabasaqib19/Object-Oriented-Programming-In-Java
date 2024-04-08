import java.util.Scanner;
class Accounts {
    static int balance;
    public Accounts(int balance) {
        this.balance = balance;
    }
    public Accounts() {
    }
    void Debit(int withdraw){
        this.balance=balance-withdraw;
    }
    void Credit(int deposit){
        this.balance=balance+deposit;
    }
    void getBalance(){
    }
}
class SavingAccount extends Accounts{
    int time;
    int interestRate;
    int totalInterest;
    public SavingAccount(int balance, int time, int interest) {
        super(balance);
        this.time = time;
        this.interestRate=interest;

    }
    void CalculateInterest(){
        this.totalInterest=this.balance*this.interestRate*this.time;
    }
    @Override
    void Credit(int deposit) {
        super.Credit(deposit);
        balance+=this.totalInterest;
        System.out.println("Current Balance After Adding Interest "+this.balance);
    }
}
public class heirarichal_inheritance_polymorphism4{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Balance ");
        int a= sc.nextInt();
        System.out.println("Enter Interest Rate ");
        int b= sc.nextInt();
        SavingAccount s=new SavingAccount(a,12,b);
        s.CalculateInterest();
        s.Credit(4000);
    }

}

