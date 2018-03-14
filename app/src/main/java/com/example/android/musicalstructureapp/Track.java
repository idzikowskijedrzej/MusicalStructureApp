package com.example.android.musicalstructureapp;

/**
 * Created by Jedrzej on 2018-02-25.
 */

public class Track {
    // Store Track name
    private String mTrackName;
    // Store Artist name
    private String mArtistName;
    private int mAlbumCover;

    // Constructor used to create track objects
    public Track(String trackName, String artistName, int albumCover) {
        mTrackName = trackName;
        mArtistName = artistName;
        mAlbumCover = albumCover;
    }

    public String getTrackName() {
        return mTrackName;
    }


    public String getArtistName() {
        return mArtistName;
    }


    public int  getAlbumCover(){
        return mAlbumCover;
    }
}
