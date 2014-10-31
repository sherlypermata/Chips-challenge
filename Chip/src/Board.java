/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan kelas yang menyimpan semua informasi yang terdapat dipapan.  
 */
public class Board {
    
    private int level;
    private int chipLeft;
    private Tile[][] tile;
    private String rintangan[][];
    private int pemain;
    private int[][] sizeBoard;
    
    /**
     * 
     * @param x merupakan koordinat x
     * @param y merupakan koordinat y
     */
    public Board(int x, int y)
    {
        this.sizeBoard = sizeBoard;
        
        tile[0][3].canLose();
    }
            
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    public int getPemain() {
        return pemain;
    }

    public void setPemain(int pemain) {
        this.pemain = pemain;
    }
    
    
     
}
