import java.util.Scanner;
class Books {
    protected String Book_name;
    protected String Author;
    protected int Book_id;
    protected int isbn;
    protected int price;
    public Books() {
    }
    public Books(String book_name, String author, int book_id, int isbn, int price) {
        this. Book_name = book_name;
        this.Author = author;
        this.Book_id = book_id;
        this.isbn = isbn;
        this.price = price;
    }
}
class Category1 extends Books{
    protected String category;
    Category1(String book_name, String author, int book_id,int isbn, int price, String category) {
        super(book_name, author, book_id, isbn, price);
        this.category = category;
    }
    void Display(){
        System.out.println("Book Name "+this.Book_name);
        System.out.println("Author "+this.Author);
        System.out.println("Book ID "+this.Book_id);
        System.out.println("ISBN "+this.isbn);
        System.out.println("Price "+this.price);
        System.out.println("Category "+this.category);
    }
}
public class Inheritance_Aggregation_7{

    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("How Many Books You want to Enter Details ");
        int n=scanner.nextInt();
        Category1[] C=new Category1[3];
        for(int i=0;i<n;i++){
            System.out.println("Enter Book Name ");
            String a= scanner.next();
            scanner.nextLine();
            System.out.println("Enter Author Name ");
            String b= scanner.next();
            System.out.println("Enter Book Id ");
            int c= scanner.nextInt();
            System.out.println("Enter Isbn No ");
            int d= scanner.nextInt();
            System.out.println("Enter Price ");
            int e= scanner.nextInt();
            System.out.println("Enter Category ");
            String f=scanner.next();
            C[i]=new Category1(a,b,c,d,e,f);
        }
        for(int j=0;j<n;j++){
            System.out.println("Book "+(j+1)+" Information ");
            C[j].Display();
        }
    }
}
