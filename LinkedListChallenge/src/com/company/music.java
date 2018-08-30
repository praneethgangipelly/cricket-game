package com.company;

import java.util.ArrayList;

public class music {
   private String name;
    ArrayList<Album> albums;

    public music(String name) {
        this.name = name;
        this.albums = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }
    public Album AddAlbum(String name){
        Album album = new Album(name);
        System.out.println("Album "+name+"ïs added");
        return album;

    }
}
