/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music;

import java.util.ArrayList;

/**
 * @author Aneta Kotas, HCCOMPE2
 * @date March 2024
 * For Data Structures and Algorithms class.
 */
//Playlist interface for playlist classes. It defines what method have to be present in the classes
public interface PlaylistInterface {
    public void addSong(Song song);
    public void deleteSong(int index);
    public boolean searchSong(String title);
    public int size();
    public ArrayList<Song> getSongs();
    public Song getSong(int index);
}
