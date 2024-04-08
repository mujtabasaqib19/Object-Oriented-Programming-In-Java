class Vehicle {
    int speed,wheel;
    String color;

    public Vehicle() {
    }

    public Vehicle(int speed, int wheel, String color) {
        this.speed = speed;
        this.wheel = wheel;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWheel(int wheel) {
        this.wheel = wheel;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWheel() {
        return wheel;
    }

    public String getColor() {
        return color;
    }
}
class MotorVehicle extends Vehicle{
    String license_plate;
    public MotorVehicle() {
        super(400,4,"Silver");
    }

    public void setLicense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

    public String getLicense_plate() {
        return license_plate;
    }
}
class Car extends MotorVehicle {
    int doors;

    public Car() {
        super();
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;

    }
    void display(){
        System.out.println("Speed of Car "+getSpeed()+"\nNo. of wheels "+getWheel()+"\nno of doors "+getDoors()+"\nCar color "+getColor()+"\nCar License Plate "+getLicense_plate());
    }
}
public class Inheritance_Aggregation_3 {
    public static void main(String[] args) {
        Car car=new Car();
        car.setDoors(4);
        car.setLicense_plate("BGU-965");
        car.display();
    }
}