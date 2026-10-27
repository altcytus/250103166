package CSS217_4N.OCT23Practice.Bridge;

public abstract class Notification {
    MessageSender messageSender;
    public Notification(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public abstract void sendNotification(String message);
}
