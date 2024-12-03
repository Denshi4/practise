package org.college.practise2.task2;

import java.util.ArrayList;

public abstract class PictureBuilder {
    protected Picture picture;

    public abstract void setBasicParams(String name, short year, String author);
    public abstract void setSizeParams(Size size);
    public abstract void setColorParams(ArrayList<String> color, boolean isWithFrame, String canvas);
    public abstract void setCategoryParams(String theme, String category);
    public abstract Picture build();

}