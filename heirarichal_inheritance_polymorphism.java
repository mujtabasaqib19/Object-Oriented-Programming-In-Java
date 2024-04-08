//q1
class Item{
    String title,author;
    int year;
    public Item(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }
    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
class Book extends Item {
    String publisher;
    int ISBN;

    public Book(String title, String author, int year, String publisher, int ISBN) {
        super(title, author, year);
        this.publisher = publisher;
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Book{" +
                "publisher='" + publisher + '\'' +
                ", ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
class Magzine extends Item{
    String Mag_publisher;
    int issuenum;
    public Magzine(String title, String author, int year, String mag_publisher, int issuenum) {
        super(title, author, year);
        this.Mag_publisher = mag_publisher;
        this.issuenum = issuenum;
    }

    @Override
    public String toString() {
        return "Magzine{" +
                "Mag_publisher='" + Mag_publisher + '\'' +
                ", issuenum=" + issuenum +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
class DVD extends Item{
    String director;
    int length;

    public DVD(String title, String author, int year, String director, int length) {
        super(title, author, year);
        this.director = director;
        this.length = length;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "director='" + director + '\'' +
                ", length=" + length +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", year=" + year +
                '}';
    }
}
public class heirarichal_inheritance_polymorphism {
    public static void main(String[] args) {


        Item item = new Item("Harry Potter", "Muji", 2012);
        Book book = new Book("Harry Potter", "Muji", 2012, "Time Magazine", 323123);
        Magzine magazine = new Magzine("Harry Potter", "Muji", 2012, "Time Magazine", 3231);
        DVD dvd = new DVD("Harry Potter", "Muji", 2012, "Don Muji", 2000);

        System.out.println(item.toString());
        System.out.println(book.toString());
        System.out.println(magazine.toString());
        System.out.println(dvd.toString());

    }
}