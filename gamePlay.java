import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

import javafx.scene.layout.BorderStroke;

/**
 * gamePlay
 */
public class gamePlay extends JPanel implements KeyListener, ActionListener {
     private boolean play =false;
     private int score=0;

     private int totalBricks=21;
     
     private Timer timer; //asign the Time
     private int delay=8;

     private int playerX =310; //init slider in the x axis

     private int ballposX=120;
     private int ballposY=350;
     private int ballXdir=-1;

     public gamePlay(){
         addKeyListener(this);
         setFocusable(true); // why
         setFocusTraversalKeysEnabled(false);
         timer=new Timer(delay,this);
         timer.start();
     }

    public void paint(Graphics g){
        //set background 
        g.setColor(Color.black);
        g.fillRect(1, 1, 692, 592);

        //Border
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //set paddle
        g.setColor(Color.green);
        g.fillRect(playerX,550,100, 8);

        //set ball
        g.setColor(Color.yellow);
        g.fillRect(ballposX, ballposY, 20, 20);
    }







    
}