/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan kelas yang menyimpan informasi-informasi tentang elemen-elemen Tile berupa Chip, 
 * lantai kosong, IC, barrier, finish, dan fire.
 */
public class Tile {

    
    private int obstacleType;
    // 0:lantai
    // 1:api
    // 2.dinding
    // 3.IC
    // 4.gerbang
    // 5.finish
    // 6.air
    // 7.sepatu anti api
    // 8.sepatu anti air
    // 9.joker yaitu target akhir dari batman
    
    
    public static final int LANTAI = 0;
    public static final int API = 1;
    public static final int DINDING = 2;
    public static final int IC = 3;
    public static final int GERBANG = 4;
    public static final int FINISH = 5;
    public static final int WATER = 6;
    public static final int REDSHOES =7;
    public static final int BLUSHOES = 8;
    public static final int JOKER = 9;
    

    /**
     * Merupakan konstruktor dari Tile
     * @param obstacleType 
     */
    public Tile(int obstacleType) {
        this.obstacleType = obstacleType;
    }
    
    /**
     * Method ini berfungsi untuk mengatur tipe rintangan (0:lantai)
     */
    public void setFloor(){
        obstacleType = LANTAI;
    }
    
    /**
     * Method ini berfungsi untuk mendapatkan nilai dari tipe rintangan
     * @return 
     */
    public int getObstacleType() {
        return obstacleType;
    }

    /**
     * Method ini berfungsi untuk mengatur tipe rintangan
     * @param obstacleType 
     */
    public void setObstacleType(int obstacleType) {
        this.obstacleType = obstacleType;
    }
    
    /**
     * Method ini berfungsi untuk memeriksa tipe rintangan dapat diambil atau tidak
     * @return 
     */
    public boolean canCollect()
    {
        if(getObstacleType() == 3)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Method ini berfungsi untuk memeriksa tipe rintangan dapat dilewati atau tidak
     * @return 
     */
    public boolean canThrough()
    {
        if(getObstacleType() == 2 || getObstacleType() == 4)
        {
            return false;
        }
        return true;
    }
    
    /**
     * Method ini berfungsi untuk memeriksa apakah tipe rintangan tersebut menyebabkan kalah atau tidak
     * @return 
     */
    public boolean canLose()
    {
        if(getObstacleType() == 1 || getObstacleType() == 6)
        {
            return true;
        }
        return false;
    }
    
    /**
     *  Method ini berfungsi untuk memeriksa apakah tipe rintangan tersebut menyebabkan menang atau tidak
     * @return 
     */
    public boolean canWin()
    {
        if(getObstacleType() == 5 || getObstacleType() == 9)
        {
            return true;
        }
        return false;
    }
    
    /**
     *  Method ini berfungsi untuk memeriksa apakah tipe rintangan tersebut dapat digunakan atau tidak
     * @return 
     */
    public boolean canUse()
    {
        if(getObstacleType() == 7 || getObstacleType() == 8)
        {
            return true;
        }
        return false;
    }
}
