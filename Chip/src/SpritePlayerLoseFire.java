/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zulfan
 */
public class SpritePlayerLoseFire extends Sprite{
    @Override
    public String getFileName(int theme) {
        switch (theme) {
            case 0:
                return System.getProperty("user.dir") + "\\Image\\Lose.jpg";
            case 1:
                return System.getProperty("user.dir") + "\\Image\\Nightwing Lose.jpg";
            case 2:
                return System.getProperty("user.dir") + "\\Image\\RedRobin Lose.jpg";
            case 3:
                return System.getProperty("user.dir") + "\\Image\\Batgirl Lose.jpg";      
            default:
                return "";
        }
    }
    
}
