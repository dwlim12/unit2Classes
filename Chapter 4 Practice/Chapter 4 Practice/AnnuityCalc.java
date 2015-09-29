

/**
 * Write a description of class AnnuityCalc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AnnuityCalc
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

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
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public int getAnnuity()
    {
        // put your code here
        annuity = this.pmt*((((1+this.i)^(this.n-1)/this.i)/(1+this.i)^(this.n-1))+1);
        return annuity;
    }

}
