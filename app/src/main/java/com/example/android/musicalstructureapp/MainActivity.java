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

        final ArrayList<Track> albumsList = new ArrayList<>();
        albumsList.add(new Track(getString(R.string.album1), getString(R.string.artist1), R.drawable.revolver));
        albumsList.add(new Track(getString(R.string.album2), getString(R.string.artist2), R.drawable.disraeli));
        albumsList.add(new Track(getString(R.string.album3), getString(R.string.artist3), R.drawable.doors));
        albumsList.add(new Track(getString(R.string.album4), getString(R.string.artist4), R.drawable.jimi));
        albumsList.add(new Track(getString(R.string.album5), getString(R.string.artist5), R.drawable.nutgone));
        albumsList.add(new Track(getString(R.string.album6), getString(R.string.artist6), R.drawable.bigpink));
        albumsList.add(new Track(getString(R.string.album7), getString(R.string.artist7), R.drawable.truth));
        albumsList.add(new Track(getString(R.string.album8), getString(R.string.artist8), R.drawable.electriclayland));
        albumsList.add(new Track(getString(R.string.album9), getString(R.string.artist9), R.drawable.abbeyroad));

        TrackAdapter mAdapter = new TrackAdapter(this, albumsList);
        ListView listView = findViewById(R.id.albums_list);
        listView.setAdapter(mAdapter);

        //Add event listener so we can handle clicks
        AdapterView.OnItemClickListener adapterViewListener = new
                AdapterView.OnItemClickListener() {
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Track track = albumsList.get(position);
                        Intent intent = new Intent(MainActivity.this, Album.class);
                        intent.putExtra("musicName", track.getTrackName());
                        intent.putExtra("bandName", track.getArtistName());
                        intent.putExtra("imageResourceId", track.getAlbumCover());
                        startActivity(intent);
                    }
                };
        //Set the listener to the list view
        listView.setOnItemClickListener(adapterViewListener);
    }
}
