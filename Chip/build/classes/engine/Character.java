package engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan sebuah kelas abstrak yang menyimpan informasi tentang Character.
 */

 public abstract class Character {
     
     /**
      * Method abstrak ini dibuat untuk dioverride kelas turunannya.
      * @param theme tema/gambar.
      * 
      */
    abstract public String getFileName(int theme);
    
}
