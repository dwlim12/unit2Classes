import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Creates a moon in the cityscape window
 * 
 * @author @Lim
 * @version 11 October 2015
 */
public class Moon
{
    // instance variables - replace the example below with your own
    private int xLeft;
    private int radius;

    /**
     * Constructor for objects of class Moon
     */
    public Moon(int x,int size)
    {
        // initialise instance variables
        this.xLeft = x;
        this.radius = size;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double Circle = new Ellipse2D.Double(xLeft,-(radius/2),radius,radius);
        Color moon = new Color(192,192,192);
        g2.setColor(moon);
        g2.draw(Circle);
        g2.fill(Circle);
        xLeft -= 5;
    }
}
