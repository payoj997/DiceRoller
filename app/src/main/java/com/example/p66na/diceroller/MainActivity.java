package com.example.p66na.diceroller;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
    private Button clickMe;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        image1 = findViewById(R.id.imageView1);
        image2 = findViewById(R.id.imageView2);
        clickMe = findViewById(R.id.button1);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rollTheDice1();
                rollTheDice2();
            }
        });
    }

    private void rollTheDice1() {
        int randomNumber = myRandomNumber.nextInt(6) + 1;
        switch (randomNumber){
            case 1: image1.setImageResource(R.drawable.dice1);
                    break;
            case 2: image1.setImageResource(R.drawable.dice2);
                break;
            case 3: image1.setImageResource(R.drawable.dice3);
                break;
            case 4: image1.setImageResource(R.drawable.dice4);
                break;
            case 5: image1.setImageResource(R.drawable.dice5);
                break;
            default: image1.setImageResource(R.drawable.dice6);
                break;
        }
    }
    private void rollTheDice2() {
        int randomNumber = myRandomNumber.nextInt(6) + 1;
        switch (randomNumber){
            case 1:
                image2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                image2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                image2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                image2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                image2.setImageResource(R.drawable.dice5);
                break;
            default:
                image2.setImageResource(R.drawable.dice6);
                break;
        }
    }

}
