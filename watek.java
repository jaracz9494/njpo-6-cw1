/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1_zip.bomba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author Dominik
 */
public class watek implements Runnable {
    
        String name;
        
        watek(String name) {
            this.name=name;
        }
        public void run() {
            System.out.println("Watek: " + name + " rozpoczyna dzialanie");
            Random rand = new Random();
            
            
            try {
                
                File file = new File("plik" + name + ".txt");
                FileOutputStream fos = new FileOutputStream(file);
                
                
                for (int i=0; i<1000; i++) {
                    rand.nextInt(10);
                    fos.write(i);
                    fos.flush();
                }
                
            
            } catch (IOException ex) {
                System.out.println ("Brak pliku");
            }
            
        }
    }
