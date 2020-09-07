import fr.swingy.app;

public class Sword extends Equipement implements Weapon
{
    @Override
    public int attackBonus()
    {
        return 3;
    }
}