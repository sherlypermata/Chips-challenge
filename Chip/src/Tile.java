/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan kelas yang menyimpan informasi-informasi tentang elemen-elemen di dalamnya berupa Chip, 
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
    

    public Tile(int obstacleType) {
        this.obstacleType = obstacleType;
    }
    
    
    
    
    public void setFloor(){
        obstacleType = LANTAI;
    }
    
    public int getObstacleType() {
        return obstacleType;
    }

    
    public void setObstacleType(int obstacleType) {
        this.obstacleType = obstacleType;
    }
    
    public boolean canCollect()
    {
        if(getObstacleType() == 3)
        {
            return true;
        }
        return false;
    }
    
    public boolean canThrough()
    {
        if(getObstacleType() == 2 || getObstacleType() == 4)
        {
            return false;
        }
        return true;
    }
    
    public boolean canLose()
    {
        if(getObstacleType() == 1 || getObstacleType() == 6)
        {
            return true;
        }
        return false;
    }
    
    public boolean canWin()
    {
        if(getObstacleType() == 5 || getObstacleType() == 9)
        {
            return true;
        }
        return false;
    }
    
    public boolean canUse()
    {
        if(getObstacleType() == 7 || getObstacleType() == 8)
        {
            return true;
        }
        return false;
    }
}
