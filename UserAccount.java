package programming;

import bankingProject.Transactions;

import javax.naming.InsufficientResourcesException;
import javax.xml.crypto.Data;
import java.time.Instant;

public class UserAccount {
    private String username;
    private String email;

    class Wallet {
        private double balance;

        public void deposit(double amount){
            if (amount < 1){
              throw new IllegalArgumentException("Deposited amount must be greater than zero");
            }
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

   public final class TransactionReceipt{
        private final String transactionId;
        private final double amountProcessed;
        private final Instant timestamp;

       public TransactionReceipt(String transactionId, double amountProcessed, Instant timestamp){
            this.transactionId = transactionId;
            this.amountProcessed = amountProcessed;
            this.timestamp = timestamp;


        }

        public String getTransactionId(){
           return transactionId;
        }

        public double getAmountProcessed(){
           return amountProcessed;
        }

        public Instant getTimestamp(){
           return timestamp;
        }
    }
}
