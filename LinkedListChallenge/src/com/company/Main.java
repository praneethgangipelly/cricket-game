package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Song song1 = new Song("title1","1");
        Song song2 = new Song("title2","2");
        Song song3 = new Song("title3","3");
        Song song4 = new Song("title4","4");
        Song song5 = new Song("title5","5");
        Song song6 = new Song("title6","6");
        Song song7 = new Song("title7","7");
        Song song8 = new Song("title8","8");
        Album album1 = new Album("A");
        Album album2 = new Album("B");
        Album album3 = new Album("C");
        Album album4 = new Album("D");
        album1.AddSong("a","1");
        album1.AddSong("b","2");
        music music = new music("music1");
music.getAlbums();
    }
}
