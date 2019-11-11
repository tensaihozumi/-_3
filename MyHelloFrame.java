import javax.swing.*;
/**
 * Write a description of class MyHelloFrame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyHelloFrame extends JFrame
{
    public MyHelloFrame(){
        setTitle("실습_3(2019.11.11)");
        setSize(300,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        MyHelloPanelListener mp = new MyHelloPanelListener();
        this.add(mp);
        this.addMouseListener(mp);
        this.addKeyListener(mp);
    }
}
