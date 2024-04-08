import java.util.Scanner;
import java.util.StringTokenizer;
public class exception2 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        String sent;
        int nW;
        System.out.println("Enter Any Sentence : ");
        sent = Input.nextLine();
        StringTokenizer tokens = new StringTokenizer(sent);
        nW = tokens.countTokens();
        StringBuilder sentence1 = new StringBuilder();
        sentence1.append(sent);
        if (sent == null || sent.isEmpty()) {
            System.out.println("Sentence Is Empty.");
        }

        if (nW >= 2) {
            System.out.println("Reversed Sentence Is : " + sentence1.reverse());
        } else {
            System.out.println("Sentence Has Less Than 2 Words.");
        }
    }
}

