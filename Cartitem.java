//Q1 LAB 3
public class Cartitem {
String productname;
int quantity;
double price;

    public Cartitem(String productname, int quantity, double price) {
        this.productname = productname;
        this.quantity = quantity;
        this.price = price;
    }
    public double calculateTotalPrice(){
        return price*quantity;
    }
    public void displayCartItemDetails() {
        double total_bill= calculateTotalPrice();
        System.out.println("Product name "+productname);
        System.out.println("Product quantity "+quantity);
        System.out.println("Product price "+price);
        System.out.println("total bill  "+total_bill);
    }
        public static void main (String[] args) {
        Cartitem k1= new Cartitem("kitkat",26,150);
        Cartitem m2= new Cartitem("Mars",15,200);

            k1.displayCartItemDetails();
            System.out.println("\n");
            m2.displayCartItemDetails();

    }
}

