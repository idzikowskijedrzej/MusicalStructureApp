package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);

        //Find all view components
        ImageView imageView = findViewById(R.id.cover_image);
        TextView topAlbumName = findViewById(R.id.topAlbumName);
        TextView bandTextView = findViewById(R.id.topArtistName);
        ListView trackList = findViewById(R.id.track_list);
        TextView nowPlaying = findViewById(R.id.nowPlaying);

        //Collect extras
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        int cover = extras.getInt("imageResourceId");
        String album = intent.getStringExtra("albumName");
        String artist = intent.getStringExtra("artistName");

        //Set elements
        imageView.setImageResource(cover);
        topAlbumName.setText(album);
        bandTextView.setText(artist);

        final ArrayList<String> myList = new ArrayList<>();
        addTracks(myList, getResources().getStringArray(R.array.trackList));
        initAdapter(trackList, myList, album, nowPlaying);

    }
    private void initAdapter(ListView trackList, final ArrayList<String> list, final String album, final TextView nowPlaying){
        trackList.setAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, list));
        trackList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                nowPlaying.setText(album + " - " +  list.get(position));
            }
        });
    }
    private void addTracks(ArrayList<String>list , String[] tracks){
        list.add(tracks[0]);
        list.add(tracks[1]);
        list.add(tracks[2]);
        list.add(tracks[3]);
        list.add(tracks[4]);
        list.add(tracks[5]);
        list.add(tracks[6]);
        list.add(tracks[7]);
        list.add(tracks[8]);
        list.add(tracks[9]);
        list.add(tracks[10]);
        list.add(tracks[11]);
        list.add(tracks[12]);
        list.add(tracks[13]);
        list.add(tracks[14]);
        list.add(tracks[15]);
        list.add(tracks[16]);
        list.add(tracks[17]);
    }
}
