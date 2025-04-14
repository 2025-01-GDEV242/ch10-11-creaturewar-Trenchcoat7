
/**
 * Write a description of class Battle here.
 *
 * @author Katie Strong
 * @version 2025.4.9
 */
public class Battle
{
    // instance variables - replace the example below with your own
    private int goodArmySize;
    private int badArmySize;
    
    /**
     * Constructor for objects of class Battle
     */
    public Battle()
    {
        // initialise instance variables
        goodArmySize = 100;
        badArmySize = 50;
    }
    public Creature goodArmyCreate()
    {
        int rand = Randomizer.nextInt(10);
        if(rand <= 6)
        {
            return new Human();
        }else if (rand <= 8)
        {
            return new Elf();
        }else if (rand <= 9)
        {
            return new Necromancer(this);
        }
        return new Human();
    }
    public Creature badArmyCreate()
    {
        int rand = Randomizer.nextInt(25);
        if(rand <= 18)
        {
            return new Human();
        }else if (rand <= 24)
        {
            return new CyberDemon();
        }else if (rand <= 25)
        {
            return new Barlog();
        }
        return new Human();
    }
    public void increaseGoodArmySize(int increase)
    {
        goodArmySize = goodArmySize + increase;
    }
    public void Fight()
    {
        Creature good = goodArmyCreate();
        Creature bad = badArmyCreate();
        while(goodArmySize > 0 && badArmySize > 0)
        {
            if(!good.isAlive())
            {
            goodArmySize--;
            good = goodArmyCreate();
            }
            if(!bad.isAlive())
            {
            badArmySize--;
            bad = badArmyCreate();
            }
            while(bad.isAlive() && good.isAlive())
            {
                bad.takeDamage(good.attack());
                good.takeDamage(bad.attack());
            }
        }
        
        if (goodArmySize > 0)
        {
            System.out.println("The bad army wins!");
        }
        if (badArmySize > 0)
        {
            System.out.println("The good army wins!");
        }
    }
}
