/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chip;

/**
 *
 * Kelas ini merupakan kelas yang menyimpan informasi tentang  pemeran utamanya
 * yang bernama Chip yang dapat bergerak ke kiri, kanan, atas, maupun bawah.
 */
public class Chip {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Chip(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    
   
    
    public void moveUp()
    {
        y--;
    }
    
    public void moveDown()
    {
        y++;
    }
    
    public void moveLeft()
    {
        x--;
    }
    
    public void moveRight()
    {
        x++;
    }
    
}
