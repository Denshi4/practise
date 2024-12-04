package org.college.practise2.task4;

public class TelegramNotifier implements Observer{
    private String _userId;
    private boolean _isInstant;

    public TelegramNotifier(String _userId, boolean _isInstant) {
        this._userId = _userId;
        this._isInstant = _isInstant;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(sysAl.toString() + " send to " + this._userId + ". Is sitant ? " + this._isInstant);
    }
}
