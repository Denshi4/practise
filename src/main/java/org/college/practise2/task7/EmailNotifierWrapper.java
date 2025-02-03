package org.college.practise2.task7;

public class EmailNotifierWrapper extends AbstractWrapper {
    private String uniqueName;

    public EmailNotifierWrapper(INotificationWrapper wrappee, String uniqueName) {
        super(wrappee);
        this.uniqueName = uniqueName;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Send Email notify: " + alert.getMessage());
        super.notify(alert);
    }
}
