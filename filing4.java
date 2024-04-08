import java.io.*;
import java.util.*;
public class filing4 {

    public static void writeArray(int[] arr, ObjectOutputStream oos) throws IOException {
        oos.writeInt(arr.length);
        for (int num : arr) {
            oos.writeInt(num);
        }
    }

    public static int[] readArray(ObjectInputStream ois) throws IOException {
        int len = ois.readInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = ois.readInt();
        }
        return arr;
    }

    public static int[] segregateArray(int[] arr) {
        int[] res = new int[arr.length];
        int even = 0;
        int odd = arr.length - 1;
        for (int num : arr) {
            if (num % 2 == 0) {
                res[even] = num;
                even++;
            } else {
                res[odd] = num;
                odd--;
            }
        }
        int left = even;
        int right = arr.length - 1;
        while (left < right) {
            int temp = res[left];
            res[left] = res[right];
            res[right] = temp;
            left++;
            right--;
        }
        return res;
    }

    public static void main(String[] args) {
        String fileName = "student_details.txt";
        File file = new File(fileName);
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            oos.writeUTF("Mujtaba Saqib");
            oos.writeInt(20);
            oos.writeUTF("football, cricket, running");
            int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            writeArray(arr, oos);
            oos.flush();
            String name = ois.readUTF();
            int age = ois.readInt();
            String hobbies = ois.readUTF();
            int[] arr2 = readArray(ois);
            System.out.println("Name  : " + name);
            System.out.println("Age   : " + age);
            System.out.println("Hobbies  : " + hobbies);
            System.out.println("Array  : " + Arrays.toString(arr2));
            int[] arr3 = segregateArray(arr2);
            System.out.println("Modified array  : " + Arrays.toString(arr3));
            writeArray(arr3,oos);
            oos.flush();
            int[] arr4 = readArray(ois);
            System.out.println("Array from file  : " + Arrays.toString(arr4));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
