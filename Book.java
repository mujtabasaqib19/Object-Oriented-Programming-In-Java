//Q3 lab3
public class Book {
    String title, author;
    double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void setTitle(String title) {

        this.title = title;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {

        return author;
    }
    public String getTitle() {
        return title;
    }
    public double getPrice() {

        return price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args)
    {
        Book book1 = new Book("Great Expectations", "Charles Dickens", 79.75);
        System.out.println("Title of book  " +book1.getTitle());
        System.out.println("Author of book " +book1.getAuthor());
        System.out.println("Price of book " +book1.getPrice());

        book1.setTitle("Harry Potter");
        book1.setAuthor("Leonardo da vinci");
        book1.setPrice(108.3);

        System.out.println("\nUpdated Book Details:");
        System.out.println("Title of book " +book1.getTitle());
        System.out.println("Author of book " +book1.getAuthor());
        System.out.println("Price of book " +book1.getPrice());


    }


}

