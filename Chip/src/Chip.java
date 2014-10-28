/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ifan
 */
public class Chip {

    private int position;
    private int x,y;
    
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
