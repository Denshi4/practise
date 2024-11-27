package org.college.practise2.task2;
import java.util.Scanner;

public class Main {
    public static void main(String[] agr){

        String chooseCountry;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter country (UA/USA): ");
            chooseCountry = scanner.next().toLowerCase();
        } while (!chooseCountry.equals("ua") && !chooseCountry.equals("usa"));

        PictureBuilder pb;

        if(chooseCountry.equals("ua")){

        }









    }
}
