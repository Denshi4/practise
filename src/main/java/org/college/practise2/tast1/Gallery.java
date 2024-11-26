package org.college.practise2.tast1;

import java.util.ArrayList;
import java.util.HashMap;

public class Gallery {
    private ArrayList<Picture> _picture = new ArrayList<>();
    private String _name;
    private String _article;
    private static HashMap<String, Gallery> _instance = new HashMap<>();

    private Gallery(String name){
        this._name = name;
    }

    public static Gallery getInstance(String name){
        if (!_instance.containsValue(name)) {
            Gallery gal = new Gallery(name);
            _instance.put(name, gal);
            return gal;
        }
        return null;
    }

    public boolean addPicture(Picture picture){
        return _picture.add(picture);
    }
    public boolean removePicture(Picture picture){
        return _picture.remove(picture);
    }
    public String describePicture(Picture picture){
        System.out.println("A new bomb picture has recently appeared in our gallery!! \n" +
                "I'm sure you'll get a kick out of it");
        System.out.println("New Picture: ");
        return picture.toString();
    }

    public Picture getPicture(String name){
        for (Picture pic:
                _picture) {
            if (pic.get_name().equals(name)){
                return pic;
            }
        }
        return null;
    }
    public ArrayList<Picture> getPictures(){
        return _picture;
    }

    public long getPictureCount(){
        return _picture.size();
    }

    public String get_name() {
        return _name;
    }

    public String get_article() {
        return _article;
    }

    public void set_article(String _article) {
        this._article = _article;
    }
}

