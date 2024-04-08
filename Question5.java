import java.util.Scanner;
public class Question5
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter three numbers ");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        int num3=scanner.nextInt();
        int sum=num1+num2+num3;
        float avg= (num1+num2+num3)/3;
        int product=num1*num2*num3;

        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
        System.out.println("Product is "+product);

        scanner.close();
}
}