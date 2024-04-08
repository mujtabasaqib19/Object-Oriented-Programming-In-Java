//q1
import java.util.ArrayList;
public class exception {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("5");
        list.add("2");
        list.add("C");
        list.add("B");
        list.add("5");

        if (list == null || list.isEmpty()) {
            System.out.println("List Is Empty.");
        }

        double avg = 0;
        int non_numeric = 0;

        for (int i = 0; i < list.size(); i++) {
            try {
                int num = Integer.parseInt(list.get(i));
                avg += num;
            } catch (NumberFormatException e) {
                non_numeric++;
                System.out.println(e);
            }
        }

        if (non_numeric == list.size()) {
            System.out.println("All Values Are Non Numeric.");
        } else {
            avg /= list.size() - non_numeric;
            System.out.println("Average Of Numbers Is : " + avg);
        }

    }
}
