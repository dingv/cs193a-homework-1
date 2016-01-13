// Valerie Ding
// CS193A, Winter 2016
// Motivator, a framework for randomly-generated motivational toasts

package com.example.boa.motivator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickTired(View view) {
        String[] tiredArray = new String[2];
        tiredArray[1] = "Grab a coffee! You can do it!";
        tiredArray[2] = "Keep calm and caffeinate!";
        Random rnd = new Random();
        int r = rnd.nextInt(2);
        Toast.makeText(this, tiredArray[r], Toast.LENGTH_LONG).show();
    }

    public void clickSad(View view) {
        String[] sadArray = new String[2];
        sadArray[1] = "You're special. Keep your head up.";
        sadArray[2] = "Take a few deep breaths.";
        Random rnd = new Random();
        int r = rnd.nextInt(2);
        Toast.makeText(this, sadArray[r], Toast.LENGTH_LONG).show();
    }

    public void clickBored(View view) {
        String[] boredArray = new String[2];
        boredArray[1] = "Check out Lip Sync Battle on YouTube.";
        boredArray[2] = "Have you seen the most recent Bob's Burgers episode?";
        Random rnd = new Random();
        int r = rnd.nextInt(2);
        Toast.makeText(this, boredArray[r], Toast.LENGTH_LONG).show();
    }
}
