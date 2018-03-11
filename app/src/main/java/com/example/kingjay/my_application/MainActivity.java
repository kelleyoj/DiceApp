package com.example.kingjay.my_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button newButton;
        newButton = (Button) findViewById(R.id.rollbutton);

        final ImageView leftDice = (ImageView) findViewById(R.id.left_dice);
        final ImageView rightDice = (ImageView) findViewById(R.id.right_dice);
        final int[] diceArray = {R.drawable.dice1,
                                R.drawable.dice2,
                                R.drawable.dice3,
                                R.drawable.dice4,
                                R.drawable.dice5,
                                R.drawable.dice6};
        newButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("Dicee", "yep yep");

                Random randomNumber = new Random();
                int number = randomNumber.nextInt(6);
                Log.d("Dicee", "Number" + number);

                leftDice.setImageResource(diceArray[number]);
                number = randomNumber.nextInt(6);
                rightDice.setImageResource(diceArray[number]);

            }
        });

    }
}
