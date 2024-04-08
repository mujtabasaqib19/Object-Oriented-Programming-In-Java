import java.lang.Math;
import java.util.Scanner;
public class Question4 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers ");

        double a= scanner.nextDouble();
        double b= scanner.nextDouble();
        double c= scanner.nextDouble();
        double root1= (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
        double root2= (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);

    System.out.println("The two roots are "+root1+" and "+root2);
        scanner.close();

    }

}
