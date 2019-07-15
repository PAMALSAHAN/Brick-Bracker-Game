import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

import com.sun.glass.events.KeyEvent;

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
        g.fillOval(ballposX, ballposY, 20, 20);

        g.dispose();

        public void keyTyped(KeyEvent e){
            //tpah
        }
        public void KeyReleased(KeyEvent e){ }

        public void actionPerformed(ActionEvent e){
            timer.start();
            repaint(); // repeat paint function again and again
          //this is to do 
        }

        
       
        public void KeyPressed(KeyEvent e){

            if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                if(playerX >=600){
                    playerX=600;
                }
                else{
                    moveRight();
                }
            }
            if(e.getKeyCode()==KeyEvent.VK_LEFT){
                if(playerX >=10){
                    playerX=10;
                }
                else{
                    moveLeft();
                }
            }

        }

        public void moveRight(){
            play=true;
            playerX+=20;

        }
        public void moveRight(){
            play=true;
            playerX+=20;
            
        }

       
    }







    
}