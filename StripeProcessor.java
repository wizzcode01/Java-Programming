package programming;

public class StripeProcessor extends PaymentProcessor {
    private static final double INTERNATIONAL_FEE = 2.00;

    public StripeProcessor(){
        super("Stipe");
    }

    @Override
    public TransactionReceipt process(Wallet wallet, double amount){
        double totalCharge = amount + INTERNATIONAL_FEE;
        wallet.withdraw(totalCharge);

        return new TransactionReceipt(totalCharge);
    }
}
