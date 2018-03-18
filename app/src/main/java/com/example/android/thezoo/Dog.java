package com.example.android.thezoo;

import android.widget.ImageView;

/**
 * Created by BASMALA on 15/03/2018.
 */

public class Dog extends Animal {
    private final String dogKind;

    public Dog(String name, String color, String dogKind) {
        super(name, color);
        this.dogKind = dogKind;
    }

    public String getDogKind() {
        return dogKind;
    }
    @Override
    public void setImage(ImageView imgage) {
        imgage.setImageResource(R.drawable.dog);
    }
}
