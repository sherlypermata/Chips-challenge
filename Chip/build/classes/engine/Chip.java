package engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * Kelas ini adalah kelas yang menyimpan semua informasi tentang player(Chip).
 * 
 */
public class Chip {

    private int x;
    private int y;
    
    /**
     * Merupakan konstruktor yang digunakan untuk menempatkan posisi Chip.
     * @param x baris.
     * @param y kolom.
     */
    public Chip(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai x.
     * @return baris.
     */
    public int getX() {
        return x;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai x.
     * @param x baris.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai .
     * @return kolom.
     */
    public int getY() {
        return y;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai y.
     * @param y kolom.
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Method ini berfungsi untuk memberi instruksi kepada pemain untuk berpindah keatas.
     */
    public void moveUp()
    {
        y--;
    }
    
    /**
     * Method ini berfungsi untuk memberi instruksi kepada pemain untuk berpindah kebawah.
     */
    public void moveDown()
    {
        y++;
    }
    
    /**
     * Method ini berfungsi untuk memberi instruksi kepada pemain untuk berpindah kekiri.
     */
    public void moveLeft()
    {
        x--;
    }
    
    /**
     * Method ini berfungsi untuk memberi instruksi kepada pemain untuk berpindah kekanan.
     */
    public void moveRight()
    {
        x++;
    }
    
}
