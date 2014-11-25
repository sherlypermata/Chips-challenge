package view;


import engine.*;
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
 * Kelas ini merupakan Antarmuka dari Batman's Challenge.
 */
public class ChipChallengeUI extends javax.swing.JFrame {

    private JLabel[][] jLabel;
    Board b;
    private int level = 1;
    private int theme;
    private CharacterPlayer characterPlayer;
    private CharacterPlayerLoseFire characterPlayerLoseFire;
    private CharacterPlayerLoseWater characterPlayerLoseWater;
    private Map mapLevel;

    /**
     * Method ini adalah konstruktor dari kelas ChipChallengeUI.
     */
    public ChipChallengeUI() {
        initComponents();

        setJLabel();

        theme = 0;
        characterPlayer = new CharacterPlayer();
        characterPlayerLoseFire = new CharacterPlayerLoseFire();
        characterPlayerLoseWater =new CharacterPlayerLoseWater();
        mapLevel= new MapLevel();

        b = new Board();
        initiateLevel(1);
        drawBoard();

    }
    
    /**
     * Method ini berfungsi untuk memainkan suara.
     */

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
    /**
     * Method ini berfungsi untuk menginisiasi level permainan.
     */
    public void initiateLevel(int level) {
        //LEVEL 1
        if (level == 1) {
            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(mapLevel.getLevel(level));
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);
            playSound("boss2.wav");
           

            //LEVEL 2
        } else if (level == 2) {
            
            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(mapLevel.getLevel(level));
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

            //LEVEL 3
        } else if (level == 3) {
            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(mapLevel.getLevel(level));
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);
            
            //LEVEL 4
        } else if (level == 4) {
            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(mapLevel.getLevel(level));
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

            //LEVEL 5
        } else if (level == 5) {
            
            Chip c = new Chip(4, 4);
            b.setPlayer(c);
            Tile[][] tile = convertMapToTile(mapLevel.getLevel(level));
            b.setTile(tile, 9, 9);
            String levelString = Integer.toString(level);
            jLabelLevel.setText(levelString);

        }
        labelICLeft.setText(b.countIC() + "");
    }

    /**
     * Method ini berfungsi untuk mengkonversi map menjadi tiles.
     */
    public Tile[][] convertMapToTile(int[][] map) {
        Tile[][] tile = new Tile[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                tile[j][i] = new Tile(map[i][j]);
            }
        }
        return tile;
    }

    /**
     * Method ini berfungsi untuk menggambar setiap objek pada Board. 
     */
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
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Water.gif"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.REDSHOES) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\RedShoes.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.BLUSHOES) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\BlueShoes.jpg"));
                } else if (b.getTile()[j][i].getObstacleType() == Tile.JOKER) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\Joker.jpg"));
                }else if (b.getTile()[j][i].getObstacleType() == Tile.JOKER) {
                    jLabel[i][j].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\PortalWin.jpg"));
                }
            }
        }

        setPlayerImage();
    }

    /**
     * Method ini berfungsi untuk mengatur gambar player.
     */
    public void setPlayerImage() {
        int x = b.getPlayer().getX();
        int y = b.getPlayer().getY();
        jLabel[y][x].setIcon(new javax.swing.ImageIcon(characterPlayer.getFileName(theme)));
        if (b.getTile()[x][y].getObstacleType() == Tile.FINISH) {
            jLabel[y][x].setIcon(new javax.swing.ImageIcon(System.getProperty("user.dir") + "\\Image\\PortalWIn.jpg"));

        }
        if (b.getTile()[x][y].getObstacleType() == Tile.API) {
            jLabel[y][x].setIcon(new javax.swing.ImageIcon(characterPlayerLoseFire.getFileName(theme)));
            if (b.getRedShoes() == 0) {
                playSound("burn.wav");
                JOptionPane.showMessageDialog(this, "Joker : Burn in Hell!!!HAHAHAHAHA!!!");        
                initiateLevel(level);
                drawBoard();
            }
        }

        if (b.getTile()[x][y].getObstacleType() == Tile.WATER) {
            jLabel[y][x].setIcon(new javax.swing.ImageIcon(characterPlayerLoseWater.getFileName(theme)));
            playSound("waterwalk.wav");
            if (b.getBlueShoes() == 0) {
                playSound("sink.wav");
                JOptionPane.showMessageDialog(this, "Joker : Say Hello to the Shark!!!HAHAHAHA!!!");        
                initiateLevel(level);
                drawBoard();
                
            }
        }
        
        if (b.getTile()[x][y].getObstacleType() == Tile.JOKER) {
            playSound("punch.wav");
            JOptionPane.showMessageDialog(this, "Gordon : You win...You Catch the Joker!"); 
            JOptionPane.showMessageDialog(this, "Thanks for Playing"); 
            
        }

    }

    /**
     * Method ini berfungsi untuk mengatur posisi label pada UI.
     */
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
        jLabel84 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(750, 450));
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, -1, -1));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, -1, -1));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, -1, -1));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, -1, -1));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, -1, -1));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, -1, -1));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, -1));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, -1, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, -1, -1));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, -1, -1));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, -1, -1));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, -1));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, -1, -1));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 250, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 290, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, -1, -1));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, -1, -1));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, -1, -1));

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, -1, -1));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 330, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, -1, -1));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 370, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, -1, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, -1, -1));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Floor.png"))); // NOI18N
        getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 0, 15, 408));

        jLabel82.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel82.setText("LEVEL");
        getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 11, -1, 41));

        jLabelLevel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelLevel.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLevel.setText("1");
        getContentPane().add(jLabelLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 17, -1, -1));

        jComboBoxCharacter.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jComboBoxCharacter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Batman", "Nightwing", "RedRobin", "Batgirl" }));
        jComboBoxCharacter.setFocusable(false);
        jComboBoxCharacter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCharacterActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCharacter, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, -1, -1));

        jLabel83.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setText("IC LEFT :");
        getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, -1, -1));

        labelICLeft.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelICLeft.setForeground(new java.awt.Color(255, 255, 255));
        labelICLeft.setText("0");
        getContentPane().add(labelICLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("Choose your character:");
        getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, -1, -1));

        jLabel86.setFont(new java.awt.Font("Adobe Garamond Pro", 1, 24)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("Batman Challenge");
        getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, -1, -1));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/batmanlogo.png"))); // NOI18N
        getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 40, -1, -1));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/ObjectImage/Gotham.jpg"))); // NOI18N
        getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method ini berfungsi untuk mengatur agar player dapat digerakkan menggunakan keyboard.
     */
    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        playSound("blop.wav");
        //playSound("boss.wav");
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
            
            initiateLevel(level + 1);
            level = level + 1;
            JOptionPane.showMessageDialog(this, "Oracle : Go to the Next Level");
            playSound("portal.wav");
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
                    playSound("gateopened.wav");
                }
            }

        }
        if (b.checkPlayerMoveDown() == false) {
            if (b.getTile()[x][y + 1].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x][y + 1].setFloor();
                    playSound("gateopened.wav");
                }
            }
        }
        if (b.checkPlayerMoveRight() == false) {
            if (b.getTile()[x + 1][y].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x + 1][y].setFloor();
                    playSound("gateopened.wav");
                }
            }
        }
        if (b.checkPlayerMoveLeft() == false) {
            if (b.getTile()[x - 1][y].getObstacleType() == Tile.GERBANG) {
                if (b.countIC() == 0) {
                    b.getTile()[x - 1][y].setFloor();
                    playSound("gateopened.wav");
                }
            }
        }

        //RENDER
        drawBoard();
    }//GEN-LAST:event_formKeyPressed

    /**
     * Method ini berfungsi untuk memberi aksi setelah pengguna memilih karakter pada comboBox.
     */
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
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelLevel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelICLeft;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
