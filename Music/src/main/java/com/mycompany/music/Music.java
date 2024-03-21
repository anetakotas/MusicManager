/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.music;

/**
 * @author Aneta Kotas, HCCOMPE2
 * @date March 2024
 * For Data Structures and Algorithms class.
 */
//Method which runs the program and makes GUI visible to the user
public class Music {

    public static void main(String[] args) {
        MusicGUI gui = new MusicGUI();
        gui.setVisible(true);
        gui.setLocationRelativeTo(null);
        
    }
}
