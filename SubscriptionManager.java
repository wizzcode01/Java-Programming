package programming;

public class SubscriptionManager {
    public void reneSubscription(UserAccount user, double cost, PaymentProcessor processor, NotificationService notifier){
        try{
            TransactionReceipt receipt = processor.process(user.getWallet(), cost);

            String alertMsg = "Subscription renewed successfully! Receipt ID: " + receipt.getTransactionId();
            notifier.sendAlert(user.getUsername(), alertMsg);

        }catch(InsufficientFundsException e){
            String failureMsg = "Renewal failed: " + e.getMessage() + " Current balance: $" + user.getWallet().getBalance();
            notifier.sendAlert(user.getUsername(), failureMsg);
        }
    }
}
