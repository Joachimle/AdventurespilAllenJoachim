public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int healthPoints= 0;
    private
  Weapon enemyweapon;

  //contrucktor
    public Enemy(String enemyDescription, String enemyName, int healthLevel, Weapon weapon){
        this. enemyDescription = enemyDescription;
        this. enemyName = enemyName;
        this.healthPoints =100;

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
    public void attack(Player player){
        System.out.println(enemyName+" attaks"+ player.getPlayerHealth()+ "with"+ enemyweapon);

    }
    public void death(){
        System.out.println(enemyName +"you have been defeated");
        dropWeapon();
    }


public void hit(int damage){
        healthPoints -=damage;
        if(healthPoints <=0){
            death();
        }
}

public void dropWeapon(){
    System.out.println(enemyName + enemyweapon+ " drops" +enemyweapon );
}
}
