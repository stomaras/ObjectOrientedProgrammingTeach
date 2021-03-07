package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;


    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    private Song findSong(String titleOfSong) {
        for (int i = 0; i < songs.size(); i++) {
            if (songs.get(i).getTitle() == titleOfSong){
                Song newSong = this.songs.get(i);
                return newSong;
            }
        }
        return null;
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        if (findSong(titleOfSong) == null) {
            this.songs.add(new Song(titleOfSong,durationOfSong));
            return true;
        }
        System.out.println("This song already exists in the songs list");
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = 0;
        if ((index >= 0) && (index < songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This song with trackNumber: " + trackNumber + " does not exist ");
        return false;
    }

    public boolean addToPlayList(String titleOfSong, LinkedList<Song> playList) {
        if (findSong(titleOfSong) != null) {
            playList.add(findSong(titleOfSong));
            System.out.println("This song with title " + titleOfSong + " added to the playList ");
            return true;
        }
        System.out.println("This song with title : " + titleOfSong + " is invalid ");
        return false;
    }

}
