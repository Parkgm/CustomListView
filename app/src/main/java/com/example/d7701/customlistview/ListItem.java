package com.example.d7701.customlistview;

import android.graphics.drawable.Drawable;

/**
 * Created by D7701 on 2018-04-02.
 */

public class ListItem {
    private Drawable icon1;
    private String title;
    private String explain;



    public Drawable getIcon1() {
        return icon1;
    }

    public String getTitle() {
        return title;
    }

    public String getExplain() {
        return explain;
    }

    public void setIcon1(Drawable icon1) {
        this.icon1 = icon1;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
