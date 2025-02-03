package org.college.practise2.task7;

public class PhoneNotifierWrapper extends AbstractWrapper {
    private String phoneNumber;

    public PhoneNotifierWrapper(INotificationWrapper wrappee, String phoneNumber) {
        super(wrappee);
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Send phone notify to " + phoneNumber + ": " + alert.getMessage());
        super.notify(alert);
    }
}
