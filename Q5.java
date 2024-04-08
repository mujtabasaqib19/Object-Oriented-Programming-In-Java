import java.util.Scanner;

public class Q5 <U, P>{
    private U username;
    private P password;

    public Q5(U username, P password){
        this.username = username;
        this.password = password;
    }

    public void handle (U user, P pass){
        if(user.equals(username) && pass.equals(password)){
            System.out.println("Login successful");
        } else{
            System.out.println("invalid username or password");
        }
    }

    public static void main(String[] args){
        String username = "mujtaba";
        String password = "12345";

        Scanner s = new Scanner(System.in);

        System.out.println("Enter username: ");
        String user = s.nextLine();
        System.out.println("Enter password: ");
        String pass = s.nextLine();

        Q5<String, String> login = new Q5<>(username, password);
        login.handle(user, pass);
    }
}