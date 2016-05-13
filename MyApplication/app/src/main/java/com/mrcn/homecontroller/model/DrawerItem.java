package com.mrcn.homecontroller.model;

/**
 * Created by gmra on 2016-05-12.
 */
public class DrawerItem {

    public int icon;
    public String title;

    public DrawerItem(int icon, String title)
    {
        this.icon = icon;
        this.title = title;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
