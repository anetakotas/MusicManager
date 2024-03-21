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
//General playlist creates a skeleton for general playlist list and it uses playlist interface, which guarantees that all neccessairy functions will be in the class
public class GeneralPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> general = new ArrayList<Song>();

    //Deletes song from a playlist
    @Override
    public void deleteSong(int index) {
        general.remove(index);
    }

    //Searches song in a playlist and returns a different message depending on the input
    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < general.size(); i++) {
            if(general.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the General Playlist!");
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
        return general.size();
    }

    //Adds a new song to the playlist
    @Override
    public void addSong(Song song) {
        general.add(song);
    }
    
    //Returns all songs in the playlist
    @Override
    public ArrayList<Song> getSongs() {
        return general;
    }
    
    //Returns one song from a playlist according to the index
    @Override
    public Song getSong(int index) {
        return general.get(index);
    }
    
}
