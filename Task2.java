import java.util.Scanner;
abstract class Marks {
    abstract double getPercentage();
}
class MarksA extends Marks {
    double physics, Maths, Chemistry;
    public MarksA(double physics, double maths, double chemistry) {
        this.physics = physics;
        Maths = maths;
        Chemistry = chemistry;
    }
    @Override
    double getPercentage() {
        return ((physics+Maths+Chemistry)/300)*100;
    }
}
class MarksB extends Marks {
        double Biology, English, Urdu, Science;
        public MarksB(double biology, double english, double urdu, double science) {
            Biology = biology;
            English = english;
            Urdu = urdu;
            Science = science;
        }
        @Override
    double getPercentage() {
            return ((Biology+English+Urdu+Science)/400)*100;
        }
}
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter Physics ,Maths and Chemistry Marks ");
        double a=scanner.nextInt();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();

        MarksA marksA=new MarksA(a,b,c);

        System.out.println("Enter Biology,English,Urdu and Add Maths Marks ");
        double d=scanner.nextInt();
        double e=scanner.nextDouble();
        double f=scanner.nextDouble();
        double g= scanner.nextDouble();

        MarksB marksB=new MarksB(d,e,f,f);

        System.out.println("Percentage of Sheri "+marksA.getPercentage());
        System.out.println("Percentage of Mujtaba "+marksB.getPercentage());

    }
}
