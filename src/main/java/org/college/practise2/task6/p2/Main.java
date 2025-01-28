package org.college.practise2.task6.p2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello !! Welcome in my Web Indian Restaurant");
        System.out.println("Enter your kitchen equipment type (windows, linux, mac, android): ");
        String equipmentType = scanner.nextLine();

        ApplicationManager kitchenManager = new ApplicationManager(equipmentType);
        kitchenManager.run();
    }
}
