import fr.swingy.app;

public class Sith extends Equipement implements Weapon
{
    @Override
    public int attackBonus()
    {
        return 5;
    }
}