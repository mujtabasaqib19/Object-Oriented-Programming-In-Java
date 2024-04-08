import java.io.*;
import java.util.Scanner;
public class filing5 {
    public static void main(String[] args) {
        File filePath=new File("Confidential.txt");
        try {
            filePath.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your designation (Faculty/Student):  ");
        String designation = sc.nextLine();
        sc.close();
        File file = new File("Confidential.txt");

        boolean facultyAccess = designation.equals("Faculty");
        boolean studentAccess = designation.equals("Student");
        if (!facultyAccess && !studentAccess) {
            System.out.println("Invalid designation entered.");
        }
        boolean Check = file.setReadable(facultyAccess, studentAccess);
        Check = Check && file.setWritable(facultyAccess, false);
        Check = Check &&  file.setExecutable(facultyAccess, false);
        if (Check) {
            System.out.println("Access rights assigned successfully.");

        } else {
            System.out.println("Failed to assign access rights.");

        }
        System.out.println("File access status:");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Executable: " + file.canExecute());
    }

}

