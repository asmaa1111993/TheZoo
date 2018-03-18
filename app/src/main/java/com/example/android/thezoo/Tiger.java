package com.example.android.thezoo;

import android.widget.ImageView;

/**
 * Created by BASMALA on 15/03/2018.
 */

public class Tiger extends Animal {
    private final int speed ;
    public Tiger(String name, String color , int speed){
        super(name , color);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public void setImage(ImageView image) {
        image.setImageResource(R.drawable.tiger);
    }
}
