import java.util.Scanner;
public class exception3 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int fact = 1;
        int n = 0;
        String num;
        System.out.println("Enter Number : ");
        num = Input.nextLine();
        try {
            n = Integer.parseInt(num);
        } catch (NullPointerException e) {
            System.out.println(e);
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.exit(0);
        }
        if (n < 0) {
            System.out.println(n + " Is A Negative Number.");
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
            if (fact < 0) {
                System.out.println("Integer Input Is Too Large.");
            } else {
                System.out.println("Factorial Of " + n + " Is " + fact+"...");
            }
        }

    }
}

