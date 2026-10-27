package CSS217_4N.OCT23Practice.Bridge;

import java.awt.*;

public class MainNotifications {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SmsSender smsSender = new SmsSender();

        String student = "aaa ";

        ExamNotification examNotification = new ExamNotification(smsSender);
        examNotification.sendNotification(student);

        ExamNotification examNotification2 = new ExamNotification(emailSender);
        examNotification2.sendNotification(student);


        GradeNotification gradeNotification = new GradeNotification(smsSender);
        gradeNotification.sendNotification(student);

        GradeNotification gradeNotification2 = new GradeNotification(emailSender);
        gradeNotification2.sendNotification(student);
    }
}
