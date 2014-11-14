
import java.awt.event.KeyEvent;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.*;
import sun.audio.*;
// http://alvinalexander.com/java/java-audio-example-java-au-play-sound 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Zulfan
 */
public class ChipChallengeUI extends javax.swing.JFrame {

    private JLabel[][] jLabel;
    Board b;
    private int level = 1;
    private int theme;
    private SpritePlayer spritePlayer;

    /**
     * Creates new form ChipChallengeUI
     */
    public ChipChallengeUI() {
        initComponents();

        setJLabel();

        theme = 0;
        spritePlayer = new SpritePlayer();

        b = new Board();
        initiateLevel(1);
        drawBoard();

    }

    public void playSound(String filename) {
        try {
            InputStream in = new FileInputStream(System.getProperty("user.dir") + "\\Sound\\" + filename);
            // create an audiostream from the inputstream
            AudioStream audioStream = new AudioStream(in);
            // play the audio clip with the audioplayer class
            AudioPlayer.player.start(audioStream);
        } catch (Exception e) {
        }
    }

    //level batman's challenge
    public void initiateLevel(int level) {
        //LEVEL 1
        if (level == 1) {
            int[][] map = {
                {0, 0, 0, 2, 5, 2, 0, 0, 0},
                {2, 2, 2, 2, 4, 2, 2, 2, 2},
                {0, 2, 0, 7, 0, 0, 0, 2, 0},
                {0, 2, 1, 6, 0, 0, 1, 2, 0},
                {2, 2, 3, 0, 0, 0, 3, 2, 0},
                {0, 2, 1, 0, 0, 0, 1, 2, 0},
                {0, 2, 0, 0, 3, 0, 0, 2, 0},
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {0, 2, 0, 0, 2, 0, 0, 2, 0}};

            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(map);
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

            //LEVEL 2
        } else if (level == 2) {
            int[][] map = {
                {0, 2, 2, 2, 2, 2, 2, 2, 0},
                {0, 2, 3, 0, 1, 0, 1, 2, 2},
                {0, 2, 1, 0, 0, 1, 3, 2, 0},
                {0, 2, 1, 1, 0, 0, 0, 2, 0},
                {0, 2, 1, 1, 0, 0, 1, 2, 0},
                {2, 2, 0, 8, 0, 3, 1, 2, 2},
                {0, 2, 0, 6, 4, 0, 0, 2, 0},
                {2, 2, 2, 2, 5, 2, 2, 2, 2},
                {0, 0, 0, 2, 2, 2, 0, 0, 0}};

            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(map);
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

            //LEVEL 3
        } else if (level == 3) {
            int[][] map = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 5, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2},};

            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(map);
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

        } else if (level == 4) {
            int[][] map = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 5, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2},};

            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(map);
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

        } else if (level == 5) {
            int[][] map = {
                {2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 9, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2},};

            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(map);
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

        }
        labelICLeft.setText(b.countIC() + "");
    }

    public Tile[][] convertMapToTile(int[][] map) {
        Tile[][] tile = new Tile[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tile[j][i] = new Tile(map[i][j]);
            }
        }
        return tile;
    }

    public void drawBoard() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (b.getTile()[j][i].getObstacleType() == Tile.LANTAI) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Floor.png"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.API) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Fire.gif"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.DINDING) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Wall.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.IC) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\IC.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.GERBANG) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Barrier.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.FINISH) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Portal.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.WATER) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Water.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.REDSHOES) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\RedShoes.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.BLUSHOES) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\BlueShoes.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.JOKER) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Joker.jpg"));
                }
            }
        }

        setPlayerImage();
    }

    public void setPlayerImage() {
        int x = b.getPlayer().getX();
        int y = b.getPlayer().getY();
        jLabel[y][x].setIcon(new javax.swing.ImageIcon(spritePlayer.getFileName(theme)));
        if (b.getTile()[x][y].getObstacleType() == Tile.FINISH) {
            jLabel[y][x].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\PortalWIn.jpg"));

        }
        if (b.getTile()[x][y].getObstacleType() == Tile.API) {
            jLabel[y][x].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Lose.jpg"));
            if (b.getRedShoes() == 0) {
                JOptionPane.showMessageDialog(this, "Anda kalah.");
//                System.out.println("YOU LOSE!");
                initiateLevel(level);
                drawBoard();
            }
        }

        if (b.getTile()[x][y].getObstacleType() == Tile.WATER) {
            jLabel[y][x].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\LoseWater.jpg"));
            if (b.getBlueShoes() == 0) {
                System.out.println("YOU LOSE!");
                initiateLevel(level);
            }
        }

    }

    public void setJLabel() {
        jLabel = new JLabel[9][9];
        jLabel[0][0] = jLabel1;
        jLabel[0][1] = jLabel2;
        jLabel[0][2] = jLabel3;
        jLabel[0][3] = jLabel4;
        jLabel[0][4] = jLabel5;
        jLabel[0][5] = jLabel6;
        jLabel[0][6] = jLabel7;
        jLabel[0][7] = jLabel8;
        jLabel[0][8] = jLabel9;
        jLabel[1][0] = jLabel10;
        jLabel[1][1] = jLabel11;
        jLabel[1][2] = jLabel12;
        jLabel[1][3] = jLabel13;
        jLabel[1][4] = jLabel14;
        jLabel[1][5] = jLabel15;
        jLabel[1][6] = jLabel16;
        jLabel[1][7] = jLabel17;
        jLabel[1][8] = jLabel18;
        jLabel[2][0] = jLabel19;
        jLabel[2][1] = jLabel20;
        jLabel[2][2] = jLabel21;
        jLabel[2][3] = jLabel22;
        jLabel[2][4] = jLabel23;
        jLabel[2][5] = jLabel24;
        jLabel[2][6] = jLabel25;
        jLabel[2][7] = jLabel26;
        jLabel[2][8] = jLabel27;
        jLabel[3][0] = jLabel28;
        jLabel[3][1] = jLabel29;
        jLabel[3][2] = jLabel30;
        jLabel[3][3] = jLabel31;
        jLabel[3][4] = jLabel32;
        jLabel[3][5] = jLabel33;
        jLabel[3][6] = jLabel34;
        jLabel[3][7] = jLabel35;
        jLabel[3][8] = jLabel36;
        jLabel[4][0] = jLabel37;
        jLabel[4][1] = jLabel38;
        jLabel[4][2] = jLabel39;
        jLabel[4][3] = jLabel40;
        jLabel[4][4] = jLabel41;
        jLabel[4][5] = jLabel42;
        jLabel[4][6] = jLabel43;
        jLabel[4][7] = jLabel44;
        jLabel[4][8] = jLabel45;
        jLabel[5][0] = jLabel46;
        jLabel[5][1] = jLabel47;
        jLabel[5][2] = jLabel48;
        jLabel[5][3] = jLabel49;
        jLabel[5][4] = jLabel50;
        jLabel[5][5] = jLabel51;
        jLabel[5][6] = jLabel52;
        jLabel[5][7] = jLabel53;
        jLabel[5][8] = jLabel54;
        jLabel[6][0] = jLabel55;
        jLabel[6][1] = jLabel56;
        jLabel[6][2] = jLabel57;
        jLabel[6][3] = jLabel58;
        jLabel[6][4] = jLabel59;
        jLabel[6][5] = jLabel60;
        jLabel[6][6] = jLabel61;
        jLabel[6][7] = jLabel62;
        jLabel[6][8] = jLabel63;
        jLabel[7][0] = jLabel64;
        jLabel[7][1] = jLabel65;
        jLabel[7][2] = jLabel66;
        jLabel[7][3] = jLabel67;
        jLabel[7][4] = jLabel68;
        jLabel[7][5] = jLabel69;
        jLabel[7][6] = jLabel70;
        jLabel[7][7] = jLabel71;
        jLabel[7][8] = jLabel72;
        jLabel[8][0] = jLabel73;
        jLabel[8][1] = jLabel74;
        jLabel[8][2] = jLabel75;
        jLabel[8][3] = jLabel76;
        jLabel[8][4] = jLabel77;
        jLabel[8][5] = jLabel78;
        jLabel[8][6] = jLabel79;
        jLabel[8][7] = jLabel80;
        jLabel[8][8] = jLabel81;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel82 = new javax.swing.JLabel();
        jLabelLevel = new javax.swing.JLabel();
        jComboBoxCharacter = new javax.swing.JComboBox();
        jLabel83 = new javax.swing.JLabel();
        labelICLeft = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel82.setText("LEVEL");

        jLabelLevel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLevel.setText("1");

        jComboBoxCharacter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Batman", "Joker" }));
        jComboBoxCharacter.setFocusable(false);
        jComboBoxCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCharacterActionPerformed(evt);
            }
        });

        jLabel83.setText("IC LEFT :");

        labelICLeft.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73)
                    .addComponent(jLabel64)
                    .addComponent(jLabel55)
                    .addComponent(jLabel46)
                    .addComponent(jLabel37)
                    .addComponent(jLabel28)
                    .addComponent(jLabel19)
                    .addComponent(jLabel1)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel20)
                            .addComponent(jLabel29))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel21)
                            .addComponent(jLabel30))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel22))
                            .addComponent(jLabel31))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel14)
                                .addComponent(jLabel23))
                            .addComponent(jLabel32))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(jLabel24)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel25)
                            .addComponent(jLabel34))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jLabel26)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel27)
                            .addComponent(jLabel36)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel39)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel41)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel45))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel47)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel48)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel49)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel50)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel51)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel52)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel53)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel54))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel65)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel66)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel67)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel68)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel69)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel70)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel71)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel72))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel56)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel57)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel58)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel59)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel60)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel61)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel62)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel63)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel74)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel76)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel77)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel78)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel79)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel80)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel81)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel83)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(labelICLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel82)
                        .addComponent(jComboBoxCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelLevel)
                .addContainerGap(373, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel36))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel30))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel37)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel55)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel58)
                    .addComponent(jLabel59)
                    .addComponent(jLabel60)
                    .addComponent(jLabel61)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel64)
                        .addComponent(jLabel65)
                        .addComponent(jLabel66)
                        .addComponent(jLabel67)
                        .addComponent(jLabel68)
                        .addComponent(jLabel69)
                        .addComponent(jLabel70))
                    .addComponent(jLabel72)
                    .addComponent(jLabel71))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel73)
                    .addComponent(jLabel74)
                    .addComponent(jLabel75)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77)
                    .addComponent(jLabel78)
                    .addComponent(jLabel79)
                    .addComponent(jLabel80)
                    .addComponent(jLabel81))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel82, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLevel))
                .addGap(31, 31, 31)
                .addComponent(jComboBoxCharacter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel83)
                    .addComponent(labelICLeft))
                .addContainerGap(307, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        playSound("blop.wav");
        //PROCESS INPUT
        if (evt.getKeyCode() == KeyEvent.VK_UP) {
            if (b.checkPlayerMoveUp()) {
                b.getPlayer().moveUp();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            if (b.checkPlayerMoveDown()) {
                b.getPlayer().moveDown();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_LEFT) {
            if (b.checkPlayerMoveLeft()) {
                b.getPlayer().moveLeft();
            }
        } else if (evt.getKeyCode() == KeyEvent.VK_RIGHT) {
            if (b.checkPlayerMoveRight()) {
                b.getPlayer().moveRight();
            }
        }

        // CALCULATION
        int x = b.getPlayer().getX();
        int y = b.getPlayer().getY();
        if (b.checkPlayerWin()) {
            System.out.println("YOU WIN!!!");
            initiateLevel(level + 1);
            level = level + 1;
        }
        Tile tile = b.getTile()[x][y];

        if (tile.getObstacleType() == Tile.IC) {
            b.setICLeft(b.getICLeft() - 1);
            labelICLeft.setText(b.getICLeft() + "");
            tile.setFloor();
        }

        if (tile.getObstacleType() == Tile.REDSHOES) {
            b.setRedShoes(b.getRedShoes() + 1);
            tile.setFloor();
        }

        if (tile.getObstacleType() == Tile.BLUSHOES) {
            b.setBlueShoes(b.getBlueShoes() + 1);
            tile.setFloor();
        }

        if (b.checkPlayerMoveUp() == false) {
            if (b.getTile()[x][y - 1].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x][y - 1].setFloor();
                }
            }

        }
        if (b.checkPlayerMoveDown() == false) {
            if (b.getTile()[x][y + 1].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x][y + 1].setFloor();
                }
            }
        }
        if (b.checkPlayerMoveRight() == false) {
            if (b.getTile()[x + 1][y].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x + 1][y].setFloor();
                }
            }
        }
        if (b.checkPlayerMoveLeft() == false) {
            if (b.getTile()[x - 1][y].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x - 1][y].setFloor();
                }
            }
        }

        //RENDER
        drawBoard();
    }//GEN-LAST:event_formKeyPressed

    private void jComboBoxCharacterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCharacterActionPerformed
        // TODO add your handling code here:
        theme = jComboBoxCharacter.getSelectedIndex();
        drawBoard();
    }//GEN-LAST:event_jComboBoxCharacterActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ChipChallengeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChipChallengeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChipChallengeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChipChallengeUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChipChallengeUI().setVisible(true);
            }
        });
    }
    //<editor-fold defaultstate="collapsed" desc=" Variables declaration - do not modify  ">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox jComboBoxCharacter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelICLeft;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
