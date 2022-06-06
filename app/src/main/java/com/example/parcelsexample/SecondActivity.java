package com.example.parcelsexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.parceler.Parcels;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);



        Tweet tweet = Parcels.unwrap(getIntent().getParcelableExtra("thenameofmytweet"));

        TextView tvResult = findViewById(R.id.tvResult);

        tvResult.setText(tweet.body);
    }
}