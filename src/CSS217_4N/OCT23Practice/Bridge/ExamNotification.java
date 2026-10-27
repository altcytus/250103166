package CSS217_4N.OCT23Practice.Bridge;

public class ExamNotification extends Notification {
    public ExamNotification(MessageSender messageSender) {
        super(messageSender);
    }

    @Override
    public void sendNotification(String recipient) {
        messageSender.sendMessage(recipient, "EXAM TOMORROW");
    }
}
