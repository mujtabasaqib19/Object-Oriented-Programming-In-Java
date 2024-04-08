import java.util.Scanner;
public class Question7 {
 public static void main(String[] args)
    {
     Scanner scanner= new Scanner(System.in);
     System.out.println("Enter your name, Student ID and courses Registered ");

     String name=scanner.nextLine();
     String id=scanner.nextLine();
     String course1=scanner.nextLine();
     String course2=scanner.nextLine();
     String course3=scanner.nextLine();

     System.out.println("Name "+name);
     System.out.println("ID "+id);
     System.out.println("\nCourse Registered are\n");
     System.out.println("Course 1 "+course1);
     System.out.println("Course 2 "+course2);
     System.out.println("Course 3 "+course3);

     scanner.close();
    }
}
