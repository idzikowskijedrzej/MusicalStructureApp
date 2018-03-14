package com.example.android.musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jedrzej on 2018-02-25.
 */

public class TrackAdapter extends ArrayAdapter <Track> {
    private Context mContext;
    private List<Track> trackList = new ArrayList<>();

    public TrackAdapter(@NonNull Context context, ArrayList<Track> list) {
        super(context, 0 , list);
        mContext = context;
        trackList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null) {
            listItem = LayoutInflater.from(mContext).inflate(
                    R.layout.list_item_track,parent,false);
        }

        Track currentTrack = getItem(position);

        TextView trackName = listItem.findViewById(R.id.trackName);
        trackName.setText(currentTrack.getTrackName());

        TextView artistName = listItem.findViewById(R.id.artistName);
        artistName.setText(currentTrack.getArtistName());

        ImageView albumCover = listItem.findViewById(R.id.albumCover);
        albumCover.setImageResource(currentTrack.getAlbumCover());

        return listItem;
    }
}
