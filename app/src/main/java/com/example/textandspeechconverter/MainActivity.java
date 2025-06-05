package com.example.textandspeechconverter;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to the buttons
        Button button1 = findViewById(R.id.btnText);
        Button button2 = findViewById(R.id.btnSpeech);

        // Set click listener for Button 1 (Text to Speech)
        button1.setOnClickListener(v -> {
            // Start Text to Speech Activity
            Intent intent = new Intent(MainActivity.this, text_to_speech.class);
            startActivity(intent);
        });

        // Set click listener for Button 2 (Speech to Text)
        button2.setOnClickListener(v -> {
            // Start Speech to Text Activity
            Intent intent = new Intent(MainActivity.this, speech_to_text.class);
            startActivity(intent);
        });
    }
}
