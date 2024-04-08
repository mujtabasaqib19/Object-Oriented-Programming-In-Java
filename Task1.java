abstract class Bank {
    public abstract double getBalance();
}
class BankA extends Bank {
    private double balance;
    public BankA(double balance) {
        this.balance = balance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
class BankB extends Bank {
    private double balance;
    public BankB(double balance) {
        this.balance = balance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
class BankC extends Bank {
    private double balance;
    public BankC(double balance) {
        this.balance = balance;
    }
    @Override
    public double getBalance() {
        return balance;
    }
}
public class Task1 {
    public static void main(String[] args) {
        BankA A = new BankA(100);
        BankB B = new BankB(150);
        BankC C = new BankC(200);

        System.out.println("Bank A balance "+A.getBalance());
        System.out.println("Bank B balance "+B.getBalance());
        System.out.println("Bank C balance "+C.getBalance());
    }
}
