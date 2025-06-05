package com.example.textandspeechconverter;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class text_to_speech extends AppCompatActivity {

    EditText Text;
    Button btnText;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text_to_speech);

        Text = findViewById(R.id.Text);
        btnText = findViewById(R.id.btnText);

        // Create an object textToSpeech and adding features into it
        textToSpeech = new TextToSpeech(getApplicationContext(), i -> {
            // if no error is found then only it will run
            if (i != TextToSpeech.ERROR) {
                // Set the language of speech to UK English
                textToSpeech.setLanguage(Locale.UK);
            }
        });

        // Adding OnClickListener to the button
        btnText.setOnClickListener(view -> {
            textToSpeech.speak(Text.getText().toString(), TextToSpeech.QUEUE_FLUSH, null);
        });
    }
}
