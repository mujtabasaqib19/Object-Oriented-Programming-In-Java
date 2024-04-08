class Teacher {
    String name;
    public Teacher(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class Department {
    int teacher_count,max_teachers;
    String name;
    Teacher[] teachers;
    public Department(String name, int max_teachers) {
        this.name = name;
        this.teachers = new Teacher[max_teachers];
        this.teacher_count = 0;
        this.max_teachers = max_teachers;
    }
    public boolean addTeacher(Teacher teacher) {
        if (teacher_count < max_teachers) {
            teachers[teacher_count] = teacher;
            teacher_count++;
            return true;
        }
        return false;
    }
    public String getName() {
        return name;
    }
    public Teacher[] getTeachers() {
        return teachers;
    }

}

class School {
    int department_count, max_departments;
    String name;
    Department[] departments;
    public School(String name, int maxDepartments) {
        this.name = name;
        this.max_departments = maxDepartments;
        this.departments = new Department[maxDepartments];
        this.department_count = 0;
    }


    public boolean addDepartment(Department department) {
        if (department_count < max_departments) {
            departments[department_count] = department;
            department_count++;
            return true;
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public Department[] getDepartments() {
        return departments;
    }
    public void printSchoolDetails(){
        System.out.println("School " + name);
        for (int i=0;i<departments.length; i++) {
            Department department = departments[i];

            if (department!=null) {
                System.out.println("Department "+department.getName());

                Teacher[] teachers = department.getTeachers();
                for (int t=0;t<teachers.length;t++) {
                    Teacher teacher = teachers[t];

                    if (teacher!= null) {
                        System.out.println("Teacher Name\n" + teacher.getName());
                    }}}}}}
public class Inheritance_Aggregation_4 {
    public static void main(String[] args) {
        Teacher maths = new Teacher("Sir Shafique");
        Teacher maths2 = new Teacher("Sir Usman");
        Teacher science = new Teacher("Sir mehboob");

        Department mathDept = new Department("Maths", 3);
        Department scienceDept = new Department("Science", 3);
        School beaconhouse = new School("Beaconhouse School System", 3);

        mathDept.addTeacher(maths);
        mathDept.addTeacher(maths2);
        scienceDept.addTeacher(science);
        beaconhouse.addDepartment(mathDept);
        beaconhouse.addDepartment(scienceDept);

        beaconhouse.printSchoolDetails();
    }
}
