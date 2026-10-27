package CSS217_4N.OCT23Practice.Bridge;

public class SmsSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending sms to " + recipient + ": " + message);
    }
}
