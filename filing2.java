import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class filing2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("mujtaba.txt");

        try {
            if (f.createNewFile()) {
                System.out.println("created");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        try {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write("Mujtaba Saqib");
            fileWriter.write("\nI completed my A levels form Highbrow and cuurently doing AI from Fast");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fr = new FileReader(f);
            int i;
            while ((i = fr.read())!= -1)
                System.out.print((char)i);
            fr.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
