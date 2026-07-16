package programming;

import javax.naming.InsufficientResourcesException;

abstract class PaymentProcessor {
    protected String gatewayName;

    protected PaymentProcessor(String gatewayName){
        this.gatewayName = gatewayName;
    }
    public abstract TransactionReceipt process(Wallet wallet, double amount) throws InsufficientResourcesException;

    public String getGatewayName() {
        return gatewayName;
    }
}
