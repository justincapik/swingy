import fr.swingy.app;

public class Dragon extends LivingBeing implements Monster
{
    private static int dragonAttack = 5;
    private static int dragonDefense = 3;
    private static int dragonHitPoints = 20;
    private static int dragonExperience = 3000;

    public Dragon(int x, int y)
    {
        int attack = dragonAttack + ThreadLocalRandom.current().nextInt(-2, 2 + 1);
        int defense = dragonDefense + ThreadLocalRandom.current().nextInt(-1, 1 + 1);
        int hitPoints = dragonHitPoints + ThreadLocalRandom.current().nextInt(-5, 5 + 1);

        super(x, y, "Dragon", attack, defense, hitPoints);
    }
}