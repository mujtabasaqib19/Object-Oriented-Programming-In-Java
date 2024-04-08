import java.util.ArrayList;

class Queue<T> {
    int n=0;
    ArrayList<T> list;
    public Queue() {
        list = new ArrayList<>();
    }

    public void enqueue(T element) {
        list.add(element);
        n++;
    }

    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        n--;
        return list.remove(0);
    }

    public T front() {
        if (isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }
    public void display() {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\nSize of list "+n);
    }

    public void Highest() {
        ArrayList<T> Tlist = new ArrayList<>(list);

        for (int i = 0; i < Tlist.size(); i++) {
            for (int j = i + 1; j < Tlist.size(); j++) {
                if (Tlist.get(i).toString().compareTo(Tlist.get(j).toString()) < 0) {
                    T temp = Tlist.get(i);
                    Tlist.set(i, Tlist.get(j));
                    Tlist.set(j, temp);
                }
            }
        }
        System.out.println("ArrayList in descending order ");
        display();

        System.out.println("\nThe maximum element in list " + Tlist.get(0));
        System.out.println("\nThe second maximum element in list " + Tlist.get(1));
    }
}

public class Q1 {
    public static void main(String[] args) {

        Queue<Integer> q1 = new Queue<>();
        q1.enqueue(14);
        q1.enqueue(56);
        q1.enqueue(37);
        q1.enqueue(57);
        q1.enqueue(55);
        System.out.println("The integer list is\n");
        q1.display();
        q1.Highest();
        System.out.println("\nThe dequeued element is\n" + q1.dequeue());
        System.out.println("\nThe integer list after dequeue is\n");
        q1.display();

        Queue<String> q2 = new Queue<>();
        q2.enqueue("mujtaba");
        q2.enqueue("ali");
        q2.enqueue("attaullah");
        q2.enqueue("hilal");
        q2.enqueue("Muneeb");
        System.out.println("\nThe string list is ");
        q2.display();
        q2.Highest();
        System.out.println("\nThe dequeued list element is\n" + q2.dequeue());
        System.out.println("\nThe string list after dequeue is\n");
        q2.display();
    }
}
