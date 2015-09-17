

/**
 * A car has a certain fuel efficiency and a certain amount
 * of fuel in the gas tank. The car can be driven a certain
 * distance.
 * 
 * @author Lim
 * @version 10 September 2015
 */
public class Car
{
    /** fuel efficiency of the car in miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** amount of fuel left in the car's tank in gallons */
    private double fuelInTank;

    /**
     *Constructor for objects of class Car that specifies fuel efficiency
     */
    public Car(double fuelEfficiency)
    {
        // initialise instance variables
        this.fuelEfficiency = fuelEfficiency;
        this.fuelInTank = 0;
    }

    /**
     * Simulates driving the car a specified distance and reduces the amount
     *      of fuel in the tank.
     * 
     *
     * @pre        specified distance cannot result in the consumption of more gas
     *              than is available
     * @post       
     * 
     * @param      distance distance that the car drives in miles
     */
    public void drive(double distance)
    {
        this.fuelInTank -= distance / this.fuelEfficiency;
    }
    
    /**
     * Returns the amount of gas in the car's tank in units of gallons
     * 
     * @return the amount of gas in the car's tank in units of gallons
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }
    
    /**
     * Increments the fuel in the car's tank by a specified amount in gallons
     *
     * @pre     gallonsOfGas must be a positive number
     * 
     * @param   gallonsOfGas amount of gas to add to the car's tank in gallons
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;
    }


}
