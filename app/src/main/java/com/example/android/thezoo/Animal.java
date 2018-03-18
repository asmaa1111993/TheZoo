package com.example.android.thezoo;

import android.widget.ImageView;

/**
 * Created by BASMALA on 15/03/2018.
 */

public class Animal {
    private final String name ;
    private final String color ;
    private int age ;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void  setImage (ImageView img){
        img.setImageResource(R.drawable.animal);
    }
}
