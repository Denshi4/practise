package org.college.practise2.task2;

import java.util.ArrayList;

public class Picture {
    private String _name;
    private short _year;
    private String _author;
    private String _theme;
    private String _category;
    private ArrayList<String> _color;
    private Size size;
    private boolean isWithFrame;
    private String _canvas;

    public Picture(String _name, short _year, String _author, String _theme, String _category, ArrayList<String> _color, Size size, boolean isWithFrame, String _canvas) {
        this._name = _name;
        this._year = _year;
        this._author = _author;
        this._theme = _theme;
        this._category = _category;
        this._color = _color;
        this.size = size;
        this.isWithFrame = isWithFrame;
        this._canvas = _canvas;
    }

    public String get_name() {
        return _name;
    }

    public short get_year() {
        return _year;
    }

    public String get_author() {
        return _author;
    }

    public String get_theme() {
        return _theme;
    }

    public String get_category() {
        return _category;
    }

    public ArrayList<String> get_color() {
        return _color;
    }

    public Size getSize() {
        return size;
    }

    public boolean isWithFrame() {
        return isWithFrame;
    }

    public String get_canvas() {
        return _canvas;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public void set_year(short _year) {
        this._year = _year;
    }

    public void set_author(String _author) {
        this._author = _author;
    }

    public void set_theme(String _theme) {
        this._theme = _theme;
    }

    public void set_category(String _category) {
        this._category = _category;
    }

    public void set_color(ArrayList<String> _color) {
        this._color = _color;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setWithFrame(boolean withFrame) {
        isWithFrame = withFrame;
    }

    public void set_canvas(String _canvas) {
        this._canvas = _canvas;
    }
}
