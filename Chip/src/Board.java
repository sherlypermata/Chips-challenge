/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * Kelas ini merupakan kelas yang menyimpan semua informasi yang terdapat dipapan.  
 */
public class Board {
    
    private int level;
    private int left;
    private Tile[][] tile;
    private Chip player;
    private int maxX;
    private int maxY;
    
    /**
     * 
     * @param x merupakan koordinat x
     * @param y merupakan koordinat y
     */
    public Board()
    {
    }
            
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    public Chip getPlayer() {
        return player;
    }

    public void setPlayer(Chip player) {
        this.player = player;
    }
    
    public int getICLeft() {
        return left;
    }

    public void setICLeft(int icLeft) {
        this.left = icLeft;
    }

    public Tile[][] getTile() {
        return tile;
    }

    public void setTile(Tile[][] tile, int x, int y) {
        this.tile = tile;
        this.left = countIC();
        maxX = x;
        maxY = y;
    }
    
    public boolean checkPlayerLose()
    {
        Tile t = tile[player.getX()][player.getY()];
        return t.canLose();
    }
    
    public boolean checkPlayerWin()
    {
        Tile t = tile[player.getX()][player.getY()];
        return t.canWin();
    }
    
    public boolean checkPlayerMoveUp()
    {
        if(player.getY()-1 < 0)
        {
            return false;
        }
        else 
        {
            Tile t = tile[player.getX()][player.getY() -1];
            if(t.canThrough())
            {
                return true;
            }
            return false;
        }
    }
    
    public boolean checkPlayerMoveDown()
    {
        if(player.getY()+1 >= maxY)
        {
            return false;
        }
        else 
        {
            Tile t = tile[player.getX()][player.getY() +1];
            if(t.canThrough())
            {
                return true;
            }
            return false;
        }
    }
    
    public boolean checkPlayerMoveLeft()
    {
        if(player.getX()-1 < 0)
        {
            return false;
        }
        else 
        {
            Tile t = tile[player.getX()-1][player.getY()];
            if(t.canThrough())
            {
                return true;
            }
            return false;
        }
    }
    
    public boolean checkPlayerMoveRight()
    {
        if(player.getX()+1 >= maxX)
        {
            return false;
        }
        else 
        {
            Tile t = tile[player.getX()+1][player.getY()];
            if(t.canThrough())
            {
                return true;
            }
            return false;
        }
    }
    
    public int countIC()
    {
        int left=0;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                Tile t = tile[i][j];
                if(t.canCollect())
                {
                    left = left + 1;
                }
                left = left + 0;
            }
            
        }
        return left;
    }
}
