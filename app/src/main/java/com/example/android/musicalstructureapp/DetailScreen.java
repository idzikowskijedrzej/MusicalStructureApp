package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class DetailScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_screen);

        /*Intent intent =new Intent (Album.this, DetailScreen.class);
        intent.putExtra("position", myList.get(position));
        intent.putExtra("cover", cover);
        intent.putExtra("albumName", album);
        intent.putExtra("artistName", artist);*/

        //Find all view components
        ImageView topAlbumCover = findViewById(R.id.cover_image);
        ImageView mainCover = findViewById(R.id.mainCover);
        TextView topAlbumName = findViewById(R.id.topAlbumName);
        TextView bandTextView = findViewById(R.id.topArtistName);
        TextView trackName = findViewById(R.id.trackName);

        //Collect extras
        Bundle extras = getIntent().getExtras();
        String position = extras.getString("position");
        int cover = extras.getInt("cover");
        String album = extras.getString("albumName");
        String artist = extras.getString("artistName");


        //Set elements
        topAlbumCover.setImageResource(cover);
        mainCover.setImageResource(cover);
        topAlbumName.setText(album);
        bandTextView.setText(artist);
        trackName.setText(position);
    }
}
