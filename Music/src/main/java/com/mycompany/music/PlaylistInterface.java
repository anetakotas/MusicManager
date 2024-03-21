/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music;

import java.util.ArrayList;

/**
 *
 * @author necia
 */
public interface PlaylistInterface {
    public void addSong(Song song);
    public void deleteSong(int index);
    public boolean searchSong(String title);
    public int size();
    public void repeat();
    public void moveTo(String playlistName);
    public ArrayList<Song> getSongs();
    public Song getSong(int index);
}
