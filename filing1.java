import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class filing1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("mujidon.txt");

        try {
            if (f.createNewFile()) {
                System.out.println("created");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
        ArrayList<Integer> list=new ArrayList<>();
        System.out.println("Enter Five Elements ");
        for(int i=0;i<5;i++){
            int m=sc.nextInt();
            list.add(i,m);
        }
        try {
            FileWriter fileWriter=new FileWriter(f);
            for(int i=0;i<5;i++) {
                fileWriter.write(""+list.get(i)+"\n");
            }

            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if(f.delete()){
            System.out.println("File has been Successfully deleted ");
        }
        else {
            System.out.println("Error");
        }

    }
}
