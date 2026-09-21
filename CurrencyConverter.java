import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Predefined exchange rates (example rates)
        BigDecimal USD_TO_INR = new BigDecimal("83.50");
        BigDecimal EUR_TO_INR = new BigDecimal("90.50");
        BigDecimal GBP_TO_INR = new BigDecimal("105.00");
        BigDecimal AUD_TO_INR = new BigDecimal("54.50");

        boolean running = true;

        while (running) {

            System.out.println("\n===== CURRENCY CONVERTER =====");
            System.out.println("1. USD to INR");
            System.out.println("2. EUR to INR");
            System.out.println("3. GBP to INR");
            System.out.println("4. AUD to INR");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                running = false;
                System.out.println("Thank you!");
                break;
            }

            System.out.print("Enter amount: ");
            BigDecimal amount = sc.nextBigDecimal();

            // Security gate - reject negative amount
            if (amount.compareTo(BigDecimal.ZERO) < 0) {
                System.out.println("Please enter a valid positive amount.");
                continue;
            }

            BigDecimal rate;

            switch (choice) {

                case 1:
                    rate = USD_TO_INR;
                    break;

                case 2:
                    rate = EUR_TO_INR;
                    break;

                case 3:
                    rate = GBP_TO_INR;
                    break;

                case 4:
                    rate = AUD_TO_INR;
                    break;

                default:
                    System.out.println("Invalid choice!");
                    continue;
            }

            BigDecimal convertedAmount = amount.multiply(rate)
                    .setScale(2, RoundingMode.HALF_UP);

            System.out.println("Converted Amount: ₹" + convertedAmount);
        }

        sc.close();
    }
}