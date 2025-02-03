package org.college.practise2.task7;

public abstract class AbstractWrapper implements INotificationWrapper {
    protected INotificationWrapper wrappee;

    public AbstractWrapper(INotificationWrapper wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void notify(SystemAlert alert) {
        if (wrappee != null) {
            wrappee.notify(alert);
        }
    }
}
