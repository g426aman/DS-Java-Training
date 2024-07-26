import java.util.Scanner;
public class CurrencyConverter {
    static final double USD_TO_INR_RATE=83.73;
    static final double INR_TO_USD_RATE=0.012;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Menu for currency converter
        System.out.println("Currency Converter:");
        System.out.println("1.Convert USD to INR");
        System.out.println("2.Convert INR to USD");
        System.out.println("Choose an Option");
        int choice = sc.nextInt();
        double Amount, currencyConverted;
        switch (choice) {
            case 1:
                System.out.println("Enter Amount in USD");
                Amount = sc.nextDouble();
                currencyConverted = USD_TO_INR_RATE * Amount;
                System.out.println(currencyConverted);
                break;

            case 2:
                System.out.println("Enter Amount in INR");
                Amount = sc.nextDouble();
                currencyConverted = INR_TO_USD_RATE * Amount;
                System.out.println(currencyConverted);
                break;

            default:
                System.out.println("Invalid Option");
        }
        sc.close();
    }
    public static double convertUSDToINR(double usd) {
        return usd * USD_TO_INR_RATE;
    }
    public static double convertINRToUSD(double inr) {
        return inr * INR_TO_USD_RATE;
    }




        }



