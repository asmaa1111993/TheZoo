package com.example.android.thezoo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button animalButton ,tigerButton,catButton,dogButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animalButton = findViewById(R.id.animalButton);
        tigerButton = findViewById(R.id.tigerButton);
        dogButton = findViewById(R.id.dogButton);
        catButton = findViewById(R.id.catButton);
    }
    public void checkMethod(View view){
        Intent goToAnimalActivity = new Intent(MainActivity.this,AnimalActivity.class);
        int id = view.getId();
        goToAnimalActivity.putExtra("key",id);
        startActivity(goToAnimalActivity);
    }
}
