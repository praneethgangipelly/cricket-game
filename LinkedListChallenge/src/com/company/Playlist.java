package com.company;

import java.util.ArrayList;

public class Playlist extends music {
    String name;
    ArrayList<Song> playlist ;

    public Playlist(String name, ArrayList<Album> albums, String name1, ArrayList<Song> playlist) {
        super(name);
        this.name = name1;
        this.playlist = playlist;
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<Song> getPlaylist() {
        return playlist;
    }

    public Album searchAlbum(String name){
        this.name = name;
        ArrayList<Album> foundAlbums = getAlbums();

        for (int i= 0;i<foundAlbums.size();i++){
            if(name.equals(foundAlbums.get(i).getAlbumName())){
                return  foundAlbums.get(i);


            }System.out.println("Album found"+name);
        }
return null;
    }

}
