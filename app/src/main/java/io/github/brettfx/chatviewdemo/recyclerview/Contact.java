package io.github.brettfx.chatviewdemo.recyclerview;

//import android.support.annotation.DrawableRes;

import androidx.annotation.DrawableRes;

/**
 * Created by Dytstudio.
 */

public class Contact {
    String name;
    int image;

    public int getImage(){
        return image;
    }
    public void setImage(@DrawableRes int img){
        image = img;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
