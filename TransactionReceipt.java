package programming;

import java.time.Instant;

public final class TransactionReceipt {
    private final String transactionId;
    private final double amountProcessed;
    private final Instant timestamp;

    public TransactionReceipt(String transactionId, double amountProcessed, Instant timestamp) {
        this.transactionId = transactionId;
        this.amountProcessed = amountProcessed;
        this.timestamp = timestamp;

    }

    public String getTransactionId() {
        return transactionId;
    }

    public double getAmountProcessed() {
        return amountProcessed;
    }

    public Instant getTimestamp() {
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
