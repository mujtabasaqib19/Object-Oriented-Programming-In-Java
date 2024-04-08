import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Two numbers ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int subs = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;

        System.out.println("Sum is "+sum+" Substraction is "+subs+" Product is "+product+ " Division is "+div);

        scanner.close();
        }
}
