package org.college.practise2.task2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] agr){

        String chooseCountry;
        Picture picture = new Picture();

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter country (UA/USA): ");
            chooseCountry = scanner.next().toLowerCase();
        } while (!chooseCountry.equals("ua") && !chooseCountry.equals("usa"));

        PictureBuilder pb;

        if(chooseCountry.equals("ua")){
            pb = new UaPictureBuilder(picture);

        } else {
            pb = new UsaPictureBuilder(picture);
        }

        pb.setBasicParams("Mona Liza",(short) 6, "Danchik");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Yellow");
        pb.setColorParams(colors, true, "white");
        pb.setCategoryParams("Girl", "Adults only");

        picture = pb.build();


    }
}
