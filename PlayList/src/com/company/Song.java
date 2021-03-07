package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public double getDuration() {
        return duration;
    }

    // It's a quick way to actually output the content of an actual object.


    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
