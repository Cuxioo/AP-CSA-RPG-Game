public class Actions
{

    public static int attack()
    {
        int damage = (int)(Math.random() * 11) + 15;
        return damage;
    }

    public static int heal()
    {
        int heal = (int)(Math.random() * 11) + 13;
        return heal;
    }
} 
