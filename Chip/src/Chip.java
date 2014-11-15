/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * Kelas ini merupakan kelas yang menyimpan semua informasi tentang player yang memilki atribut/variable:
 * x berfungsi untuk menyimpan nilai dikordinat x
 * y berfungsi untuk menyimpan nilai dikordinat y
 */
public class Chip {

    private int x;
    private int y;
    
    /**
     * Merupakan konstruktor dari kelas chip
     * @param x
     * @param y 
     */
    public Chip(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai X
     * @return 
     */
    public int getX() {
        return x;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai X
     * @param x 
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai Y
     * @return 
     */
    public int getY() {
        return y;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai Y
     * @param y 
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Method ini berfungsi untuk mengetahui informasi pemain saat bergerak keatas
     */
    public void moveUp()
    {
        y--;
    }
    
    /**
     * Method ini berfungsi untuk mengetahui informasi pemain saat bergerak kebawah
     */
    public void moveDown()
    {
        y++;
    }
    
    /**
     * Method ini berfungsi untuk mengetahui informasi pemain saat bergerak kekiri
     */
    public void moveLeft()
    {
        x--;
    }
    
    /**
     * Method ini berfungsi untuk mengetahui informasi pemain saat bergerak kekanan
     */
    public void moveRight()
    {
        x++;
    }
    
}
