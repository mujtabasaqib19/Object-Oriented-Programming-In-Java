import java.util.Scanner;
public class Question2{
public static void main(String[] args){
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter Two numbers ");
    double num1 = scanner.nextDouble();
    double num2 = scanner.nextDouble();
    double product = num1*num2;

    System.out.println("Product of two numbers is "+product);

    scanner.close();
}
}
