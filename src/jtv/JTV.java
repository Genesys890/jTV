/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jtv;

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
        
        boolean found = new NativeDiscovery().discover();
        System.out.println(found);
        System.out.println(LibVlc.INSTANCE.libvlc_get_version());
    }
    
}
