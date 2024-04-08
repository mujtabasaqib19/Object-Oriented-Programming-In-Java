class Course {
    protected String coursename,code,venue,hrs;
    public Course() {
    }
    public Course(String coursename, String code, String venue, String hrs) {
        this.coursename = coursename;
        this.code = code ;
        this.venue = venue;
        this.hrs = hrs;
    }
}
class JavaCourse extends Course {
    String teacher;
    public JavaCourse(String teacher, String coursename, String code, String venue, String hrs) {
        super(coursename, code, venue, hrs);
        this.teacher = teacher;
    }
    void display() {
        System.out.println("Teacher " + teacher);
        System.out.println("course name " + coursename + "\ncode " + code + "\nvenue " + venue + "\nhours " + hrs);
    }
}
public class Inheritance_Aggregation_1  {
    public static void main (String[]args){
        JavaCourse j=new JavaCourse("baneen","oop","AI3445","B10","3");
        j.display();
    }
}