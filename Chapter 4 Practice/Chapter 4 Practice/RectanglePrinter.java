import java.awt.Rectangle;
import java.util.Scanner;

public class RectanglePrinter
{
    public static void main(String[] args)
    {
        Scanner user_input = new Scanner(System.in);
        System.out.print("What is the length of the rectangle? (int): ");
        int length = user_input.nextInt(); 
        System.out.print("What is the width of the rectangle? (int): ");
        int width = user_input.nextInt();
        Rectangle r1 = new Rectangle(0,0,length,width);
        
        int area = length*width;
        System.out.println("The area of the rectangle is: " + area);
        
        double length_sq = Math.pow(length,2);
        double width_sq = Math.pow(width,2);
        double diagonal_sq = length_sq*width_sq;
        int diagonal = (int) (Math.sqrt(diagonal_sq));
        System.out.println("The length of the diagonal is: " + diagonal);
    }
}