package fr.swingy.app;

public class IronHelm extends Equipement implements Helm
{
    @Override
    public int hitPointBonus()
    {
        return 10;
    }
}