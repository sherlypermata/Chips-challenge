/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan kelas yang menyimpan informasi-informasi tentang elemen-elemen di dalamnya berupa Chip, 
 * lantai kosong, IC, barrier, finish, dan fire.
 */
public class Tile {

    private String obstacleType;
    
    public String getObstacleType() {
        return obstacleType;
    }

    
    public void setObstacleType(String obstacleType) {
        this.obstacleType = obstacleType;
    }
    
    
    public void canLose()
    {
        if(getObstacleType().equalsIgnoreCase("fire"))
        {
            System.out.println("You Lose!");
        }
    }
    
    public void canWin()
    {
        if(getObstacleType().equalsIgnoreCase("portal"))
        {
            System.out.println("You Win!");
        }
    }
    
            
}
