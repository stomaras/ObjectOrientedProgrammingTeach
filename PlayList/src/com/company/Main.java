package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {
	// write your code here
    // Create a program that implements a playlist of songs
    // To start you off, implement the following classes
    // 1. Album
    // - it has three fields, two String s called name and artist, and an ArrayList that holds
    //   objects of Type Song called songs
    // - A constructor that accepts two Strings(name of the album and artist). It initialises the fields
    //   and instantiates songs.
    // - And three methods, they are:
    //      - addSong(), has two parameters of type String(title of song), double(duration of song) and returns
    //        a boolean. Returns true if the song was added successfully or false otherwise.
    //      - findSong(), has one parameter of type String(title of song) and returns a Song.
    //        Returns thee Song if it exists, null if it does not exists.
    //      - addToPlayList(), has two parameters of type int(track number of song in album) and LinkedList(the playlist)
    //        that holds objects of type Song, and returns a boolean.Returns true if it exists and it was added successfully
    //        using the track number, or false otherwise.
    // - addToPlayList(), has two parameters of type String(title of song) and LinkedList (the playlist) that holds
    //   objects of type Song, and returns a boolean. Returns true if it exists and it was added successfully using
    //   the name of the song, or false otherwise.
    // 2. Song
    // - It has two fields, a String called title and a double called duration.
    // - A constructor that accepts a String(title of the song) and a double(duration of the song). It initialises
    //   title and duration.
    // - And two methods they are:
    //   - getTitle(), getter for title.
    //   - toString(), Songs overriding toString method. Returns a String in the following format: "title: duration"
    // TIP: In Album, use the findSong() method in addSong() and addToPLayList(String,LinkedList) to check if a song
    //      exists before proceeding
    // TIP: Be extremely careful about spaces and spelling in the returned String from the toString() method


    // Create a program that implements a playlist for songs
    // Create a Song class having Title and Duration for a song.
    // The program will have an Album class containing a list of songs.
    // The albums will be stored in an ArrayList
    // Songs from different albums can be added to the playlist and will appear in the list in the order
    // they are added.
    // Once the songs have benn added to the playlist, create a menu of options to:-
    // Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song.
    // List the songs in the playlist.
    // A song must exist in an album before it can be added to the playlist ( so you can only play songs that you own).
    // Hint: To replay a song, consider what happened when we went back and forth from a city before we
    // started tracking the direction we were doing.
    // As an optional extra, provide an option to remove the current song from the playlist
    //(hint: listiterator.remove())

        Album newAlbum = new Album("Appetite For Destruction", "Gun's n roses");
        newAlbum.addSong("Yesterdays", 04.45);
        newAlbum.addSong("November Rain", 07.02);
        newAlbum.addSong("Sweet child of Mine", 06.07);
        albums.add(newAlbum);

        newAlbum = new Album("For those about to rock", "AC/DC");
        newAlbum.addSong("I put the finger on you", 05.32);
        newAlbum.addSong("Night of the lonly knives", 05.30);
        albums.add(newAlbum);



        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("Yesterdays", playList);
        albums.get(0).addToPlayList("November Rain", playList);
        albums.get(0).addToPlayList("Sweet child of Mine",playList);


        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;

        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("No songs in playList");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the playList");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("We are at the start of the playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    break;
                case 4:
                    //printList(playList);
                    break;
                case 5:
                    //printMenu();
                    break;
            }


        }
    }
}
