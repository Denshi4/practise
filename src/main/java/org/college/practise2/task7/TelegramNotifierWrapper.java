package org.college.practise2.task7;

public class TelegramNotifierWrapper extends AbstractWrapper {
    private String userId;

    public TelegramNotifierWrapper(INotificationWrapper wrappee, String userId) {
        super(wrappee);
        this.userId = userId;
    }

    @Override
    public void notify(SystemAlert alert) {
        System.out.println("Send Telegram message to user " + userId + ": " + alert.getMessage());
        super.notify(alert);
    }
}
