/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtv.frame.main;

import java.awt.Canvas;
import uk.co.caprica.vlcj.player.MediaPlayerFactory;
import uk.co.caprica.vlcj.player.embedded.EmbeddedMediaPlayer;
import uk.co.caprica.vlcj.player.embedded.videosurface.CanvasVideoSurface;

/**
 *
 * @author rolmedo
 */
public class MediaPanel {

    Canvas canvas;
    MediaPlayerFactory mediaPlayerFactory;
    CanvasVideoSurface videoSurface;
    EmbeddedMediaPlayer mediaPlayer;
    
    public MediaPanel(){
    canvas = new Canvas();
    mediaPlayerFactory = new MediaPlayerFactory();
    mediaPlayer = mediaPlayerFactory.newEmbeddedMediaPlayer();
    mediaPlayer.setVideoSurface(videoSurface);
    videoSurface = mediaPlayerFactory.newVideoSurface(canvas);
  
    }
    public void runit(String file){
    
        mediaPlayer.playMedia(file);
    }
    
    public Canvas getCanvas(){
        return canvas;
    }
    
}
