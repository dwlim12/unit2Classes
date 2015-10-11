import javax.swing.JFrame;
import java.util.Scanner;

/**
 * Class that contains the main method for the program and creates the frame containing the component.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeViewer
{
    // the cityscape will be animated for 60 seconds
    static final int ANIMATION_TIME_IN_SECONDS = 180;
   
    /**
     * main method for the program which creates and configures the frame for the program
     *
     */
    public static void main(String[] args) throws InterruptedException
    {
        // create and configure the frame (window) for the program
        JFrame frame = new JFrame();
        
        frame.setSize(800 /* x */, 600 /* y */);
        frame.setTitle("Cityscape");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // use the Scanner class to prompt the user for some configurable aspect of the cityscape
        // ...
        Scanner user_input = new Scanner(System.in);
        System.out.print("What is the radius of the sun? (>=50): ");
        int sun_radius = user_input.nextInt();
        System.out.print("How far is the sun from the left of the screen? (>0): ");
        int sun_distance = user_input.nextInt();
        System.out.print("How many floors will the building have? (max 19): ");
        int b_height = user_input.nextInt();
        System.out.print("How far is the car from the left of the screen? (>0): ");
        int car_distance = user_input.nextInt();
        int moon_distance = 750;
        
        // a frame contains a single component; create the Cityscape component and add it to the frame
        CityscapeComponent component = new CityscapeComponent(sun_radius,sun_distance,b_height,car_distance,moon_distance);
        frame.add(component);
        
        // make the frame visible which will result in the paintComponent method being invoked on the
        //  component.
        frame.setVisible(true);
        
        // animate the cityscape
        for( int seconds = 0; seconds < ANIMATION_TIME_IN_SECONDS; seconds++ )
        {
            component.nextFrame();
            Thread.sleep( 1000 );
        }
        
    }


}
