
import java.util.Scanner;

public class CurrencyConverterT4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        double amount, result;

        System.out.println("===== Currency Converter =====");
        System.out.println("1. INR to USD");
        System.out.println("2. USD to INR");
        System.out.println("3. INR to EUR");
        System.out.println("4. EUR to INR");
        System.out.print("Choose conversion option: ");
        choice = sc.nextInt();

        System.out.print("Enter amount: ");
        amount = sc.nextDouble();

        switch (choice) {

            case 1:
                result = amount / 83.0;
                System.out.println(amount + " INR = " + result + " USD");
                break;

            case 2:
                result = amount * 83.0;
                System.out.println(amount + " USD = " + result + " INR");
                break;

            case 3:
                result = amount / 90.0;
                System.out.println(amount + " INR = " + result + " EUR");
                break;

            case 4:
                result = amount * 90.0;
                System.out.println(amount + " EUR = " + result + " INR");
                break;

            default:
                System.out.println("Invalid Choice!");
        }

        sc.close();
}
    }
