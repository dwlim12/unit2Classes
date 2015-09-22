import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Draws circles in order to make a target
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Target
{
    /** A target shape that can be positioned anywhere on the screen */
    private int xLeft;
    private int yTop;
    
    /**
     * Constructs a target given top left corner
     */
    public Target(int x,int y)
    {
        // initialise instance variables
        this.xLeft = x;
        this.yTop = y;
    }

    /**
     * Draws the target
     *
     * @param    g2     the graphics context
     */
    public void draw(Graphics2D g2)
    {
        Ellipse2D.Double firstCircle = new Ellipse2D.Double(xLeft,yTop,100,100);
        Ellipse2D.Double secondCircle = new Ellipse2D.Double(xLeft + 10,yTop + 10,80,80);
        Ellipse2D.Double thirdCircle = new Ellipse2D.Double(xLeft + 20,yTop + 20,60,60);
        Ellipse2D.Double fourthCircle = new Ellipse2D.Double(xLeft + 30,yTop + 30,40,40);
        Ellipse2D.Double fifthCircle = new Ellipse2D.Double(xLeft + 40,yTop + 40,20,20);
        
        g2.setColor(Color.RED);
        g2.draw(firstCircle);
        g2.setColor(Color.RED);
        g2.fill(firstCircle);
        g2.setColor(Color.WHITE);
        g2.draw(secondCircle);
        g2.fill(secondCircle);
        g2.setColor(Color.RED);
        g2.draw(thirdCircle);
        g2.fill(thirdCircle);
        g2.setColor(Color.WHITE);
        g2.draw(fourthCircle);
        g2.fill(fourthCircle);
        g2.setColor(Color.RED);
        g2.draw(fifthCircle);
        g2.fill(fifthCircle);
    }

}
