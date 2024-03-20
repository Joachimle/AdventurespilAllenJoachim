public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int healthPoints;
    private Weapon enemyWeapon;

  //constructor
    public Enemy(String enemyDescription, String enemyName, int healthPoints, Weapon enemyWeapon){
        this.enemyDescription = enemyDescription;
        this.enemyName = enemyName;
        this.healthPoints = healthPoints;
        this.enemyWeapon = enemyWeapon;
    }

    // getters
    public String getEnemyDescription() {
        return enemyDescription;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    /// Attack metoden skal laves færdig
    public void enemyAttack(Player player){
        System.out.println(enemyName+ enemyDescription+" attaks"+ player.getPlayerHealth()+ "with"+ enemyWeapon);

    }

    public void death(){
        System.out.println(enemyName + enemyDescription +"you have been defeated");
        dropWeapon();
    }

    public void enemyHit(int damageTaken){
        healthPoints -= damageTaken;
        if(healthPoints <= 0){
            death();
        }
    }

    public void dropWeapon(){
    System.out.println(enemyName + enemyDescription + " drops" + enemyWeapon);
    }
}
