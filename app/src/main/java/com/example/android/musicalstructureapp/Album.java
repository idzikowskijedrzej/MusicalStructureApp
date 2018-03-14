package com.example.android.musicalstructureapp;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;


public class Album extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album1);

        String title;
        String author;
        int coverID;

        TextView trackTitle = findViewById(R.id.tv_albumName);
        TextView artistName = findViewById(R.id.tv_artistName);

        ImageView cover = findViewById(R.id.cover_image);


        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if (extras == null) {
                title = "Tytulik";
                author = "Autorek";
                coverID = R.drawable.bigpink;
            } else {
                title = extras.getString("trackName");
                author = extras.getString("trackArtist");
                coverID = extras.getInt("trackCover");
            }

            trackTitle.setText(title);
            artistName.setText(author);
            cover.setImageResource(coverID);
        }
    }
}
