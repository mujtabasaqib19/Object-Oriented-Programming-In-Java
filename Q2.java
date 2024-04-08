import java.util.ArrayList;
class Stack<T> {
    int count=0;
    ArrayList<T> list;

    public Stack() {
        list = new ArrayList<T>();
    }
    public void push(T element) {
        list.add(element);
        count++;
    }
    public T pop() {
        if (isEmpty()) {
            return null;
        }
        count--;
        return list.remove(list.size() - 1);
    }
    public T peek() {
        if (isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void show() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("Size of list "+count);
    }

    public void descendingOrder() {
        ArrayList<T> Slist = new ArrayList<>(list);

        for (int i = 0; i < Slist.size(); i++) {
            for (int j = i + 1; j < Slist.size(); j++) {
                if (Slist.get(i).toString().compareTo(Slist.get(j).toString()) < 0) {
                    T temp = Slist.get(i);
                    Slist.set(i, Slist.get(j));
                    Slist.set(j, temp);
                }
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Stack<Integer> S1 = new Stack<Integer>();
        S1.push(45);
        S1.push(65);
        S1.push(14);
        S1.push(66);
        S1.push(41);
        S1.show();
        S1.descendingOrder();
        S1.show();

        Stack<String> S2 = new Stack<String>();
        S2.push("mujtaba");
        S2.push("hilal");
        S2.push("muneeb");
        S2.push("moosa");
        S2.push("mughal");

        S2.show();
        S2.descendingOrder();
        S2.show();
    }
}
