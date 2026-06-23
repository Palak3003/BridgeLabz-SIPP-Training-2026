// Custom Exception
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBilling {

    // Method for Payment
    static void makePayment(double balance, double bill)
            throws InsufficientFundsException {

        if (balance < bill) {
            throw new InsufficientFundsException("Payment Failed: Insufficient Funds.");
        } else {
            System.out.println("Payment Successful.");
        }
    }

    public static void main(String[] args) {

        // 1. Division by Zero
        try {
            int totalBill = 5000;
            int items = 0;

            int price = totalBill / items;

            System.out.println(price);

        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot have zero items.");
        }

        // 2. Array Index Out of Bounds
        try {
            String[] patients = {"Ram", "Shyam", "Mohan"};

            System.out.println(patients[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        // 3. Number Format Exception
        try {
            String input = "abc";

            int amount = Integer.parseInt(input);

            System.out.println(amount);

        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number entered.");
        }

        // 4. Custom Exception
        try {
            makePayment(2000, 5000);

        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}