

/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Katie Strong
 * @version 2025.4.9
 */
public class Demon extends Creature
{

    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Demon(int maxStr, int minStr,int maxHp, int minHp)
    {
        // note how the class uses the static randomizer class to
        // generate the values. This localizes the need to know 
        // max and min values to this class only
        // max-min is range of values
        // range + min ensures that the values don't start at one.
        super(
            Randomizer.nextInt(maxStr - minStr)+minStr,
            Randomizer.nextInt(maxHp-minHp)+minHp        
        );
          
    }
    
    public int attack()
    {
         if(Randomizer.nextInt(100) <= 5)
         {
             return (super.attack() + 50);
         }else
         {
             return super.attack();
         }
    }
    // attack() - not overridden because Humans generate basic damage
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
