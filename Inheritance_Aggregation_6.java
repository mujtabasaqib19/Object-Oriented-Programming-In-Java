class Rectangle {
    int length,width;
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    int Area() {
        return length*width;
    }
    int Perimeter() {
        return 2*(length + width);
    }
}
class Square extends Rectangle {
    public Square(int len) {
        super(len,len);
    }
}
public class Inheritance_Aggregation_6 {
    public static void main(String[] args) {
        Rectangle R = new Rectangle(8, 5);
        int areaRectangle = R.Area();
        int perimeterRectangle = R.Perimeter();
        System.out.println("Area of rectangle " + areaRectangle);
        System.out.println("Perimeter of rectangle " + perimeterRectangle);

        Square S = new Square(10);

        int areaSquare = S.Area();
        int perimeterSquare = S.Perimeter();

        System.out.println("Area of square " +areaSquare);
        System.out.println("Perimeter of square " +perimeterSquare);
    }
}
