/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author necia
 */
public class LikedPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> liked = new ArrayList<Song>();

    @Override
    public void addSong(Song song) {
        liked.add(song);
    }

    @Override
    public void deleteSong(int index) {
        liked.remove(index);
    }

    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < liked.size(); i++) {
            if(liked.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the Liked Playlist!");
                found = true;
            }
        }
        return found;
    }

    @Override
    public int size() {
        return liked.size();
    }

    @Override
    public void repeat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void moveTo(String playlistName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Song> getSongs() {
        return liked;
    }

    @Override
    public Song getSong(int index) {
        return liked.get(index);
    }
    
    
}
