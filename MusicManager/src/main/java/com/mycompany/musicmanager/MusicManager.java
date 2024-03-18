/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.musicmanager;

/**
 *
 * @author Aneta
 */
public class MusicManager {

    public static void main(String[] args) {
        Playlist general = new Playlist();
        Playlist genre_one = new Playlist();
        Playlist genre_two = new Playlist();
        Playlist liked = new Playlist();
        MusicGUI gui = new MusicGUI(general, genre_one, genre_two);
        MusicGUI gui = new MusicGUI();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);

    }
}
