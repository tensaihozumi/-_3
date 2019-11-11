import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
/**
 * Write a description of class MyHelloPanelListener here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloPanelListener extends JPanel implements MouseListener,KeyListener
{
    public JLabel la = new JLabel("Hello");
    public MyHelloPanelListener(){
        la.setSize(50,20);
        la.setLocation(30,30);
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
    public void mouseClicked(MouseEvent e){
        int x = e.getX();
        int y = e.getY();
        la.setLocation(x,y);
    }
    public void mouseEntered(MouseEvent e){}
    public void mouseExited(MouseEvent e){}
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}
    
}
