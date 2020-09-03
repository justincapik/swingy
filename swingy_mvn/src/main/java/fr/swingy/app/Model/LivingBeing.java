package fr.swingy.app;

public abstract class LivingBeing extends Existing
{
    protected int attack;
    protected int defense;
    protected int hitPoints;
    //protected int luck;

    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getHitPoints() {
        return hitPoints;
    }

    public void move(String direction)
    {
        // TODO: limit map min max
        if (direction.equals("NORTH"))
        {
            this.y--;
        }
        if (direction.equals("SOUTH"))
        {
            this.y++;
        }
        if (direction.equals("EAST"))
        {
            this.x++;
        }
        if (direction.equals("WEST"))
        {
            this.x--;
        }
        
    }

    protected LivingBeing()
    {
        super(0, 0, "none");
        attack = 0;
        defense = 0;
        hitPoints = 0;
    }
    
    protected LivingBeing(int x, int y, String name)
    {
        super(x, y, name);
        attack = 2;
        defense = 0;
        hitPoints = 10;
    }

    protected LivingBeing(int x, int y, String name, int attack, int defense, int hitPoints)
    {
        super(x, y, name);
        this.attack = attack;
        this.defense = defense;
        this.hitPoints = hitPoints;
    }

}