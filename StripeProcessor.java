package programming;

public class StripeProcessor extends PaymentProcessor {
    private static final double INTERNATIONAL_FEE = 2.00;

    public StripeProcessor(){
        super("Stipe");
    }

    @Override
    public TransactionReceipt process(Wallet wallet, double amount) throws InsufficientFundsException{
        double totalCharge = amount + INTERNATIONAL_FEE;
        System.out.println("Routing via Stripe. Total with Int'l fee: $" + totalCharge);

        wallet.withdraw(totalCharge);
        return new TransactionReceipt(totalCharge);
    }
}
