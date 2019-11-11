import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class MyHelloPanelListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloPanelListener extends JPanel implements KeyListener
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
    public void keyPressed(KeyEvent e){
        int keyCode = e.getKeyCode();
        switch(keyCode){
            case KeyEvent.VK_UP:
            la.setLocation(la.getX(), la.getY()-10);break;
            case KeyEvent.VK_DOWN:
            la.setLocation(la.getX(), la.getY()+10);break;
            case KeyEvent.VK_LEFT:
            la.setLocation(la.getX()-10,la.getY());break;
            case KeyEvent.VK_RIGHT:
            la.setLocation(la.getX()+10,la.getY());break;
        }
    }
    public void keyReleased(KeyEvent e){}
    public void keyTyped(KeyEvent e){}
}
