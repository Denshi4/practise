package org.college.practise2.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        INotificationWrapper wrappee1 = new SysLogNotifierWrapper(null);
        
        System.out.println("Enter platform (windows, linux, mac, android): ");
        String platform = scanner.nextLine();

        System.out.println("Enter email address (enter 0 if null: ");
        String emailAddress = scanner.nextLine();
        if (emailAddress.equals("0")){
            emailAddress = null;
        }

        System.out.println("Enter telegram user (enter 0 if null: ");
        String telegramUser = scanner.nextLine();
        if (telegramUser.equals("0")){
            telegramUser = null;
        }
        System.out.println("Enter phone number (enter 0 if null: ");
        String phoneNumber = scanner.nextLine();
        if (phoneNumber.equals("0")){
            phoneNumber = null;
        }

        if (platform.equalsIgnoreCase("linux")) {
            wrappee1 = new SysLogNotifierWrapper(wrappee1, "LinuxSysLog");
        } else if (platform.equalsIgnoreCase("windows")) {
            wrappee1 = new SysLogNotifierWrapper(wrappee1, "WindowsSysLog");
        } else if (platform.equalsIgnoreCase("mac")) {
            wrappee1 = new SysLogNotifierWrapper(wrappee1, "MacSysLog");
        } else if (platform.equalsIgnoreCase("android")){
            wrappee1 = new SysLogNotifierWrapper(wrappee1, "AndroidSysLog");
        }

        if (telegramUser != null) {
            wrappee1 = new TelegramNotifierWrapper(wrappee1, telegramUser);
        }

        if (phoneNumber != null) {
            wrappee1 = new PhoneNotifierWrapper(wrappee1, phoneNumber);
        }

        if (emailAddress != null) {
            wrappee1 = new EmailNotifierWrapper(wrappee1, emailAddress);
        }

        SystemController sysControl = new SystemController(wrappee1);

        SystemAlert alert = new SystemAlert(AlertSeverity.INFO, "Hello, its me", 404, "InfoProcess");
        sysControl.informAlert(alert);
    }
}
