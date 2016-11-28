/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cw1_zip.bomba;

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
        }
    }
