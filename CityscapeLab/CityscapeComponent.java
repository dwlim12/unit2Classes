import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;
import javax.swing.JComponent;

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
    private int sun_distance;
    private int building_height;
    private int car_distance;
    private int moon_distance;
    
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    /**
     * Default contructor for objects of class Cityscape
     */
    public CityscapeComponent(int sun_radius, int sun_distance, int building_height, int car_distance, int moon_distance)
    {
        //initialize instance variables
        this.sun_radius = sun_radius;
        this.sun_distance = sun_distance;
        this.building_height = building_height;
        this.car_distance = car_distance;
        this.moon_distance = moon_distance;
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
        Sun sun = new Sun(sun_distance,sun_radius);
        Moon moon = new Moon(moon_distance,sun_radius);
        if(sun_distance < 0){
            Color night = new Color(0,0,51);
            g2.setColor(night);
            g2.fill(sky);
            g2.setColor(street);
            g2.fill(ground);
            moon.draw(g2);
            moon_distance -= 5;
        } else{
            sun.draw(g2);
            sun_distance -= 5;
        }
        if (moon_distance <0){
            sun_distance += 750;
            moon_distance += 750;
        }
        Building b1 = new Building(500,building_height);
        b1.draw(g2);
        Building b2 = new Building(250,building_height);
        b2.draw(g2);
        Car c1 = new Car(car_distance);
        c1.draw(g2);
        car_distance -= 30;
        if (car_distance < 0){
            car_distance += 800;
        }
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        repaint();
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
    }

}
