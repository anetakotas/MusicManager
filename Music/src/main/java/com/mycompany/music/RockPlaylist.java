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
public class RockPlaylist implements PlaylistInterface {
    private String playlistName;
    private int songsAmount;
    public ArrayList<Song> rock = new ArrayList<Song>();
    
    @Override
    public void addSong(Song song) {
        rock.add(song);
    }

    @Override
    public void deleteSong(int index) {
        rock.remove(index);
    }

    @Override
    public boolean searchSong(String title) {
        boolean found = false;
        for(int i = 0; i < rock.size(); i++) {
            if(rock.get(i).getTitle().equalsIgnoreCase(title)) {
                JOptionPane.showMessageDialog(null, "Song titled '" + title + "' appears in your collection!\nSong's position is: " + (i + 1) + ", on the Rock Playlist!");
                found = true;
            }
        }
        return found;
    }

    @Override
    public int size() {
        return rock.size();
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
        return rock;
    }

    @Override
    public Song getSong(int index) {
        return rock.get(index);
    }
    
}
