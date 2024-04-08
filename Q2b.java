import java.util.Scanner;
public class Q2b {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Height and base of Triangle ");
        int height=scanner.nextInt();
        int base=scanner.nextInt();
        double area=0.5*height*base;

        System.out.println("area of triangle is "+area);
        scanner.close();
    }
}
