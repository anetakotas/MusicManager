/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.musicmanager;

import java.util.ArrayList;

/**
 *
 * @author Aneta
 */
public class Playlist {
    String playlistName;
    int songsAmount;
    ArrayList<Song> allSongs = new ArrayList<Song>();

    public Playlist(String playlistName, int songsAmount) {
        this.playlistName = playlistName;
        this.songsAmount = songsAmount;
    }
    
    public void addSong(String title, String genre, String author, String duration) {
        Song song = new Song(title, genre, author, duration);
        allSongs.add(song);
    }
}
