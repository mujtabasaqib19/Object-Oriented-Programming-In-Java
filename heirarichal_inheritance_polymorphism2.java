class Person{
    String name,email,Phonenum;

    public Person(String name, String email, String phonenum) {
        this.name = name;
        this.email = email;
        this.Phonenum = phonenum;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Phonenum='" + Phonenum + '\'' +
                '}';
    }
}
class Student extends Person{
    String studentid,major;
    double gpa;

    public Student(String name, String email, String phonenum, String studentid, String major,double gpa) {
        super(name, email, phonenum);
        this.studentid = studentid;
        this.major = major;
        this.gpa=gpa;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        super.toString();
        return "Student{" +
                "studentid='" + studentid + '\'' +
                ", major='" + major + '\'' +
                ", gpa=" + gpa +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Phonenum='" + Phonenum + '\'' +
                '}';
    }
}
class Faculty extends Person {
    String facultyid, department, rank;

    public Faculty(String name, String email, String phonenum, String facultyid, String department, String rank) {
        super(name, email, phonenum);
        this.facultyid = facultyid;
        this.department = department;
        this.rank = rank;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Faculty{" +
                "facultyid='" + facultyid + '\'' +
                ", department='" + department + '\'' +
                ", rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Phonenum='" + Phonenum + '\'' +
                '}';
    }
}

class Staff extends Person{
    String Staffid,jobtitle;
    double  salary;

    public Staff(String name, String email, String phonenum, String staffid, String jobtitle,double salary) {
        super(name, email, phonenum);
        Staffid = staffid;
        this.jobtitle = jobtitle;
        this.salary=salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        super.toString();
        return "Staff{" +
                "Staffid='" + Staffid + '\'' +
                ", jobtitle='" + jobtitle + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", Phonenum='" + Phonenum + '\'' +
                '}';
    }
}

public class heirarichal_inheritance_polymorphism2  {
    public static void main(String[] args) {
        Person person=new Person("Muji","mujtaba.saqib58@gmail.com","03174441705");
        Student student=new Student("Hilal","hilal@gmail.com","0317998900","k22-4005","AI",3.2);
        Faculty faculty=new Faculty("Ali","ali.@gmail.com","023920932121","k122333","CS","Professor");
        Staff staff =new Staff("Atta","atta.@gmail.com","20382310211","k228767","teacher",823472);

        System.out.println(student.getGpa());
        System.out.println('\n');
        System.out.println(faculty.getRank());
        System.out.println('\n');
        System.out.println(staff.getSalary());
        System.out.println('\n');
        System.out.println(person.toString());
        System.out.println('\n');
        System.out.println(student.toString());
        System.out.println('\n');
        System.out.println(faculty.toString());
        System.out.println('\n');
        System.out.println(staff.toString());
    }
}
