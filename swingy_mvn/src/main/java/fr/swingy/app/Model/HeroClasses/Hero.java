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

    public Hero(String name, String class)
    {
        if (class.equals("Cleric"))
            hClass = new Cleric();
        if (class.equals("Fighter"))
            hClass = new Fighter();
        if (class.equals("Assassin"))
            hClass = new Assassin();
        super(0, 0, "Hero");
        weapond = null;
        armor = null;
        helm = null;
        level = 0;
        experience = 0;
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
        // TODO:
    }

    public int getTotalHitPoints()
    {
        // TODO:
    }

    public int getTotalDefense()
    {
        // TODO:
    }

    public int getCurrentHitPoints()
    {
        return currentHitPoint;
    }

    public void resetHitPoints()
    {
        currentHitPoint = getTotalHitPoints();
    }
}