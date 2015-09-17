

/**
 * Use coins to get cans and be able to find out how many of each are inside the vending machine
 * at all times.
 * 
 * @author Lim
 */
public class VendingMachine
{
    /** number of cans in the machine */
    private int cansInMachine;
    
    /** number of coins in the machine */
    
    private int coinsInMachine;

    /**
     * Default constructor for objects of class VendingMachine
     */
    public VendingMachine(int cansInMachine)
    {
        // initialise instance variables
        this.cansInMachine = cansInMachine;
        this.coinsInMachine = 0;
    }

    /**
     * Adds cans to the machine
     * 
     * @param    cans    number of cans being added to the machine
     */
    public void addCans(int cans)
    {
        // put your code here
        this.cansInMachine += cans;
    }
    
    /**
     * Returns the amount of cans in the machine
     *
     * @return  amount of cans in the machine
     */
    public int getCans()
    {
        // put your code here
        return this.cansInMachine;
    }
    

    /**
     * Returns the amount of coins in the machine
     *
     * @return  amount of coins in the machine
     */
    public int getCoins()
    {
        // put your code here
        return this.coinsInMachine;
    }
    

    /**
     * Adds a coin to the machine and subtracts a can
     *
     * @pre     there is at least one can in the machine
     */
    public void insertCoin()
    {
        // put your code here
        this.coinsInMachine += 1;
        this.cansInMachine -= 1;
    }


}
