package org.college.practise2.task4.p2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        SystemAlert al1 = new SystemAlert(AlertSeverity.LIGHTOFF, "Light off", 44, LocalDate.now(), "Dtek");
        SystemAlert al2 = new SystemAlert(AlertSeverity.COOKCRY, "Cook cry", 404, LocalDate.now(), "Onion");
        SystemAlert al3 = new SystemAlert(AlertSeverity.ENDFOOD, "Food end", 4444, LocalDate.now(), "Food");

        SystemController control1 = new SystemController();


        SayNotifier sys1 = new SayNotifier("sysLog");
        AdminNotifier phone1 = new AdminNotifier(4);
        CookNotifier telegram1 = new CookNotifier("Denshi");

        control1.subscribe(sys1);
        control1.subscribe(phone1);
        control1.subscribe(telegram1);

        control1.addAlert(al1);
        control1.addAlert(al2);
        control1.addAlert(al3);
        control1.infoAlert();

        control1.addAlert(al1);
        control1.subscribe(phone1);
        control1.unsubscribe(phone1);
        control1.infoAlert();
    }


}
