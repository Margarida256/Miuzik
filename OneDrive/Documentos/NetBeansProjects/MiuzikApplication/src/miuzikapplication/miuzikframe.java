/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miuzikapplication;

import jaco.mp3.player.MP3Player;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
/**
 *
 * @author ameri
 */
public class miuzikframe extends javax.swing.JFrame {

    
    /**
     * Creates new form miuzikframe
     */
    MP3Player player; 
    
    File songFile;
    
    String appTitle = "Miuzik Application";
    boolean isPlaying = false;
    boolean repeat = false;
    String currentDirectory = "C:\\Users\\ameri\\Downloads";
    
    public miuzikframe() {
        initComponents();
  
        player = MP3Player ();
        appName.setText(appTitle);
        
        songFile = new File ("C:\\Users\\ameri\\Downloads\\testSong.mp3"); //testSong
        String fileName = songFile.getName();
        songName.setText("Display Song Name");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        startButton = new javax.swing.JLabel();
        previousSong = new javax.swing.JLabel();
        nextSong = new javax.swing.JLabel();
        songName = new javax.swing.JLabel();
        appName = new javax.swing.JLabel();
        repeatButton = new javax.swing.JLabel();
        shuffleButton = new javax.swing.JLabel();
        songProgress = new javax.swing.JProgressBar();
        loadSong = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        startButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playSong.png"))); // NOI18N
        startButton.setText("jLabel1");
        startButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startButtonMouseClicked(evt);
            }
        });

        previousSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/previousSong.png"))); // NOI18N
        previousSong.setText("jLabel1");
        previousSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                previousSongMouseClicked(evt);
            }
        });

        nextSong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/nextSong.png"))); // NOI18N
        nextSong.setText("jLabel1");
        nextSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nextSongMouseClicked(evt);
            }
        });

        songName.setText("songName");

        appName.setText("Miuzik Application");

        repeatButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/togglerepeat-3.png"))); // NOI18N
        repeatButton.setText("jLabel1");
        repeatButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                repeatButtonMouseClicked(evt);
            }
        });

        shuffleButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/toggleshuffle-2.png"))); // NOI18N
        shuffleButton.setText("jLabel1");

        loadSong.setText("Search");
        loadSong.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loadSongMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(songName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(previousSong, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(startButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(loadSong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(repeatButton, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(shuffleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(songProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(appName)
                .addGap(43, 43, 43)
                .addComponent(songName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(repeatButton)
                    .addComponent(shuffleButton)
                    .addComponent(loadSong))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songProgress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startButton)
                    .addComponent(previousSong)
                    .addComponent(nextSong, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void startButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startButtonMouseClicked
        
        if(!isPlaying){
            player.play();
            isPlaying = true;
            String image = "C:\\Users\\ameri\\OneDrive\\Documentos\\NetBeansProjects\\mp3Player\\src\\pauseSong.png";
            startButton.setIcon(new ImageIcon(image));
        } else {
            player.pause();
            String image = "C:\\Users\\ameri\\OneDrive\\Documentos\\NetBeansProjects\\mp3Player\\src\\playSong.png";
            startButton.setIcon(new ImageIcon(image));
            isPlaying = false;
        }
    }//GEN-LAST:event_startButtonMouseClicked

    private void previousSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousSongMouseClicked
        player.skipBackward();
    }//GEN-LAST:event_previousSongMouseClicked

    private void repeatButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_repeatButtonMouseClicked
        if(repeat == false){
            repeat = true;
            player.setRepeat(repeat);
            String image = "C:\\Users\\ameri\\OneDrive\\Documentos\\NetBeansProjects\\mp3Player\\src\\togglerepeat-5.png";
            repeatButton.setIcon(new ImageIcon(image));
            
        } else if(repeat == true){
            repeat = false;
            player.setRepeat(repeat);
            String image = "C:\\Users\\ameri\\OneDrive\\Documentos\\NetBeansProjects\\mp3Player\\src\\togglerepeat-3.png";
            repeatButton.setIcon(new ImageIcon(image));
        }
    }//GEN-LAST:event_repeatButtonMouseClicked

    private void loadSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loadSongMouseClicked
     JFileChooser openFileChooser = new JFileChooser (currentDirectory);
     openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3 Files Only!"));
     
     int result = openFileChooser.showOpenDialog(null);
     
     if(result == JFileChooser.APPROVE_OPTION){
         songFile = openFileChooser.getSelectedFile();
         player.addToPlayList(songFile);
         player.skipForward();
         currentDirectory = songFile.getAbsolutePath();
         songName.setText("Playing now: " + songFile.getName());
    }//GEN-LAST:event_loadSongMouseClicked
    }
    private void nextSongMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextSongMouseClicked
      player.skipForward();
    }//GEN-LAST:event_nextSongMouseClicked

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
            java.util.logging.Logger.getLogger(miuzikframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(miuzikframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(miuzikframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(miuzikframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new miuzikframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loadSong;
    private javax.swing.JLabel nextSong;
    private javax.swing.JLabel previousSong;
    private javax.swing.JLabel repeatButton;
    private javax.swing.JLabel shuffleButton;
    private javax.swing.JLabel songName;
    private javax.swing.JProgressBar songProgress;
    private javax.swing.JLabel startButton;
    // End of variables declaration//GEN-END:variables

    private MP3Player MP3Player() {
        MP3Player mp3Player = new MP3Player ();
        return mp3Player;
    }
}
