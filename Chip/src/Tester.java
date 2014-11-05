/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chip;

/**
 * 
 * Kelas ini merupakan kelas untuk mencoba memainkan permainan chips challenge dalam bentuk teks.
 */
public class Tester {
    public static void main(String[] args)
    {
        Board b = new Board(9, 9);
        
        int[][] map = {
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0},
        };
        Tile[][] tile = new Tile[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                tile[j][i] = new Tile(map[i][j]);
        
        b.setTile(tile);
        
        Chip c = new Chip(4, 4);
        b.setPlayer(c);
        
        if (b.checkPlayerMoveRight()) {
            c.moveRight();
        }
        System.out.print(c.getX() + " " + c.getY());
    }
}
