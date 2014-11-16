package engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Kelas ini adalah sebuah kelas abstrak yang digunakan untuk membuat peta untuk setiap level.
 */
public abstract class Map {
    
    /**
     * Method ini adalah sebuah method abstrak yang dapat dioverride oleh kelas turunannya.
     * @param level level permainan.
     * @return 
     */
    abstract public int[][] getLevel(int level);
}
