package Exception.customException;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientBalance{
        if(amount > balance){
            throw new InsufficientBalance("Insufficient funds for withdrawal: ",amount - balance);
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(200);

        try{
            bankAccount.deposit(100);
            System.out.println("New Balance: "+bankAccount.getBalance());
            bankAccount.withdraw(500);
        } catch (InsufficientBalance e){
            System.out.println(e.getMessage());
            System.out.println("Short by: "+e.getAmount());
        }

    }
}
