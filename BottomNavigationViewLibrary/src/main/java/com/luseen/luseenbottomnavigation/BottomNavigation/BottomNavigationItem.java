package com.luseen.luseenbottomnavigation.BottomNavigation;

import android.content.Context;
import android.graphics.drawable.Drawable;

public class BottomNavigationItem {

    private String title;
    private int color;
    private Drawable imageResource;
    private Context context;

    public BottomNavigationItem(String title, int color,int imageResource, Context context) {
        this.title = title;
        this.color = color;
        this.context = context;
        setImageResource(imageResource);
    }

    public BottomNavigationItem(String title, int color, Drawable imageResource, Context context) {
        this.title = title;
        this.color = color;
        this.imageResource = imageResource;
        this.context = context;
    }

    public Drawable getImageResource() {
        return imageResource;
    }

    public void setImageResource(Drawable imageResource) {
        this.imageResource = imageResource;
    }

    public void setImageResource(int imageResource) {
        setImageResource(context.getResources().getDrawable(imageResource));
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
