import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a sun in the cityscape window
 * 
 * @author @Lim
 * @version 2 October 2015
 */
public class Sun
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int radius;

    /**
     * Default constructor for objects of class Sun
     */
    public Sun(int x,int size)
    {
        // initialise instance variables
        this.xLeft = x;
        this.radius = size;
    }

    /**
     * Draws the sun with specified instances supplied by user
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double Circle = new Ellipse2D.Double(xLeft,-(radius/2),radius,radius);
        g2.setColor(Color.YELLOW);
        g2.draw(Circle);
        g2.fill(Circle);
    }

}
