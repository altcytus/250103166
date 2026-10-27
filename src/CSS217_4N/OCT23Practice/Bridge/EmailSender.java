package CSS217_4N.OCT23Practice.Bridge;

public class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
