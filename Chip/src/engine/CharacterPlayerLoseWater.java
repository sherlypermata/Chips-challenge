/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini merupakan turunan dari kelas Character yang digunakan untuk mengambil file gambar karakter saat berada di air.
 */
public class CharacterPlayerLoseWater extends Character{
    
    /**
     * Method ini berfungsi untuk mendapatkan nama file player
     * @param theme tema yang dipilih.
     * @return nama gambar.
     */
    @Override
    public String getFileName(int theme) {
        switch (theme) {
            case 0:
                return System.getProperty("user.dir") + "\\Image\\LoseWater.jpg";
            case 1:
                return System.getProperty("user.dir") + "\\Image\\Nightwing Lose Water.jpg";
            case 2:
                return System.getProperty("user.dir") + "\\Image\\RedRobin Lose Water.jpg";
            case 3:
                return System.getProperty("user.dir") + "\\Image\\Batgirl Lose Water.jpg";      
            default:
                return "";
        }
    }
}
