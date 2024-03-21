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
//Pop playlist creates a skeleton for pop playlist list and it uses playlist interface, which guarantees that all neccessairy functions will be in the class
public class PopPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> pop = new ArrayList<Song>();
    
    //Adds song to the list
    @Override
    public void addSong(Song song) {
        pop.add(song);
    }

    //Deletes song from the playlist
    @Override
    public void deleteSong(int index) {
        pop.remove(index);
    }

    //Iterates through entire playlist looking for the song, then tells user the outcome
    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < pop.size(); i++) {
            if(pop.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the Pop Playlist!");
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
        return pop.size();
    }

    //Returns the list
    @Override
    public ArrayList<Song> getSongs() {
        return pop;
    }

    //Returns chosen song from the list
    @Override
    public Song getSong(int index) {
        return pop.get(index);
    }
    
}
