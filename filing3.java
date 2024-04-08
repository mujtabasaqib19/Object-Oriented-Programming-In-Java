import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class filing3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("K224005.txt");

        try {
            if (f.createNewFile()) {
                System.out.println("created");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        int[] arr=new int[5];
        System.out.println("Enter Five Elements ");
        for(int i=0;i< arr.length;i++) {
            arr[i]=sc.nextInt();
        }

        try
        {
            FileWriter fileWriter = new FileWriter(f);
            fileWriter.write("Mujtaba Saqib");
            fileWriter.write("\nI completed my A levels form Highbrow and cuurently doing AI from Fast");
            for (int i=0;i< arr.length;i++) {
                fileWriter.write("\n"+arr[i]);
            }
            fileWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader fr = new FileReader(f);
            int i;
            while ((i = fr.read())!= -1) {
                System.out.print((char) i);
            }
            fr.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
