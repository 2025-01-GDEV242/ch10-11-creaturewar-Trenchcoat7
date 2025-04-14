

/**
 * The Human class implements a wrapper for the base Creature class with the following additions
 * Implements a maximum/minimum strength for the creature type [20/5]
 * Implements a maximum/minimum hitpoint total for the creature type [25/5]
 * 
 * @author Katie Strong
 * @version 2025.4.9
 */
public class Necromancer extends Human
{
    // instance variables - replace the example below with your own
    
    Battle battle;
    /**
     * Constructor for objects of class Human -
     * Note that the calling class does not need to know anything about the 
     * requirements of human minimum and maximum values
     * 
     * The instantiating class asks for a Human and the human class is responsible for
     * return a Human object with values in the appropriate range
     * 
     */
    public Necromancer(Battle battle)
    {
        this.battle = battle;
    }
    
    public int attack()
    {
        battle.increaseGoodArmySize(1);
        return super.attack();
    }
    // takeDamage(int) - not overridden, because Humans take all damage assigned to them

}
