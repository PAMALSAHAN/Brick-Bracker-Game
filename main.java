import javax.swing.JFrame;

/**
 * main
 */
public class main {

    public static void main(String[] args) {
        //this is use to make frame 
        JFrame frame=new JFrame();
        gamePlay play=new gamePlay(); 
        frame.setBounds(10,10,700,800);
        frame.setTitle("Brick Bracker Game");
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // add give an error  gameplay class eka extend karanna Jpanel ekata. 
        frame.add(play);
          


    }
}