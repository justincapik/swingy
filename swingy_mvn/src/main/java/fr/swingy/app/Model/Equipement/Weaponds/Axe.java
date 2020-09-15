package fr.swingy.app;

public class Axe extends Equipement implements Weapon
{
    @Override
    public int attackBonus()
    {
        return 1;
    }
}