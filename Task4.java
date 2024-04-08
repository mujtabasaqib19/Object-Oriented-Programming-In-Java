import java.util.Scanner;
interface MessageService{
    void send(String message, String recipent);
    String recieve();
}
class Whatsapp implements MessageService{
    public Whatsapp() {
    }
    @Override
    public void send(String message, String recipent) {
        System.out.println("You have a new message "+message+" from "+recipent);
    }
    @Override
    public String recieve() {
        return "The message is received";
    }
}
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter message to deliver ");
        String a=scanner.nextLine();
        System.out.println("Enter Recipitant Name ");
        String b= scanner.nextLine();
        Whatsapp whatsapp=new Whatsapp();
        whatsapp.send(a,b);
        System.out.println(whatsapp.recieve());
    }
}