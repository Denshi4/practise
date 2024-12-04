package org.college.practise2.task4.p2;

import java.time.LocalDate;

public class SystemAlert {
    private AlertSeverity _severity;
    private String _message;
    private int _orderNumber;
    private LocalDate _timestamp;
    private String _process;

    public SystemAlert(AlertSeverity _severity, String _message, int orNum, LocalDate _timestamp, String _process) {
        this._severity = _severity;
        this._message = _message;
        this._orderNumber = orNum;
        this._timestamp = _timestamp;
        this._process = _process;
    }

    public AlertSeverity get_severity() {
        return _severity;
    }

    public String get_message() {
        return _message;
    }

    public int get_orderNumber() {
        return _orderNumber;
    }

    public LocalDate get_timestamp() {
        return _timestamp;
    }

    public String get_process() {
        return _process;
    }

    @Override
    public String toString() {
        return "SystemAlert{" +
                "_severity=" + _severity +
                ", _message='" + _message + '\'' +
                ", _orderNumber='" + _orderNumber + '\'' +
                ", _timestamp=" + _timestamp +
                ", _process='" + _process + '\'' +
                '}';
    }
}
