package com.example.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EnglishSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_songs);

        // Create a list of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Faded", "Alan Walker"));
        songs.add(new Songs("See You Again", "Wiz Knalifa"));
        songs.add(new Songs("Sorry", "Justin Bieber"));
        songs.add(new Songs("Uptown Funk", "Mark Ronson"));
        songs.add(new Songs("Blank Space", "Taylor Swift"));
        songs.add(new Songs("Thriller", "Michael Jackson"));
        songs.add(new Songs("When Doves Cry", "Prince"));
        songs.add(new Songs("Like a Prayer", "Madonna"));
        songs.add(new Songs("Lean On", "Major Lazer & Dj Shake"));
        songs.add(new Songs("Shake It Off", "Taylor Swift"));

        // Create an {@link SongsAdapter}, whose data source is a list of {@link Songs}.
        // adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(this,songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = findViewById(R.id.englishSongsList);

        // Make the {@link ListView} use the {@link SongsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Songs} in the list.
        listView.setAdapter(adapter);

    }
}
