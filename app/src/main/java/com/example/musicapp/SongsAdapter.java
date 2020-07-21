package com.example.musicapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link SongsAdapter} is an {@link ArrayAdapter} that can provide the layout for each list item
 * based on a data source, which is a list of {@link Songs} objects.
 */
public class SongsAdapter extends ArrayAdapter<Songs>  {

    /**
     * Create a new {@link SongsAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param songs is the list of {@link Songs}s to be displayed.
     */
    public SongsAdapter(Context context, ArrayList<Songs>songs) {
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Songs} object located at this position in the list
        Songs currentSongs = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID singer_text_view.
        TextView singerTextView = convertView.findViewById(R.id.singer_text_view);
        singerTextView.setText(currentSongs.getSinger());

        // Find the TextView in the list_item.xml layout with the ID song_text_view.
        TextView songTextView = convertView.findViewById(R.id.song_text_view);
        songTextView.setText(currentSongs.getSong());

        // Return the whole list item layout so that it can be shown in
        // the ListView.
        return convertView;
    }
}
