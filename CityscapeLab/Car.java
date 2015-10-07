import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.Color;

/**
 * Draws a car in the cityscape window
 * 
 * @author @Lim
 * @version 7 October 2015
 */
public class Car
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;

    /**
     * Default constructor for objects of class Car
     */
    public Car(int x)
    {
        // initialise instance variables
        this.xLeft = x;
    }

    /**
     * Draws the sun with specified distance by user
     *
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle body = new Rectangle(xLeft,525,60,10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10,535,10,10);
        Ellipse2D.Double backTire = new Ellipse2D.Double(xLeft + 40,535,10,10);
        Rectangle roof = new Rectangle(xLeft + 15,515,30,10);
        g2.setColor(Color.RED);
        g2.draw(body);
        g2.fill(body);
        Color car_blue = new Color(102,102,255);
        g2.setColor(car_blue);
        g2.draw(roof);
        g2.fill(roof);
        g2.setColor(Color.LIGHT_GRAY);
        g2.draw(frontTire);
        g2.fill(frontTire);
        g2.draw(backTire);
        g2.fill(backTire);
    }

}
