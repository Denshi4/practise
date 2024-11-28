package org.college.practise2.task2;

import java.util.ArrayList;

public class UaPictureBuilder extends PictureBuilder{
    private Picture picture;

    public UaPictureBuilder(Picture picture) {
        this.picture = picture;
    }

    public void setBasicParams(String author, short year, String name) {
        picture.set_author(author);
        picture.set_year(year);
        picture.set_name(name);
    }


    public void setSizeParams(Size size) {
        picture.setSize(size);
    }


    public void setColorParams(ArrayList<String> color, boolean isWithFrame, String canvas) {
        picture.set_color(color);
        picture.setWithFrame(isWithFrame);
        picture.set_canvas(canvas);
    }


    public void setCategoryParams(String theme, String category) {
        picture.set_theme(theme);
        picture.set_category(category);
    }


    public Picture build() {
        System.out.println("You have a UA picture (Gorilka sounds)");
        return picture;
    }
}
