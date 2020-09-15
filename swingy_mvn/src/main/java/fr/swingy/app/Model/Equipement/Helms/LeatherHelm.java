package fr.swingy.app;

public class LeatherHelm extends Equipement implements Helm
{
    @Override
    public int hitPointBonus()
    {
        return 5;
    }
}