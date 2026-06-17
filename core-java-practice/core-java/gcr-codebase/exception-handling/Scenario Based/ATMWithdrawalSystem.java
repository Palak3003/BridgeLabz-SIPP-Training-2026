class InsufficientBalanceException extends Exception {

    private double balance;
    private double withdrawAmount;

    public InsufficientBalanceException(
            String message,
            double balance,
            double withdrawAmount) {

        super(message);
        this.balance = balance;
        this.withdrawAmount = withdrawAmount;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawAmount() {
        return withdrawAmount;
    }
}

public class ATMWithdrawalSystem {

    static void withdraw(double balance,
                         double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                    "Insufficient Balance",
                    balance,
                    amount);
        }

        System.out.println("Withdrawal Successful");
    }

    public static void main(String[] args) {

        try {
            withdraw(5000, 8000);
        } catch (InsufficientBalanceException e) {

            System.out.println(e.getMessage());
            System.out.println("Available Balance: ₹"
                    + e.getBalance());
            System.out.println("Requested Amount: ₹"
                    + e.getWithdrawAmount());
        }
    }
}