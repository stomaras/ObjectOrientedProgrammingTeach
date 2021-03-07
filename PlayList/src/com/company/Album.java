package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

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
            if (songs.get(i).getTitle() == titleOfSong) {
                return this.songs.get(i);
            }
        }
        return null;
    }

    public boolean addSong(String titleOfSong, double durationOfSong) {
        if (findSong(titleOfSong) == null) {
            this.songs.add(new Song(titleOfSong, durationOfSong));
            return true;
        }
        return false;
    }

    // We are gonna create this playlist method and we are gonna actually add the extra songs
    // that are part of this album to that playlist.
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album ");
        return false;
    }




}
