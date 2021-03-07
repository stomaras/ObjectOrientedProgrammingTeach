package com.company;

import java.util.*;

// write your code here
// Create a program that implements a playList for songs.
// Create a Song class having Title nad Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList.
// Songs from different albums can be added to the playList and will appear in the list in the order they are added.
// Once the songs have been added to the playList, create a menu of options to:-
// 0: Quit
// 1: Skip Forward to the next song
// 2: Skip Backwards to the previous song.
// 3: Replay the current song.
// 4: List the songs in the playList
// A song must exist in an album before it can be added to the playlist (so you can only play songs that you own).
// Hint: To replay a Song, consider what happened when we went back and forward from a city before we started
// tracking the direction we were doing.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listIterator.remove().
public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();


    public static void main(String[] args) {

        Album newAlbum = new Album("Appetite for destruction", "Guns n Roses");
        newAlbum.addSong("Yesterdays", 4.47);
        newAlbum.addSong("Sweet Child O Mine", 5.34);
        newAlbum.addSong("November Rain", 7.23);
        albums.add(0,newAlbum);

        newAlbum = new Album("Crazy World", "Scorpions");
        newAlbum.addSong("Wind Of Change", 5.33);
        newAlbum.addSong("Restless Nights", 5.43);
        newAlbum.addSong("Lust or Love", 4.22);
        newAlbum.addSong("Kicks After Six", 3.33);
        albums.add(1,newAlbum);

        LinkedList<Song> playList = new LinkedList<Song>();

        albums.get(0).addToPlayList("Yesterdays", playList);
        albums.get(0).addToPlayList("November Rain", playList);
        albums.get(0).addToPlayList("Sweet Child O Mine", playList);
        albums.get(1).addToPlayList("Wind Of Change", playList);
        albums.get(1).addToPlayList("Restless Nights", playList);
        albums.get(1).addToPlayList("Lust or Love", playList);
        albums.get(1).addToPlayList("Kicks After Six", playList);

        play(playList);

    }

    public static void play(LinkedList<Song> playList) {
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        Scanner scanner = new Scanner(System.in);

        if (playList.size() == 0) {
            System.out.println("No songs in playList");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("PlayList exit");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Song in playList: " + listIterator.next().toString());
                    }else{
                        System.out.println("End Of List");
                        forward = true;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("We have reached at the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if(listIterator.hasPrevious()) {
                            System.out.println("Now playing" + listIterator.previous());
                        }
                    }
                    break;
            }
        }



    }

    public static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - to replay the current song\n" +
                    "4 - list songs in the playlist\n" +
                    "5 - print available actions.\n" +
                    "6 - delete current song from playList.");
    }

    public static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("======================================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("========================================");
    }
}
