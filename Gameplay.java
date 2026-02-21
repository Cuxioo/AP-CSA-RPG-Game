import java.util.Scanner;
public class Gameplay 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static int human()
    {
        System.out.println("What action will you choose? (1) attack (2) heal");
        return scanner.nextInt();
    }

    public void play()
    {
        int enemyHealth = 100;
        int playerHealth = 100;
        while (enemyHealth > 0 && playerHealth > 0)
        {
           int action = human();
           if (action == 1)
            {
                int damage = Actions.attack();
                enemyHealth -= damage;
                System.out.println("You hit the enemy for " +  damage + " damage!");
            }
            else if (action == 2)
            {
                int heals = Actions.heal();
                playerHealth += heals;
                System.out.println("You healed yourself for " +  heals + " health!");
            }
            else
            {
                System.out.println("Not a valid action");
            }
            System.out.println("Player health: " + playerHealth);
            System.out.println("Enemy health: " + enemyHealth);

            if (enemyHealth > 0)
            {
                int choice = (int)(Math.random() * 10) + 1;
                if (choice > 5)
                {
                    int enemyDamage = Actions.attack();
                    playerHealth -= enemyDamage;
                    System.out.println("Enemy did " + enemyDamage + " to you!");
                }
                else
                {
                    int enemyHeals = Actions.heal();
                    enemyHealth += enemyHeals;
                    System.out.println("Enemy healed for " + enemyHeals + " health!");
                }
            }
            System.out.println("Player health: " + playerHealth);
            System.out.println("Enemy health: " + enemyHealth);
        }
        if (playerHealth <= 0)
        {
            System.out.println("You lose!");
        }
        else
        {
            System.out.println("You win!");
        }
        scanner.close();
    }

}
