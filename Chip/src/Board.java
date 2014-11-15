/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Kelas ini merupakan kelas yang menyimpan semua informasi yang terdapat
 * diboard. Memiliki atribut/variable: 
 * level berfungsi untuk menyimpan informasi level.
 * left berfungsi untuk menyimpan IC yang terisa. 
 * redShoesCount berfungsi untuk menghitung nilai redShoes. 
 * blueShoesCount berfungsi untuk menghitung nilai blueShoes. 
 * tile yang bertipe Tile[][] berfungsi untuk mengatur tipe tile yang ada pada board. 
 * player yang bertipe Chip berfungsi untuk menyimpan informasi player. 
 * maxX berfungsi untuk batas maximun board dikoordinat X. 
 * maxY berfungsi untuk batas maximum board dikoordinat Y.
 */
public class Board {

    private int level;
    private int left;
    private int redShoesCount;
    private int blueShoesCount;
    private Tile[][] tile;
    private Chip player;
    private int maxX;
    private int maxY;

    /**
     * Merupakan kontruktor dari kelas board
     */
    public Board() {
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai level
     * @return
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai level
     * @param level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Method ini berfungsi untuk mengdapatkan nilai player
     */
    public Chip getPlayer() {
        return player;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai player
     * @param player
     */
    public void setPlayer(Chip player) {
        this.player = player;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai ICLeft
     * @return 
     */
    public int getICLeft() {
        return left;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai ICLeft
     * @param icLeft
     */
    public void setICLeft(int icLeft) {
        this.left = icLeft;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai redShoes
     * @return 
     */
    public int getRedShoes() {
        return redShoesCount;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai redShoes
     * @param redShoesLeft
     */
    public void setRedShoes(int redShoesLeft) {
        this.redShoesCount = redShoesLeft;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai blueShoes
     * @return 
     */
    public int getBlueShoes() {
        return blueShoesCount;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai blueShoes
     * @param blueShoesLeft
     */
    public void setBlueShoes(int blueShoesLeft) {
        this.blueShoesCount = blueShoesLeft;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai tile dari kelas Tile
     * @return 
     */
    public Tile[][] getTile() {
        return tile;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai tile berdasarkan kordinat X dan
     * kordinat Y
     * @param tile
     * @param x
     * @param y
     */
    public void setTile(Tile[][] tile, int x, int y) {
        maxX = x;
        maxY = y;
        this.tile = tile;
        this.left = countIC();
        this.redShoesCount = countRedShoes();
        this.blueShoesCount = countBlueShoes();
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player kalah
     * @return 
     */
    public boolean checkPlayerLose() {
        Tile t = tile[player.getX()][player.getY()];
        return t.canLose();
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player menang
     * @return 
     */
    public boolean checkPlayerWin() {
        Tile t = tile[player.getX()][player.getY()];
        return t.canWin();
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak keatas
     * @return 
     */
    public boolean checkPlayerMoveUp() {
        if (player.getY() - 1 < 0) {
            return false;
        } else {
            Tile t = tile[player.getX()][player.getY() - 1];
            if (t.canThrough()) {
                return true;
            }
            return false;
        }
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak kebawah
     * @return 
     */
    public boolean checkPlayerMoveDown() {
        if (player.getY() + 1 >= maxY) {
            return false;
        } else {
            Tile t = tile[player.getX()][player.getY() + 1];
            if (t.canThrough()) {
                return true;
            }
            return false;
        }
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak kekiri
     * @return 
     */
    public boolean checkPlayerMoveLeft() {
        if (player.getX() - 1 < 0) {
            return false;
        } else {
            Tile t = tile[player.getX() - 1][player.getY()];
            if (t.canThrough()) {
                return true;
            }
            return false;
        }
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak kekanan
     * @return 
     */
    public boolean checkPlayerMoveRight() {
        if (player.getX() + 1 >= maxX) {
            return false;
        } else {
            Tile t = tile[player.getX() + 1][player.getY()];
            if (t.canThrough()) {
                return true;
            }
            return false;
        }
    }

    /**
     * Method ini berfungsi untuk menghitung nilai IC
     * @return 
     */
    public int countIC() {
        int left = 0;
        for (int i = 0; i < maxX; i++) {
            for (int j = 0; j < maxY; j++) {
                Tile t = tile[i][j];
                if (t.canCollect()) {
                    left = left + 1;
                }
                left = left + 0;
            }

        }
        return left;
    }

    /**
     * Method ini berfungsi untuk menghitung nilai redShoes
     * @return 
     */
    public int countRedShoes() {
        int redShoesCount = 0;
        return redShoesCount;
    }

    /**
     * Method ini berfungsi untuk menghitung nilai blueShoes
     * @return 
     */
    public int countBlueShoes() {
        int blueShoesCount = 0;
        return blueShoesCount;
    }
}
