package com.example.randommotication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView quoteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView = findViewById(R.id.quoteTextView);
        quoteTextView.setText(MotivationalGenerator.generateQuote());



    }
    @Override
    protected void onResume() {
        super.onResume();
        quoteTextView.setText(MotivationalGenerator.generateQuote());
    }

}