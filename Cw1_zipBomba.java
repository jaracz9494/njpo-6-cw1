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
public class Cw1_zipBomba {
    
    private static final int ILE = 10;
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        watek[] wat = new watek[ILE];
        
        for (int i=0; i<ILE; i++) {
            wat[i] = new watek("Numer " + i);
            wat[i].run();
        }
    }
    
}
