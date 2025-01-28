package org.college.practise2.task6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your operation system (windows, linux, mac, android): ");
        String os1 = scanner.nextLine();

        ApplicationManager osManeger = new ApplicationManager(os1);
        osManeger.run();

    }
}
