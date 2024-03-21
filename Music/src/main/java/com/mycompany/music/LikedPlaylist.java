/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Aneta Kotas, HCCOMPE2
 * @date March 2024
 * For Data Structures and Algorithms class.
 */
//Liked playlist creates a skeleton for liked playlist list and it uses playlist interface, which guarantees that all neccessairy functions will be in the class
public class LikedPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> liked = new ArrayList<Song>();

    //Adds song to the liked list
    @Override
    public void addSong(Song song) {
        liked.add(song);
    }

    //Removes chosen song from a list
    @Override
    public void deleteSong(int index) {
        liked.remove(index);
    }

    //Searches song in a playlist and returns a different message depending on the input
    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < liked.size(); i++) {
            if(liked.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the Liked Playlist!");
                found = true;
            }
        }
        if(found == false) {
            JOptionPane.showMessageDialog(null, "Not found!");
        }
        return found;
    }

    //Returns size of the playlist
    @Override
    public int size() {
        return liked.size();
    }

    //Returns all songs in the playlist
    @Override
    public ArrayList<Song> getSongs() {
        return liked;
    }

    //Returns single particular song from the playlist
    @Override
    public Song getSong(int index) {
        return liked.get(index);
    }
    
    
}
