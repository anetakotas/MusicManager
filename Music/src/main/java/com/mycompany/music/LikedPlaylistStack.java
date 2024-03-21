/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.music;

import java.util.Stack;

/**
 * @author Aneta Kotas, HCCOMPE2
 * @date March 2024
 * For Data Structures and Algorithms class.
 */
//Liked playlist stack implementation which uses a stack interface
public class LikedPlaylistStack implements StackInterface {
    Stack<Song> stack = new Stack<>();
    
    //Checked if stack is empty
    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    //Adds song to the top of the stack
    @Override
    public void push(Song song) {
        stack.push(song);
    }

    //Deletes last added item from the stack
    @Override
    public Song pop() {
        stack.remove(0);
        return null;
    }

    //Returns size of the stack
    @Override
    public int size() {
        return stack.size();
    }
    
    //Converts lists items to strings 
    @Override
    public String toString() {
        return stack.toString();
    }
    

}
