package com.company;

import java.util.ArrayList;

public class Album {
    private String AlbumName;
   private ArrayList<Song> Thealbum ;


    public Album(String albumName) {
        AlbumName = albumName;
        this.Thealbum = new ArrayList<>();
    }

    public String getAlbumName() {
        return AlbumName;
    }

    public ArrayList<Song> getThealbum() {
        return Thealbum;
    }

    public  Song AddSong(String title, String duration){
        Song song = new Song(title,duration);
        return song;
    }


}
