/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chip;
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

    public Tile(int obstacleType) {
        this.obstacleType = obstacleType;
    }
    
    
    
    
    public void setFloor(){
        obstacleType = 0;
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
        if(getObstacleType() == 1)
        {
            return true;
        }
        return false;
    }
    
    public boolean canWin()
    {
        if(getObstacleType() == 5)
        {
            return true;
        }
        return false;
    }
    
            
}
