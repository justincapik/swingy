import fr.swingy.app;

public class LeatherArmor extends Equipement implements Armor
{
    @Override
    public int defenseBonus()
    {
        return 1;
    }
}