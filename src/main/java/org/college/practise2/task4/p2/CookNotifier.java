package org.college.practise2.task4.p2;

public class CookNotifier implements Observer {
    private String _cookName;

    public CookNotifier(String _cookName) {
        this._cookName = _cookName;
    }

    @Override
    public void nootifyy(SystemAlert sysAl) {
        System.out.println(this._cookName + " make this mistake " + sysAl.toString());
    }
}
