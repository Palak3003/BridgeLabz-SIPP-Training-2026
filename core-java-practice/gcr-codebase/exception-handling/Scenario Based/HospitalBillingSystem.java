class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {

        try {
            int totalBill = 5000;
            int items = 0;
            System.out.println("Per Item Cost: " + (totalBill / items));
        } catch (ArithmeticException e) {
            System.out.println("Error: Number of items cannot be zero.");
        }

        try {
            int patients[] = {101, 102, 103};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int amount = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            makePayment(1000, 500);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }

    static void makePayment(int balance, int payment)
            throws InsufficientFundsException {
        if (payment > balance) {
            throw new InsufficientFundsException(
                    "Payment Failed: Insufficient Funds");
        }
    }
}