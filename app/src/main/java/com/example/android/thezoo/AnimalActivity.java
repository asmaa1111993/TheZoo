package com.example.android.thezoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class AnimalActivity extends AppCompatActivity {
    TextView nameView ,colorView ,ageView,otherAnimalView;
    ImageView img;
    Button animalButton ,tigerButton,catButton,dogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animal);

        nameView = findViewById(R.id.name_Text_View);
        colorView = findViewById(R.id.color_text_view);
        ageView = findViewById(R.id.age_text_view);
        otherAnimalView = findViewById(R.id.otherAnimal_text_view);
        animalButton = findViewById(R.id.animalButton2);
        tigerButton = findViewById(R.id.tigerButton2);
        dogButton = findViewById(R.id.dogButton2);
        catButton = findViewById(R.id.catButton2);
        img = findViewById(R.id.myImage);
        nameView.setVisibility(View.INVISIBLE);
        colorView.setVisibility(View.INVISIBLE);
        ageView.setVisibility(View.INVISIBLE);
        otherAnimalView.setVisibility(View.INVISIBLE);
        img.setVisibility(View.INVISIBLE);

        final Animal myAnimal  = new Animal("girraf","brown");
        myAnimal.setAge(21);

          final Tiger myTiger = new Tiger("Tiger","brown with black lines",12);
        myTiger.setAge(10);

        final Dog myDog = new Dog("Dog" ,"black - brown" ,"blak-Jack");
        myDog.setAge(2);

        final Cat myCat = new Cat("Cat","Gray","Cheese");
        myCat.setAge(1);

        View.OnClickListener animal = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalButton.setVisibility(View.INVISIBLE);
                tigerButton.setVisibility(View.INVISIBLE);
                catButton .setVisibility(View.INVISIBLE);
                dogButton.setVisibility(View.INVISIBLE);

                nameView.setVisibility(View.VISIBLE);
                colorView.setVisibility(View.VISIBLE);
                ageView.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);

                nameView.setText("Animal Name is " + myAnimal.getName());
                colorView.setText("Animal Color is " +  myAnimal.getColor());
                ageView.setText(String.valueOf(" Animal age is " + myAnimal.getAge()));
                myAnimal.setImage(img);
            }
        };

        View.OnClickListener tiger = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalButton.setVisibility(View.INVISIBLE);
                tigerButton.setVisibility(View.INVISIBLE);
                catButton .setVisibility(View.INVISIBLE);
                dogButton.setVisibility(View.INVISIBLE);

                nameView.setVisibility(View.VISIBLE);
                colorView.setVisibility(View.VISIBLE);
                ageView.setVisibility(View.VISIBLE);
                otherAnimalView.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);

                nameView.setText("Animal Name is " + myTiger.getName());
                colorView.setText("Animal Color is " +  myTiger.getColor());
                ageView.setText(String.valueOf(" Animal age is " + myTiger.getAge()));
                otherAnimalView.setText(String.valueOf(" the Animal Speed is "  + myTiger.getSpeed()));
                img.setImageResource(R.drawable.tiger);
            }
        };

        View.OnClickListener dog = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalButton.setVisibility(View.INVISIBLE);
                tigerButton.setVisibility(View.INVISIBLE);
                catButton .setVisibility(View.INVISIBLE);
                dogButton.setVisibility(View.INVISIBLE);

                nameView.setVisibility(View.VISIBLE);
                colorView.setVisibility(View.VISIBLE);
                ageView.setVisibility(View.VISIBLE);
                otherAnimalView.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);

                nameView.setText("Animal Name is " + myDog.getName());
                colorView.setText("Animal Color is " +  myDog.getColor());
                ageView.setText(String.valueOf(" Animal age is " + myDog.getAge()));
                otherAnimalView.setText(String.valueOf(" the Dog kind is "  + myDog.getDogKind()));
                img.setImageResource(R.drawable.dog);
            }
        };
        View.OnClickListener cat = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animalButton.setVisibility(View.INVISIBLE);
                tigerButton.setVisibility(View.INVISIBLE);
                catButton .setVisibility(View.INVISIBLE);
                dogButton.setVisibility(View.INVISIBLE);

                nameView.setVisibility(View.VISIBLE);
                colorView.setVisibility(View.VISIBLE);
                ageView.setVisibility(View.VISIBLE);
                otherAnimalView.setVisibility(View.VISIBLE);
                img.setVisibility(View.VISIBLE);

                nameView.setText("Animal Name is " + myCat.getName());
                colorView.setText("Animal Color is " +  myCat.getColor());
                ageView.setText(String.valueOf(" Animal age is " + myCat.getAge()));
                otherAnimalView.setText(String.valueOf(" Cat food type is "  + myCat.getFoodType()));
                img.setImageResource(R.drawable.cat);
            }
        };

        animalButton.setOnClickListener(animal);
        tigerButton.setOnClickListener(tiger);
        dogButton.setOnClickListener(dog);
        catButton.setOnClickListener(cat);
         }
    }


