package com.example.recyclermultipleviews;

public class RvModelClass {

    public static final int TEXT_TYPE=0;
    public static final int IMAGE_TYPE=1;

    public int type;
    public int poster;
    public String text;
    public String title;
    public String des;

    public RvModelClass(int type, int poster, String text, String title, String des)
    {
        this.type=type;
        this.poster=poster;
        this.text=text;
        this.title=title;
        this.des=des;

    }
}
