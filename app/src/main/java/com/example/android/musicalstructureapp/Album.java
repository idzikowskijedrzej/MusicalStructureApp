package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album1);


        //Find all our view components
        ImageView imageView = findViewById(R.id.cover_image);
        TextView topAlbumName = findViewById(R.id.topAlbumName);
        TextView bandTextView = findViewById(R.id.topArtistName);

        //Collect our intent and populate our layout
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        int cover = extras.getInt("imageResourceId");
        String album = intent.getStringExtra("albumName");
        String artist = intent.getStringExtra("artistName");

        //Set elements
        imageView.setImageResource(cover);
        topAlbumName.setText(album);
        bandTextView.setText(artist);
    }
}
