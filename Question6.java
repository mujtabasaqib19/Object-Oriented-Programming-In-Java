import java.util.Scanner;
public class Question6 {
    public static void main(String[] args)
    {
     Scanner scanner=new Scanner(System.in);

     System.out.println("Enter radius ");
     float r= scanner.nextFloat();
     float a= 3.14159f*r*r;
     float cir= 2*3.14159f*r;
     float d= 2*r;

     System.out.println("Diameter of circle is "+d+" Circumfrence is "+cir+" Area is "+a);
     scanner.close();

    }
    }