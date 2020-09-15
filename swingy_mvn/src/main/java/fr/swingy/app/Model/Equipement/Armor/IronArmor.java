package fr.swingy.app;

public class IronArmor extends Equipement implements Armor
{
    @Override
    public int defenseBonus()
    {
        return 3;
    }
}