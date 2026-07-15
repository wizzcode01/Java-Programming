package programming;

import javax.naming.InsufficientResourcesException;

abstract class PaymentProcessor {
    protected String gatewayName;

    protected PaymentProcessor(String gatewayName){
        this.gatewayName = gatewayName;
    }
    public abstract UserAccount.TransactionReceipt process(UserAccount.Wallet wallet, double amount) throws InsufficientResourcesException;

    public String getGatewayName() {
        return gatewayName;
    }

    class PaystackProcessor extends PaymentProcessor{
      public PaystackProcessor(){
          super("Paystack");
      }

        @Override
      public  UserAccount.TransactionReceipt process(UserAccount.Wallet wallet, double amount){
            if(wallet.);
        }


    }
}
