/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan turunan dari kelas sprite yang menyimpan informasi SpritePlayerLoseFire
 */
public class SpritePlayerLoseFire extends Sprite{
    
    /**
     * Method ini berfungsi untuk mendapatkan nama file player
     * @param theme
     * @return 
     */
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
