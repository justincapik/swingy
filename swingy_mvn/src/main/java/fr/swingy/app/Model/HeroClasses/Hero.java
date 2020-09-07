package fr.swingy.app;

public class Hero extends LivingBeing
{
    private HeroClass hClass;
    private Weapond weapond;
    private Armor armor;
    private Helm helm;
    private int level;
    private int experience;
    private String HeroName;
    private int currentHitPoint;

    // TODO: load hero constructor

    public Hero(String name, String heroClass)
    {
        if (heroClass.equals("Cleric"))
            hClass = new Cleric();
        if (heroClass.equals("Fighter"))
            hClass = new Fighter();
        if (heroClass.equals("Assassin"))
            hClass = new Assassin();
        super(0, 0, "Hero", 2, 0, 15);
        weapond = null;
        armor = null;
        helm = null;
        level = 0;
        experience = 0;
        currentHitPoint = getTotalHitPoints();
    }

    public int getLevel()
    {
        return level;
    }

    public int getExperience()
    {
        return experience;
    }

    public int getTotalAttack()
    {
       return attack + weapond.attackBonus() + hClass.attackBonus(); 
    }

    public int getTotalHitPoints()
    {
        return hitpoints + helm.hitPointBonus() + hClass.hitPointBonus();
    }

    public int getTotalDefense()
    {
        return defense + armor.defenseBonus() + hClass.defenseBonus();
    }

    public int getCurrentHitPoints()
    {
        return currentHitPoint;
    }

    public void resetHitPoints()
    {
        currentHitPoint = getTotalHitPoints();
    }

    public boolean giveExperience(int monsterExperience)
    {
        experience += monsterExperience;
        if (experience > (level * 1000 + Math.pow((level - 1), 2) * 450))
        {
            level++;
            hitpoints += 5;
            defense++;
            attack++;
            resetHitPoints();
            return true;
        }
        return false;
    }
}