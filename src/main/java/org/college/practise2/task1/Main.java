package org.college.practise2.task1;

import org.college.practise2.task1.Gallery;
import org.college.practise2.task1.Picture;

public class Main {
    public static void main(String[] args) {

        Gallery gal1 = Gallery.getInstance("Lauvre");

        Picture pic1 = new Picture("Mona Liza", 1503, "Leonardo Da Vinchi");
        Picture pic2 = new Picture("Ruslan and Doll", 2024, "Filip Daniil");
        Picture pic3 = new Picture("Funny Chalk", 2024, "Bohdan Petrenko");

        gal1.addPicture(pic1);
        gal1.addPicture(pic2);
        gal1.addPicture(pic3);

        gal1.set_article("Gallery " + gal1.get_name());
        System.out.println(gal1.get_article());

        System.out.println(gal1.getPicture("Mona Liza"));
        System.out.println(gal1.describePicture(pic2));

        System.out.println("Gallery has this picture: ");
        System.out.println(gal1.getPictures().toString());

        gal1.removePicture(pic3);
        System.out.println("Picture after stoll: ");
        System.out.println(gal1.getPictures().toString());

        System.out.println("Picture Count: ");
        System.out.println(gal1.getPictureCount());



    }
}