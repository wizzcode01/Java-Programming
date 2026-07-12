package programming;

import javax.naming.InsufficientResourcesException;

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
               throw new javax.naming.InsufficientResourcesException("Insufficient funds for this withdrawal.");
            }
            else if (amount < balance){
                IllegalArgumentException
            }
        }
    }
}
