package engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Kelas ini adalah kelas turunan dari kelas Character yang digunakan untuk mengambil file gambar karakter saat di lantai kosong.
 */
public class CharacterPlayer extends Character {

    /**
     * Method ini berfungsi untuk mendapatkan nama file gambar. 
     * @param theme tema yang dipilih.
     * @return nama gambar.
     */
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
