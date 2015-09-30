

/**
 * Write a description of class AnnuityCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnuityCalc
{
    /** description of instance variable x (add comment for each instance variable) */
    private int pmt;
    private double i;
    private int n;

    /**
     * Default constructor for objects of class AnnuityCalc
     */
    public AnnuityCalc(int pmt,double i, int n)
    {
        // initialise instance variables
        this.pmt = pmt;
        this.i = i;
        this.n = n;
    }

    /**
     * Calculates the annuity and returns the value
     */
    public double getAnnuity()
    {
        // put your code here
        double power = Math.pow((1 + this.i),(this.n-1));
        double annuity = this.pmt*(((power/this.i)/power)+1);
        return annuity;
    }

}
