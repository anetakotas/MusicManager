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
//Rock playlist creates a skeleton for rock playlist list and it uses playlist interface, which guarantees that all neccessairy functions will be in the class
public class RockPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> rock = new ArrayList<Song>();
    
    //Adds a new song to the list
    @Override
    public void addSong(Song song) {
        rock.add(song);
    }

    //Deletes chosen song
    @Override
    public void deleteSong(int index) {
        rock.remove(index);
    }

    //Iterates through entire playlist looking for the song, then tells user the outcome
    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < rock.size(); i++) {
            if(rock.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the Rock Playlist!");
                found = true;
            }
        }
        if(found == false) {
            JOptionPane.showMessageDialog(null, "Not found!");
        }
        return found;
    }

    //Returns playlists size
    @Override
    public int size() {
        return rock.size();
    }

    //Returns whole playlist
    @Override
    public ArrayList<Song> getSongs() {
        return rock;
    }

    //Returns chosen song
    @Override
    public Song getSong(int index) {
        return rock.get(index);
    }
    
}
