package CSS217_4N.OCT23Practice.Bridge;

public class GradeNotification extends Notification {
    public GradeNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendNotification(String recipient) {
        messageSender.sendMessage(recipient, "Grades uploaded");
    }
}
