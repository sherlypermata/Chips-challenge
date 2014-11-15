/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zulfan
 */
public class SpritePlayer extends Sprite {

    @Override
    public String getFileName(int theme) {
        switch (theme) {
            case 0:
                return System.getProperty("user.dir") + "\\Image\\Batman.jpg";
            case 1:
                return System.getProperty("user.dir") + "\\Image\\Nightwing.jpg";
            case 2:
                return System.getProperty("user.dir") + "\\Image\\RedRobin.jpg";
            case 3:
                return System.getProperty("user.dir") + "\\Image\\Batgirl.jpg";      
            default:
                return "";
        }
    }
    
}
