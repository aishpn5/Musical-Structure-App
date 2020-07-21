package com.example.musicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class HindiSongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi_songs);

        // Create a list of songs
        ArrayList<Songs> songs = new ArrayList<Songs>();
        songs.add(new Songs("Kalank", "Pritam"));
        songs.add(new Songs("Sambhaal Rakhiyaan", "Rochak Kohli"));
        songs.add(new Songs("Slow Motion", "Vishal-Shekhar"));
        songs.add(new Songs("Channa", "Rimi Dhar"));
        songs.add(new Songs("Rajvaadi Odhni", "Pritam"));
        songs.add(new Songs(" Dil Aziz", "Subhash Kumar"));
        songs.add(new Songs("The Jawaani Song", "Vishal-Shekhar"));
        songs.add(new Songs("Ik Mod", "Rochak Kohli"));
        songs.add(new Songs("Fakira", "Vishal-Shekhar"));
        songs.add(new Songs("Aira Gaira", "Pritam"));

        // Create an {@link SongsAdapter}, whose data source is a list of {@link Songs}.
        // adapter knows how to create list items for each item in the list.
        SongsAdapter adapter = new SongsAdapter(this,songs);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        ListView listView = (ListView) findViewById(R.id.hindiSongsList);

        // Make the {@link ListView} use the {@link SongsAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Songs} in the list.
        listView.setAdapter(adapter);


    }
}

