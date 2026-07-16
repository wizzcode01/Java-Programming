package programming;

public class PaystackProcessor extends PaymentProcessor {
    public PaystackProcessor(){
        super("Paystack");
    }

    @Override
   public TransactionReceipt process(Wallet wallet, double amount){
        wallet.withdraw(amount);

        return new TransactionReceipt(amount);
    }


}
