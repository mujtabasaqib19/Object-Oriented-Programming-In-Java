import java.util.Scanner;
class Robot {
    int x;
    int y;
    String direction;

    public Robot(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }
    Robot(){

    }
    void display(){
        System.out.println("Initial Direction "+this.x+","+this.y+ ""+this.direction);
    }
}
class MovingRobot extends Robot{
    Scanner sc=new Scanner(System.in);
    public MovingRobot(int x, int y, String direction) {
        super(x, y, direction);
    }
    void moveRobot(int m){
        System.out.println("Enter Direction : ");
        this.direction=sc.next();

        switch(this.direction){
            case "N":
                this.y=this.y+m;
                break;
            case "E":
                this.x=this.x+m;
                break;
            case "S":
                this.y=this.y-m;
                break;
            case "W":
                this.x=this.x-m;
                break;
            default:
                System.out.println("Invalid Input ");
                break;
        }
    }
    @Override
    void display() {

        System.out.println("\nX coordinate "+this.x+"\ny coordinate "+this.y+"\nFacing Direction "+this.direction);
    }
}
public class heirarichal_inheritance_polymorphism3
{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        MovingRobot m=new MovingRobot(4,5,"N");
        System.out.println("Enter no of Steps ");
        int n= sc.nextInt();
        m.moveRobot(n);
        m.display();

    }
}


