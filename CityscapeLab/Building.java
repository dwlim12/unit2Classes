import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Color;

/**
 * Write a description of class Building here.
 * 
 * @author @Lim
 * @version 2 October 2015
 */
public class Building
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int floors;

    /**
     * Default constructor for objects of class Building
     */
    public Building(int x,int num_floors)
    {
        // initialise instance variables
        this.xLeft = x;
        this.floors = num_floors;
    }

    /**
     * Draws the building with specified instances supplied by user
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle building = new Rectangle(xLeft,0,100,30 + (25*floors));
        int yTop = (500-(30+(25*floors)));
        building.translate(0,yTop);
        Color b_blue = new Color(102,102,255);
        g2.setColor(b_blue);
        g2.draw(building);
        g2.fill(building);
        Rectangle door = new Rectangle(xLeft + 10,10 + (25*floors),10,20);
        door.translate(0,yTop);
        Color door_color = new Color(102,51,0);
        g2.setColor(door_color);
        g2.draw(door);
        g2.fill(door);
        for( int paneTop = yTop + 5;paneTop < yTop + 390; paneTop += 25)
        {
        Rectangle pane = new Rectangle(xLeft + 5, paneTop + 150,20,20);
        g2.draw(pane);
        Color window = new Color(153,204,255);
        g2.setColor(window);
        g2.fill(pane);
       }
    }

}