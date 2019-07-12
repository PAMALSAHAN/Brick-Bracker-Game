import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

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







    
}