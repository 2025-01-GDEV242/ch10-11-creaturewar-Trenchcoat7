

/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Katie Strong
 * @version 2025.4.9
 */
public class Barlog extends Demon
{
    // instance variables - replace the example below with your own
    private static final int MAX_BARLOG_HP = 200;
    private static final int MIN_BARLOG_HP = 80;
    private static final int MAX_BARLOG_STR = 100;
    private static final int MIN_BARLOG_STR = 50;

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Barlog()
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            MAX_BARLOG_STR,
            MIN_BARLOG_STR,
            MAX_BARLOG_HP,
            MIN_BARLOG_HP
        );
          
    }
    
    public int attack()
    {
        return (super.attack() + super.attack());
    }
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}