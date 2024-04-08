import java.util.Scanner;
public class exception4 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        String num1, num2;
        int n1 = 0,n2=0,r=0;
        System.out.println("Enter 1st Number : ");
        num1 = Input.nextLine();
        System.out.println("Enter 2nd Number : ");
        num2 = Input.nextLine();
        try {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
            r = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println(e);
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.exit(0);
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.exit(0);
        }
        System.out.println(n1 + " Divided By " + n2 + " Is " + r);

    }

}

