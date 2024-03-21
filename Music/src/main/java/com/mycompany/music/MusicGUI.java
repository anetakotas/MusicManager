/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.music;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 * @author Aneta Kotas, HCCOMPE2
 * @date March 2024
 * For Data Structures and Algorithms class.
 */
//Main method which runs all the code and implements GUI code
public class MusicGUI extends javax.swing.JFrame {

    /**
     * Creates new form MusicGUI
     */
    
    //Creating list models, creating playlists and initial variables
    DefaultListModel generalModel, likedModel, popModel, rockModel;
    GeneralPlaylist generalPlaylist;
    LikedPlaylist likedPlaylist;
    PopPlaylist popPlaylist;
    RockPlaylist rockPlaylist;
    int pressedSongIndex;
    LikedPlaylistStack stack;
    
    public MusicGUI() {
        initComponents();
        //Instantiating playlists and list models
        generalModel = new DefaultListModel();
        likedModel = new DefaultListModel();
        popModel = new DefaultListModel();
        rockModel = new DefaultListModel();

        generalPlaylist = new GeneralPlaylist();
        likedPlaylist = new LikedPlaylist();
        popPlaylist = new PopPlaylist();
        rockPlaylist = new RockPlaylist();
        
        //Creating stack playlist
        stack = new LikedPlaylistStack();
        
        //Adding example songs to each playlist
        Song song1 = new Song("I like you", "BamBam", "Pop", false);
        Song song2 = new Song("Mama", "Brothers", "Rock", false);
        Song song3 = new Song("Lorem Ipsum", "Nerds", "Pop", false);
        Song song4 = new Song("Ipsumpsum", "Nerds", "Pop", true);
        Song song5 = new Song("XOXO", "BamBam", "Pop", false);
        Song song6 = new Song("BOBO", "Nerds", "Rock", false);
        
        generalPlaylist.addSong(song1);
        generalPlaylist.addSong(song2);
        generalPlaylist.addSong(song3);
        
        likedPlaylist.addSong(song4);
        
        popPlaylist.addSong(song5);
        
        rockPlaylist.addSong(song6);
        
        
        //Those 4 loops loop though each playlists, taking songs and adding them to list models 
        //After that models are being connected with displays and data appears on the jlists
        for (Song song: generalPlaylist.getSongs()) {
            generalModel.addElement(song);
        }
        generalDisplay.setModel(generalModel);
        
        for (Song song: likedPlaylist.getSongs()) {
            likedModel.addElement(song);
            stack.push(song);
        }
        likedDisplay.setModel(likedModel);
        
        for (Song song: popPlaylist.getSongs()) {
            popModel.addElement(song);
        }
        popDisplay.setModel(popModel);
        
        for (Song song: rockPlaylist.getSongs()) {
            rockModel.addElement(song);
        }
        rockDisplay.setModel(rockModel);
        

        
        //Those are listeners added to displays which then tell the program which item on the list got selected in real time
        //That creates an index which is later used to malipulate data on the jlists
        generalDisplay.getSelectionModel().addListSelectionListener(x -> {
            pressedSongIndex = generalDisplay.getSelectedIndex();
            //Testing if pressed song gives the right vaule
            System.out.println(pressedSongIndex);
        });
        
        likedDisplay.getSelectionModel().addListSelectionListener(x -> {
            pressedSongIndex = likedDisplay.getSelectedIndex();
            //Testing if pressed song gives the right vaule
            System.out.println(pressedSongIndex);
        });
        
        popDisplay.getSelectionModel().addListSelectionListener(x -> {
            pressedSongIndex = popDisplay.getSelectedIndex();
            //Testing if pressed song gives the right vaule
            System.out.println(pressedSongIndex);
        });
        
        rockDisplay.getSelectionModel().addListSelectionListener(x -> {
            pressedSongIndex = rockDisplay.getSelectedIndex();
            //Testing if pressed song gives the right vaule
            System.out.println(pressedSongIndex);
        });
        
        //Testing if overwritten toString method works
        System.out.println(stack.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        titleText1 = new javax.swing.JLabel();
        titleText2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        likedDisplay = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        generalDisplay = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        popDisplay = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        rockDisplay = new javax.swing.JList<>();
        allSongsLabel = new javax.swing.JLabel();
        likedSongsLabel = new javax.swing.JLabel();
        popSongsLabel = new javax.swing.JLabel();
        rockSongsLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        titleText = new javax.swing.JTextField();
        authorText = new javax.swing.JTextField();
        radioPop = new javax.swing.JRadioButton();
        radioRock = new javax.swing.JRadioButton();
        moveLiked = new javax.swing.JButton();
        movePop = new javax.swing.JButton();
        moveRock = new javax.swing.JButton();
        deleteSong = new javax.swing.JButton();
        searchSong = new javax.swing.JButton();
        playlistSize = new javax.swing.JButton();
        playlistRepeat = new javax.swing.JButton();
        addSong = new javax.swing.JButton();

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleText1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        titleText1.setText("Music Manager");

        titleText2.setText("Manage your music using this App!");

        likedDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(likedDisplay);

        generalDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(generalDisplay);

        popDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(popDisplay);

        rockDisplay.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane6.setViewportView(rockDisplay);

        allSongsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        allSongsLabel.setText("Your All Songs:");

        likedSongsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        likedSongsLabel.setText("Your Liked Songs:");

        popSongsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        popSongsLabel.setText("Your Pop Songs:");

        rockSongsLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        rockSongsLabel.setText("Your Rock Songs:");

        titleLabel.setText("Title:");

        authorLabel.setText("Author:");

        genreLabel.setText("Genre:");

        titleText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                titleTextActionPerformed(evt);
            }
        });

        radioPop.setText("Pop");

        radioRock.setText("Rock");

        moveLiked.setText("Move to: Liked Songs");
        moveLiked.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveLikedActionPerformed(evt);
            }
        });

        movePop.setText("Move to: Pop Songs");
        movePop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movePopActionPerformed(evt);
            }
        });

        moveRock.setText("Move to: Rock Songs");
        moveRock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moveRockActionPerformed(evt);
            }
        });

        deleteSong.setText("Delete Song");
        deleteSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteSongActionPerformed(evt);
            }
        });

        searchSong.setText("Search Song");
        searchSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSongActionPerformed(evt);
            }
        });

        playlistSize.setText("Playlist Size");
        playlistSize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistSizeActionPerformed(evt);
            }
        });

        playlistRepeat.setText("Playlist Repeat");
        playlistRepeat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                playlistRepeatActionPerformed(evt);
            }
        });

        addSong.setText("Add Song");
        addSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addSongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(genreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(radioPop, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(radioRock, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(authorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(2, 2, 2)
                            .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(addSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(titleText1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deleteSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchSong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playlistSize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(playlistRepeat, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                    .addComponent(titleText2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(allSongsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(moveLiked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(likedSongsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(movePop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(moveRock, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(popSongsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(rockSongsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(titleText1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleText2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLabel)
                            .addComponent(titleText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorLabel)
                            .addComponent(authorText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreLabel)
                            .addComponent(radioPop)
                            .addComponent(radioRock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addSong))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(allSongsLabel)
                            .addComponent(likedSongsLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moveLiked)
                            .addComponent(movePop))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(moveRock)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(popSongsLabel)
                            .addComponent(rockSongsLabel))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playlistSize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playlistRepeat)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void titleTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_titleTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_titleTextActionPerformed

    private void moveLikedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveLikedActionPerformed
        // TODO add your handling code here:
        //This takes a pressed song from general playlist and adds it to the liked playlist, all using the inde from event listener above
        //Loop checks if playlist has any items, if not then displays a message about no items left
        if(generalPlaylist.size() > 0) {
            //Program saves selected song, removes it from display and from the general playlist, then saved song is being added to liked playlist
            Song song = generalPlaylist.getSong(pressedSongIndex);
            generalPlaylist.deleteSong(pressedSongIndex);
            generalModel.remove(pressedSongIndex);
            //Testing what song is being saved
            System.out.println(song);
            likedPlaylist.addSong(song);
            stack.push(song);
            likedModel.addElement(song);
            //Then the song is being added to jlist model to it displays on the other playlist
            song.setLiked(true);
            generalDisplay.setModel(generalModel);
            //Then both models are being assigned again to the displays and that reloads them, displaying new updated data
            likedDisplay.setModel(likedModel);
        } else if (generalPlaylist.size() == 0) {
            JOptionPane.showMessageDialog(null, "No songs left in the playlist!");
        }
    }//GEN-LAST:event_moveLikedActionPerformed

    private void movePopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movePopActionPerformed
        // TODO add your handling code here:
        //This method works just liek the one above but here index of selected item is also checked
        //Pressed index is checked to make sure user is selecting only the last item added to the list
        //So that only last added item is moved around
        if(likedPlaylist.size() > 0) {
            if(pressedSongIndex == (likedPlaylist.size() - 1)) {
                Song song = likedPlaylist.getSong(pressedSongIndex);
                likedPlaylist.deleteSong(pressedSongIndex);
                likedModel.remove(pressedSongIndex);
                //Testing what song is being saved
                System.out.println(song);
                popPlaylist.addSong(song);
                popModel.addElement(song);
                song.setLiked(true);
                likedDisplay.setModel(likedModel);
                popDisplay.setModel(popModel);
            } else {
                //If user trues to move other song than the last added one, program will display an error message
                JOptionPane.showMessageDialog(null, "You can only move last added song in the playlist!");
            }
        } else if (likedPlaylist.size() == 0) {
            JOptionPane.showMessageDialog(null, "No songs left in the playlist!");
        }
    }//GEN-LAST:event_movePopActionPerformed

    private void moveRockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveRockActionPerformed
        // TODO add your handling code here:
        //This code works exactly the same like ones above, but just for a different display
        if(likedPlaylist.size() > 0) {
            if(pressedSongIndex == (likedPlaylist.size() - 1)) {
                Song song = likedPlaylist.getSong(pressedSongIndex);
                likedPlaylist.deleteSong(pressedSongIndex);
                likedModel.remove(pressedSongIndex);
                //Testing which song is being saved
                System.out.println(song);
                rockPlaylist.addSong(song);
                rockModel.addElement(song);
                song.setLiked(true);
                likedDisplay.setModel(likedModel);
                rockDisplay.setModel(rockModel);
            } else {
                JOptionPane.showMessageDialog(null, "You can only move last add song in the playlist!");
            }
        } else if (likedPlaylist.size() == 0) {
            JOptionPane.showMessageDialog(null, "No songs left in the playlist!");
        }
    }//GEN-LAST:event_moveRockActionPerformed

    private void deleteSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteSongActionPerformed
        // TODO add your handling code here:
        //This code deletes selected song from the playlist
            
        //Saving data for whether displays are being clicked or not
        //True value will tell the program which display was being used by the user
        boolean selectionLiked = likedDisplay.isSelectionEmpty();
        boolean selectionGeneral = generalDisplay.isSelectionEmpty();
        boolean selectionPop = popDisplay.isSelectionEmpty();
        boolean selectionRock = rockDisplay.isSelectionEmpty();

        //Then depending on which display is being used, program will delete pressed song after user will click the delete button
        //So in summary, user selects a song, pressed a delete button and program deletes a chosen song from the display where action was detected
        if (selectionLiked == false) {
            //Remove chosen song from both playlist and the display 
            likedPlaylist.deleteSong(pressedSongIndex);
            likedModel.remove(pressedSongIndex);
            //Then reload the model showing updated display
            likedDisplay.setModel(likedModel);
        } else if (selectionGeneral == false) {
            generalPlaylist.deleteSong(pressedSongIndex);
            generalModel.remove(pressedSongIndex);
            generalDisplay.setModel(generalModel);
        } else if (selectionPop == false) {
            popPlaylist.deleteSong(pressedSongIndex);
            popModel.remove(pressedSongIndex);
            popDisplay.setModel(popModel);
        } else if (selectionRock == false) {
            rockPlaylist.deleteSong(pressedSongIndex);
            rockModel.remove(pressedSongIndex);
            rockDisplay.setModel(rockModel);
        }
    }//GEN-LAST:event_deleteSongActionPerformed

    private void searchSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSongActionPerformed
        // TODO add your handling code here:
        //Here user is being asked which playlist they wish to choose to search the song on and then depending on their answer search emthods are being used
        String answer = JOptionPane.showInputDialog(null, "Which playlist do you want to search in? \n1. General\n2. Liked\n3. Pop\n4. Rock");
        switch(answer) {
            case "1":
                answer = JOptionPane.showInputDialog(null, "What is the title of a song you are looking for?");
                generalPlaylist.searchSong(answer);
                break;
            case "2":
                answer = JOptionPane.showInputDialog(null, "What is the title of a song you are looking for?");
                likedPlaylist.searchSong(answer);
                break;
            case "3":
                answer = JOptionPane.showInputDialog(null, "What is the title of a song you are looking for?");
                popPlaylist.searchSong(answer);
                break;
            case "4":
                answer = JOptionPane.showInputDialog(null, "What is the title of a song you are looking for?");
                rockPlaylist.searchSong(answer);
                break;
        }
    }//GEN-LAST:event_searchSongActionPerformed

    private void playlistSizeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistSizeActionPerformed
        // TODO add your handling code here:
        //This is similar to a method above - user is being asked which playlist they want to select
        //And then depending on their choice information about size of the chosen playlist is being displayed
        String answer = JOptionPane.showInputDialog(null, "Which playlist do you want to choose?\n1. General\n2. Liked\n3. Pop\n4. Rock");
        switch(answer) {
            case "1":
                JOptionPane.showMessageDialog(null, "Size of General Playlist is: " + generalPlaylist.size());
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Size of Liked Playlist is: " + likedPlaylist.size());
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Size of Pop Playlist is: " + popPlaylist.size());
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Size of Rock Playlist is: " + rockPlaylist.size());
                break;
        }
    }//GEN-LAST:event_playlistSizeActionPerformed

    private void playlistRepeatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_playlistRepeatActionPerformed
        // TODO add your handling code here:
        //This part asks user if they want to set a playlist on repeat
        String answer = JOptionPane.showInputDialog(null, "Which playlist do you want to set on repeat?\n1. General\n2. Liked\n3. Pop\n4. Rock");
        switch(answer) {
            case "1":
                JOptionPane.showMessageDialog(null, "General Playlist is now set on repeat!");
                break;
            case "2":
                JOptionPane.showMessageDialog(null, "Liked Playlist is now set on repeat!");
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Pop Playlist is now set on repeat!");
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Rock Playlist is now set on repeat!");
                break;
        }
    }//GEN-LAST:event_playlistRepeatActionPerformed

    private void addSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addSongActionPerformed
        // TODO add your handling code here:
        //Below code adds a new song to the general playlist
        String title = titleText.getText();
        String author = authorText.getText();
        String genre = null;
        //Saving data regarding the genre via radio buttons
        if(radioPop.isSelected()) {
            genre = "Pop";
        } else if (radioRock.isSelected()){
            genre = "Rock";
        }
        Song song = new Song(title, author, genre, false);
        generalPlaylist.addSong(song);
        System.out.println(generalPlaylist.getSongs());
        generalModel.addElement(song);
    }//GEN-LAST:event_addSongActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MusicGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MusicGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addSong;
    private javax.swing.JLabel allSongsLabel;
    private javax.swing.JLabel authorLabel;
    private javax.swing.JTextField authorText;
    private javax.swing.JButton deleteSong;
    private javax.swing.JList<String> generalDisplay;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JList<String> jList3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JList<String> likedDisplay;
    private javax.swing.JLabel likedSongsLabel;
    private javax.swing.JButton moveLiked;
    private javax.swing.JButton movePop;
    private javax.swing.JButton moveRock;
    private javax.swing.JButton playlistRepeat;
    private javax.swing.JButton playlistSize;
    private javax.swing.JList<String> popDisplay;
    private javax.swing.JLabel popSongsLabel;
    private javax.swing.JRadioButton radioPop;
    private javax.swing.JRadioButton radioRock;
    private javax.swing.JList<String> rockDisplay;
    private javax.swing.JLabel rockSongsLabel;
    private javax.swing.JButton searchSong;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JTextField titleText;
    private javax.swing.JLabel titleText1;
    private javax.swing.JLabel titleText2;
    // End of variables declaration//GEN-END:variables
}
