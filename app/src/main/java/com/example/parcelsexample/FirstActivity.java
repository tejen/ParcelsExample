package com.example.parcelsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.parceler.Parcels;

public class FirstActivity extends AppCompatActivity {

    Button btDoSomething;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btDoSomething = findViewById(R.id.btDoSomething);

        btDoSomething.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // go to SecondActivity

                String apiKey = getString(R.string.api_key_for_twitter);

                Tweet tweet = new Tweet();
                tweet.body = "warriors are about to take home these finals";

                Intent i = new Intent(FirstActivity.this, SecondActivity.class);

                i.putExtra("thenameofmytweet", Parcels.wrap(tweet));
                startActivity(i);
            }
        });
    }
}