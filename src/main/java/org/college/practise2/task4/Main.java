package org.college.practise2.task4;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        SystemAlert al1 = new SystemAlert(AlertSeverity.WARNING, "Hackers attack", 4, LocalDate.now(), "FireWall");
        SystemAlert al2 = new SystemAlert(AlertSeverity.INFO, "Attacked stopped", 404, LocalDate.now(), "FireWall");
        SystemAlert al3 = new SystemAlert(AlertSeverity.CRITCAL, "Hight ping", 4444, LocalDate.now(), "WiFi");

        SystemController control1 = new SystemController();

        EmailNotifier ema1 = new EmailNotifier("fortslurper@gmail.com");
        SysLogNotifier sys1 = new SysLogNotifier("sysLog");
        PhoneNotifier phone1 = new PhoneNotifier("+380969186536");
        TelegramNotifier telegram1 = new TelegramNotifier("DelovoyMelon4", true);

        control1.subscribe(ema1);
        control1.subscribe(sys1);
        control1.subscribe(phone1);
        control1.subscribe(telegram1);

        control1.addAlert(al1);
        control1.addAlert(al2);
        control1.addAlert(al3);
        control1.infoAlert();

        control1.addAlert(al1);
        control1.subscribe(ema1);
        control1.subscribe(phone1);
        control1.unsubscribe(phone1);
        control1.infoAlert();
    }


}
