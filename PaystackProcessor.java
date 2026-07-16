package programming;

public class PaystackProcessor extends PaymentProcessor {
    public PaystackProcessor(){
        super("Paystack");
    }

    @Override
   public TransactionReceipt process(Wallet wallet, double amount) throw {
        wallet.withdraw(amount);

        return new TransactionReceipt(amount);
    }


}
