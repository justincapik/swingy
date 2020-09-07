import fr.swingy.app;

public class Ghoul implements Monster extends LivingBeing
{
    private static int ghoulAttack = 1;
    private static int ghoulDefense = 3;
    private static int ghoulHitPoints = 10;
    private static int ghoulExperience = 1000;

    public Ghoul(int x, int y)
    {
        private int attack = ghoulAttack + ThreadLocalRandom.current().nextInt(0, 1 + 1);
        private int defense = ghoulDefense + ThreadLocalRandom.current().nextInt(-1, 1 + 1);
        private int hitPoints = ghoulHitPoints + ThreadLocalRandom.current().nextInt(-3, 3 + 1);

        super(x, y, "Ghoul", attack, defense, hitPoints);
    }
}