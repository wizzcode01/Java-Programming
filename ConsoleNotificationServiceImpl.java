package programming;

public class ConsoleNotificationServiceImpl implements NotificationService{
    @Override
    public void sendAlert(String email, String message){
        System.out.println("[EMAIL OUTBOX] Sent to: " + email + " | message: " + message);
    }
}
