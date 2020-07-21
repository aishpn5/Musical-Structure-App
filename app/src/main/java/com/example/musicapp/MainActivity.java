package com.example.musicapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the english songs category
        TextView englishSongs = findViewById(R.id.englishSongs_text_view);

        // Set a click listener on that View
        englishSongs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the english songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link EnglishSongsActivity}
                Intent englishSongsIntent = new Intent(MainActivity.this, EnglishSongsActivity.class);

                // Start the new activity
                startActivity(englishSongsIntent);
            }
        });

        // Find the View that shows the hindi songs category
        TextView hindiSongs = findViewById(R.id.hindiSongs_text_view);

        // Set a click listener on that View
        hindiSongs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the hindi songs category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HindiSongsActivity}
                Intent hindiSongsIntent = new Intent(MainActivity.this, HindiSongsActivity.class);

                // Start the new activity
                startActivity(hindiSongsIntent);
            }
        });

    }
}


