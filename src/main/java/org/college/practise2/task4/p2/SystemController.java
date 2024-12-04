package org.college.practise2.task4.p2;

import java.util.ArrayList;

public class SystemController extends Observable {
    private ArrayList<SystemAlert> _alertHistory = new ArrayList<>();

    public SystemController() {
    }

    public void infoAlert(){
        if (!_alertHistory.isEmpty()){
            for (SystemAlert sysAl:
                 _alertHistory) {
                nootify(sysAl);

            }
            _alertHistory.clear();
        } else {
            System.out.println("History empty");
        }
    }
    public void addAlert(SystemAlert alert){
        _alertHistory.add(alert);
    }
}
