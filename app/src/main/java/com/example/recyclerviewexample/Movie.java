package com.example.recyclerviewexample;

public class Movie {
    private String name;
    private String year;
    private String directorName;

    public Movie(String name, String directorName, String year) {
        this.name = name;
        this.directorName = directorName;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public String getDirectorName() {
        return directorName;
    }
    public String getYear() {
        return year;
    }
}