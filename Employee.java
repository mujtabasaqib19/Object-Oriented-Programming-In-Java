public class Employee {
    String fname;
    String lname;
    double salary;

    public Employee(String fname, String lname, double salary) {
        this.fname = fname;
        this.lname = lname;
        if(salary<=0.0){
            this.salary = 0.0;
        } else {
            this.salary = salary;
        }
    }
    public void Print() {
        System.out.println("Yearly salary " +(salary*12)+ "of " +fname);
    }
    public void increment() {
        salary=(salary*0.10)+salary;
    }

    public static void main(String[] args) {
        Employee E1 = new Employee("Mujtaba", "Saqib", 78000);
        Employee E2 = new Employee("Arsal", "Naveed", 67000);

        System.out.println("Initial Yearly Salaries:");
        E1.Print();
        E2.Print();

        E1.increment();
        E2.increment();

        System.out.println("\nAfter 10% increment:");
        E1.Print();
        E2.Print();
    }
}
