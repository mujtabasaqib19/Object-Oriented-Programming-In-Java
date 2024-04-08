abstract class Animals {
    abstract void cats();
    abstract void dogs();
}
class Cats extends Animals {
    @Override
    public void cats() {
        System.out.println("Meow Meow Meow Meow");
    }
    @Override
    public void dogs() {
    }
}
class Dogs extends Animals {
    @Override
    public void cats() {
    }
    @Override
    public void dogs() {
        System.out.println("Bark Bark Bark Bark");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Cats c = new Cats();
        Dogs d = new Dogs();

        c.cats();
        d.dogs();
    }
}
