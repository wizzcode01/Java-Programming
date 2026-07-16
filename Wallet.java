package programming;

public class Wallet {
    private double balance;

    public Wallet(double initialBalance){
        if(initialBalance < 0){
            throw new IllegalArgumentException("Initial deposit cannot be less than zero");
        }
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if (amount < 1){
            throw new IllegalArgumentException("Deposited amount must be greater than zero");
        }
        balance =+ amount;
    }

    public void withdraw(double amount){
        if(amount > balance){
            throw new IllegalArgumentException("Insufficient funds for this withdrawal.");
        }
        else if (amount <= 0){
            throw new IllegalArgumentException("Amount must be greater than zero");
        }else{
            balance -= amount;
            System.out.println("Sucessfull withdrawal of " + amount);
        }
    }
}

