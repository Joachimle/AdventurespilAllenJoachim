public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealthPoints;
    private Weapon enemyWeapon;

  //constructor
    public Enemy(String enemyName, String enemyDescription, int enemyHealthPoints, Weapon enemyWeapon){
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyHealthPoints = enemyHealthPoints;
        this.enemyWeapon = enemyWeapon;
    }

    // getters
    public Weapon getEnemyWeapon() {
        return enemyWeapon;
    }
    public String getEnemyName() {
        return enemyName;
    }

    public int getEnemyHealthPoints() {
        return enemyHealthPoints;
    }

    public int getEnemyWeaponDamage(){
        return enemyWeapon.getDamagePerAttack();
    }

    public boolean enemyDied() {
        if (enemyHealthPoints <= 0) {
            return true;
        }
        return false;
    }
    public void enemyHit(int damageTaken){
        enemyHealthPoints -= damageTaken;
        if(enemyHealthPoints <= 0){
            enemyDied();
        }
    }

    @Override
    public String toString(){
        return getEnemyName();
    }
}
