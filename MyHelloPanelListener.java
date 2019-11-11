import javax.swing.*;
import java.awt.event.*;
/**
 * Write a description of class MyHelloPanelListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloPanelListener extends JPanel implements KeyListener implements MouseListener
{ 
    public JLabel la = new JLabel("Hello");
    public MyHelloPanelListener(){
        la.setSize(100,20);
        la.setLocation(50,50);
        this.setLayout(null);
        la.setFocusable(true);
        la.requestFocus();
        this.add(la);
    }
    public void keyPressed(KeyEvent e){}
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
