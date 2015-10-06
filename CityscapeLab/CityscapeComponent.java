import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;
import java.util.Random;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int sun_radius;
    private int building_height;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    /**
     * Default contructor for objects of class Cityscape
     */
    public CityscapeComponent(int sun_radius, int building_height)
    {
        //initialize instance variables
        this.sun_radius = sun_radius;
        this.building_height = building_height;
    }
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        // invoke the draw method on each object in your Cityscape
        // ...
        Color lightblue = new Color(102,178,255);
        g2.setColor(lightblue);
        Rectangle sky = new Rectangle(0,0,800,600);
        g2.draw(sky);
        g2.fill(sky);
        Color street = new Color(32,32,32);
        g2.setColor(street);
        Rectangle ground = new Rectangle(0,500,800,100);
        g2.draw(ground);
        g2.fill(ground);
        Random distance = new Random();
        int sun_distance = distance.nextInt(750);
        Sun sun = new Sun(sun_distance,sun_radius);
        sun.draw(g2);
        Building b1 = new Building(500,building_height);
        b1.draw(g2);
        
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
    }

}
