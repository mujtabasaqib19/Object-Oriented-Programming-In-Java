import java.util.Scanner;

public class CableCompanyBilling {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You are \n1.Residential Customer(Press R) \n2.Business customer(Press B)");

        double basicServiceFee = 20.50;
        double billProcessingFee = 4.50;
        double billing = 0.0;

        String choice = scanner.next();

        switch (choice) {
            case "R":
            case "r":
                System.out.println("Enter your account number, number of premium channels you subscribe");
                int accnum = scanner.nextInt();
                int prem = scanner.nextInt();

                billing = billProcessingFee + basicServiceFee + (prem * 7.50);
                System.out.println("Your account number is " + accnum + " and bill is $" + billing);
                break;

            case "B":
            case "b":
                System.out.println("Enter the number of basic service connections: ");
                int channel = scanner.nextInt();
                double billProcessingFeeB = 15.00;

                if (channel <= 10) {
                    billing = billProcessingFeeB + (basicServiceFee * channel) + (50.00 * channel);
                    System.out.println("Your bill is $" + billing);
                } else {
                    int additionalConnections = channel - 10;
                    billing = billProcessingFeeB + (basicServiceFee * 10) + (5.00 * additionalConnections) + (50.0 * channel);
                    System.out.println("Your bill is $" + billing);
                }
                break;

            default:
                System.out.println("Invalid Choice");
        }

        scanner.close();
    }
}
