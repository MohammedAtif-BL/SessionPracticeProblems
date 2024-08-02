package Exception.customException;

public class InsufficientBalance extends Exception{
    private double amount;
    public InsufficientBalance(String message, double amount) {
        super(message);
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
