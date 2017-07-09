/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtv.frame.main;

import java.awt.Canvas;
import java.awt.Color;
import uk.co.caprica.vlcj.component.EmbeddedMediaListPlayerComponent;
import uk.co.caprica.vlcj.component.EmbeddedMediaPlayerComponent;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;

/**
 *
 * @author rolmedo
 */
public class MediaPanel {

    public EmbeddedMediaPlayerComponent mediaPlayer;
    
    public MediaPanel(){
  

    mediaPlayer = new EmbeddedMediaListPlayerComponent();
    mediaPlayer.setSize(500, 500);
    
  
    }
    public void runit(String file){
    
        mediaPlayer.getMediaPlayer().playMedia(file);
        System.out.println("the video is running");
    }

    
    public EmbeddedMediaPlayerComponent getMediaPlayer(){
        return mediaPlayer;
    }
}
