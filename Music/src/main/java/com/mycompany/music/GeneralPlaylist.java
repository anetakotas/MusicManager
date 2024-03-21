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
public class GeneralPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> general = new ArrayList<Song>();

    @Override
    public void deleteSong(int index) {
        general.remove(index);
    }

    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < general.size(); i++) {
            if(general.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the General Playlist!");
                found = true;
            }
        }
        return found;
    }

    @Override
    public int size() {
        return general.size();
    }

    @Override
    public void repeat() {
        JOptionPane.showMessageDialog(null, "Now playlist is set on repeat!");
    }

    @Override
    public void moveTo(String playlistName) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void addSong(Song song) {
        general.add(song);
    }
    
    @Override
    public ArrayList<Song> getSongs() {
        return general;
    }
    
    @Override
    public Song getSong(int index) {
        return general.get(index);
    }
    
}
