package programming;

import java.time.Instant;
import java.util.UUID;

public final class TransactionReceipt {
    private final String transactionId;
    private final double amountProcessed;
    private final long timestamp;

    public TransactionReceipt(double amountProcessed) {
        this.transactionId = UUID.randomUUID().toString();
        this.amountProcessed = amountProcessed;
        this.timestamp = System.currentTimeMillis();

    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmountProcessed() {
        return amountProcessed;
    }

    public long getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "TransactionReceipt{" +
                "transactionId='" + transactionId + '\'' +
                ", amountProcessed=" + amountProcessed +
                ", timestamp=" + timestamp +
                '}';
    }



}
