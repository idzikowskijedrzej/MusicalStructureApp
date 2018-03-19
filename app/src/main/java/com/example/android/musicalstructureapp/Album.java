package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;

public class Album extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album1);

        //Find all view components
        final ImageView imageView = findViewById(R.id.cover_image);
        TextView topAlbumName = findViewById(R.id.topAlbumName);
        TextView bandTextView = findViewById(R.id.topArtistName);
        ListView trackList = findViewById(R.id.track_list);

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
        initAdapter(trackList,cover, myList, album, artist);
    }

    private void initAdapter(ListView trackList, final int cover, final ArrayList<String> myList, final String album, final String artist){
        trackList.setAdapter(new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, myList));
        trackList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent =new Intent (Album.this, DetailScreen.class);
                intent.putExtra("position", myList.get(position));
                intent.putExtra("cover", cover);
                intent.putExtra("albumName", album);
                intent.putExtra("artistName", artist);
                startActivity(intent);
            }
        });
    }
    private void addTracks(ArrayList<String>myList , String[] tracks){
        myList.add(tracks[0]);
        myList.add(tracks[1]);
        myList.add(tracks[2]);
        myList.add(tracks[3]);
        myList.add(tracks[4]);
        myList.add(tracks[5]);
        myList.add(tracks[6]);
        myList.add(tracks[7]);
        myList.add(tracks[8]);
        myList.add(tracks[9]);
        myList.add(tracks[10]);
        myList.add(tracks[11]);
        myList.add(tracks[12]);
        myList.add(tracks[13]);
        myList.add(tracks[14]);
        myList.add(tracks[15]);
        myList.add(tracks[16]);
        myList.add(tracks[17]);
    }
}
