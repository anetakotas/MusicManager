/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music;

/**
 *
 * @author necia
 */
public class Song {
    String title, author, genre;
    boolean liked;

    public Song(String title, String author, String genre, boolean liked) {
        this.title = title;
        this.genre = genre;
        this.author = author;
        this.liked = liked;
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

    public void setLiked(boolean liked) {
        this.liked = liked;
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

    public boolean getLiked() {
        return liked;
    }
    
    @Override
    public String toString() {
        return title + " - " + author + " - " + genre + " - " + liked;
    }
}
