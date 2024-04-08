//Q2 LAB3
import java.util.Scanner;

public class Item {
    String itemName;
    String itemID;
    private double price;
    private int stock;

    public Item(String itemName, String itemID) {
        this.itemName = itemName;
        this.itemID = itemID;
        this.price = 0.0;
        this.stock = 0;
    }
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public void Print() {
        System.out.println("Item Name " + itemName);
        System.out.println("Item ID " + itemID);
        System.out.println("Price " + price);
        System.out.println("total stock " +stock);
    }
    public void stock_update(int quantity) {
        if (quantity>stock) {
            System.out.println("Cannot purchase more items than available in stock.");
        } else {
            double totalBill = quantity * price;
            System.out.println("Purchased " + quantity + " " + itemName + " for a total of " + totalBill);
            stock -= quantity;
        }
    }

    public static void main(String[] args) {
        Item item1 = new Item("Iphone 12", "432");
        Item item2 = new Item("Android TV", "765");
        Item item3 = new Item("Printer", "222");

        item1.setPrice(12000);
        item1.setStock(12);

        item2.setPrice(5000);
        item2.setStock(3);

        item3.setPrice(3500);
        item3.setStock(6);

        Scanner device = new Scanner(System.in);

        System.out.println("Enter item ID:\n432 for Iphone 12\n765 for Android TV\n222 for Printer");
        String itemID = device.nextLine();

        switch (itemID) {
            case "432":
                item1.Print();
                System.out.println("How many iPhones to purchase?");
                int quantity1 = device.nextInt();
                item1.stock_update(quantity1);
                break;

            case "765":
                item2.Print();
                System.out.println("How many Android TVs to purchase?");
                int quantity2 = device.nextInt();
                item2.stock_update(quantity2);
                break;

            case "222":
                item3.Print();
                System.out.println("How many Printers to purchase?");
                int quantity3 = device.nextInt();
                item3.stock_update(quantity3);
                break;

            default:
                System.out.println("Wrong item ID");
        }
    }
}
