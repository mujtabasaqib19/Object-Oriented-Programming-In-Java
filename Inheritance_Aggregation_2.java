import java.util.Scanner;
class Persons {
    Scanner scanner = new Scanner(System.in);
    String CNIC, addres, nationality, name;
    int age;
    public Persons() {
        System.out.println("I am a person");
    }
    void input() {
        System.out.println("Enter name ");
        name = scanner.nextLine();
        System.out.println("Enter age ");
        age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter nationality ");
        nationality = scanner.nextLine();
        System.out.println("Enter Address ");
        addres = scanner.nextLine();
        System.out.println("Enter CNIC in disgits (0-9) ");
        CNIC = scanner.nextLine();
        while (CNIC.length()!=13) {
            System.out.println("Error, enter cnic again (in digits)! ");
            CNIC = scanner.nextLine();
        }
    }
    void display() {
        System.out.println("Name " + name);
        System.out.println("age " + age);
        System.out.println("nationality " + nationality);
        System.out.println("address " + addres);
        System.out.println("CNIC "+CNIC);
    }
}
class Employee extends Persons {
    String name_company, location;
    int years;
    public Employee() {
        super();
        System.out.println("I am Employee");
    }
    void input() {
        super.input();
        System.out.println("Enter name of company ");
        name_company = scanner.nextLine();
        System.out.println("Enter years worked ");
        years = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter Company location ");
        location = scanner.nextLine();
    }
    void display(){
        super.display();
        System.out.println("Company Name " + name_company);
        System.out.println("location " + location);
        System.out.println("years worked " + years);
    }

}
class Manager extends Employee {
    String[] emp;
    public Manager() {
        super();
        System.out.println("I am Manager");
    }
    void input() {
        super.input();
        System.out.println("Enter number of employees working ");
        int num=scanner.nextInt();
        emp=new String[num];

        for(int i=0;i<emp.length;i++){
            System.out.println("Enter name of employee ");
            emp[i]=scanner.next();
        }
    }
    void display(){
        super.display();
        for (int i=0;i<emp.length;i++){
            System.out.println("Name "+emp[i]);
        }
    }
}
public class Inheritance_Aggregation_2{
    public static void main(String[] args) {

        Manager M=new Manager();
        M.input();
        M.display();
    }
}

