/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicmanager;

/**
 *
 * @author Aneta
 */
public class Song {
    String title, genre, author;
    double duration;

    public Song(String title, String genre, String author, double duration) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.duration = duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public double getDuration() {
        return duration;
    }
    
    
}
