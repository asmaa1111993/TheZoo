package com.example.android.thezoo;

import android.widget.ImageView;

/**
 * Created by BASMALA on 15/03/2018.
 */

public class Cat extends Animal {
    private String foodType ;

    public Cat(String name, String color, String foodType) {
        super(name, color);
        this.foodType = foodType;
    }

    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    public String getFoodType() {
        return foodType;
    }
    @Override
    public void setImage(ImageView imgage) {
        imgage.setImageResource(R.drawable.cat);
    }
}
