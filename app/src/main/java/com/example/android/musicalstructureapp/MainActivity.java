package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ListView listView = (ListView) findViewById(R.id.albums_list);
        final ArrayList<Track> albumsList = new ArrayList<>();
        albumsList.add(new Track(getResources().getString(R.string.album1), getResources().getString(R.string.artist1), R.drawable.revolver));
        albumsList.add(new Track(getResources().getString(R.string.album2), getResources().getString(R.string.artist2), R.drawable.disraeli));
        albumsList.add(new Track(getResources().getString(R.string.album3), getResources().getString(R.string.artist3), R.drawable.doors));
        albumsList.add(new Track(getResources().getString(R.string.album4), getResources().getString(R.string.artist4), R.drawable.jimi));
        albumsList.add(new Track(getResources().getString(R.string.album5), getResources().getString(R.string.artist5), R.drawable.nutgone));
        albumsList.add(new Track(getResources().getString(R.string.album6), getResources().getString(R.string.artist6), R.drawable.bigpink));
        albumsList.add(new Track(getResources().getString(R.string.album7), getResources().getString(R.string.artist7), R.drawable.truth));
        albumsList.add(new Track(getResources().getString(R.string.album8), getResources().getString(R.string.artist8), R.drawable.electriclayland));
        albumsList.add(new Track(getResources().getString(R.string.album9), getResources().getString(R.string.artist9), R.drawable.abbeyroad));

        TrackAdapter mAdapter = new TrackAdapter(this, albumsList);

        listView.setAdapter(mAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Track song = albumsList.get(position);
                Intent i = new Intent(MainActivity.this , Album.class);
                i.putExtra("songName", song.getTrackName());
                i.putExtra("songArtist", song.getArtistName());
                i.putExtra("songCover", song.getAlbumCover());
                startActivity(i);
            }
        });


    }
}
