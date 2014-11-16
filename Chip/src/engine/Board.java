package engine;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * Kelas ini merupakan kelas yang menyimpan semua informasi yang terdapat
 * di Board.
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
     * Merupakan konstruktor dari kelas Board.
     */
    public Board() {
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai level.
     * @return level.
     */
    public int getLevel() {
        return level;
    }

    /**
     * Method ini berfungsi untuk mengatur level.
     * @param level nilai level.
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Method ini berfungsi untuk mendapatkan player.
     * @return player.
     */
    public Chip getPlayer() {
        return player;
    }

    /**
     * Method ini berfungsi untuk mengatur player.
     * @param player pemain.
     */
    public void setPlayer(Chip player) {
        this.player = player;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai ICLeft.
     * @return jumlah IC.
     */
    public int getICLeft() {
        return left;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai ICLeft.
     * @param icLeft jumlah IC.
     */
    public void setICLeft(int icLeft) {
        this.left = icLeft;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai redShoes.
     * @return jumlah redShoes.
     */
    public int getRedShoes() {
        return redShoesCount;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai redShoes.
     * @param redShoesLeft nilai redShoes.
     */
    public void setRedShoes(int redShoesLeft) {
        this.redShoesCount = redShoesLeft;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai blueShoes.
     * @return jumlah blueShoes.
     */
    public int getBlueShoes() {
        return blueShoesCount;
    }

    /**
     * Method ini berfungsi untuk mengatur nilai blueShoes.
     * @param blueShoesLeft nilai blueShoes.
     */
    public void setBlueShoes(int blueShoesLeft) {
        this.blueShoesCount = blueShoesLeft;
    }

    /**
     * Method ini berfungsi untuk mendapatkan nilai tile.
     * @return tile.
     */
    public Tile[][] getTile() {
        return tile;
    }

    /**
     * Method ini berfungsi untuk mengatur isi tile berdasarkan baris dan
     * kolom.
     * @param tile array dua dimensi yang tipenya Tile.
     * @param x baris.
     * @param y kolom.
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
     * Method ini berfungsi untuk memeriksa apakah player kalah.
     * @return true bila player kalah, dan false bila tidak.
     */
    public boolean checkPlayerLose() {
        Tile t = tile[player.getX()][player.getY()];
        return t.canLose();
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player menang.
     * @return true bila player menang, dan false bila tidak.
     */
    public boolean checkPlayerWin() {
        Tile t = tile[player.getX()][player.getY()];
        return t.canWin();
    }

    /**
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak keatas.
     * @return true bila player dapat bergerak keatas, dan false bila tidak.
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
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak kebawah.
     * @return true bila player dapat bergerak kebawah, dan false bila tidak.
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
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak kekiri.
     * @return true bila player dapat bergerak kekiri, dan false bila tidak.
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
     * Method ini berfungsi untuk memeriksa apakah player dapat bergerak kekanan.
     * @return true bila player dapat bergerak kekanan, dan false bila tidak.
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
     * Method ini berfungsi untuk menghitung banyak IC.
     * @return jumlah IC.
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
     * Method ini berfungsi untuk menghitung banyak redShoes.
     * @return jumlah redShoes.
     */
    public int countRedShoes() {
        int redShoesCount = 0;
        return redShoesCount;
    }

    /**
     * Method ini berfungsi untuk menghitung banyak blueShoes.
     * @return jumlah blueShoes.
     */
    public int countBlueShoes() {
        int blueShoesCount = 0;
        return blueShoesCount;
    }
}
