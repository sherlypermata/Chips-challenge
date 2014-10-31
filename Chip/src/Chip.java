/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan kelas yang menyimpan informasi tentang  pemeran utamanya
 * yang bernama Chip yang dapat bergerak ke kiri, kanan, atas, maupun bawah.
 */
public class Chip {

    private int position;
    private int x,y;
    
    /**
     * 
     * @param x merupakan koordinat x
     * @param y merupakan koordinat y
     */
    
    public Chip(int x, int y)
    {
       this.x = x;
       this.y = y;
    }
    
    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
    
    public void moveUp()
    {
        
    }
    
}
