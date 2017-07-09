/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtv;

import jtv.frame.main.MainFrame;
import jtv.frame.main.MediaPanel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import uk.co.caprica.vlcj.binding.LibVlc;
import uk.co.caprica.vlcj.discovery.NativeDiscovery;

/**
 *
 * @author Genesys890
 */
public class JTV {

    /**
     * @param args the command line arguments
     */
    private static final Logger _log = LoggerFactory.getLogger(JTV.class);
    
    
    public static void main(String[] args) {
      
        MainFrame main = new MainFrame();

        //main.videopanel.add(new MediaPanel().getCanvas());
        main.setVisible(true);
        main.mediaPanel1.runit(JTV.class.getResource("resources/SampleVideo_720x480_30mb.mp4").getPath());
      
    }
    
}
