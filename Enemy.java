public class Enemy {
    private String enemyName;
    private String enemyDescription;
    private int enemyHealthPoints;
    private Weapon enemyWeapon;
    private int enemyDamageDone;
    private int enemyWeaponDamage;

  //constructor
    public Enemy(String enemyName, String enemyDescription, int enemyHealthPoints, Weapon enemyWeapon){
        this.enemyName = enemyName;
        this.enemyDescription = enemyDescription;
        this.enemyHealthPoints = enemyHealthPoints;
        this.enemyWeapon = enemyWeapon;
    }

    // getters
    public String getEnemyDescription() {
        return enemyDescription;
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
    public void setEnemyDamageDone(int enemyDamageDone) {
        this.enemyDamageDone = enemyDamageDone;
    }

    /// Attack metoden skal laves færdig
    public void enemyAttack(Player player){
        System.out.println(enemyName+" attacks");
        setEnemyDamageDone(getEnemyWeaponDamage());
    }

    public boolean enemyDied() {
        if (enemyHealthPoints <= 0) {
            System.out.println(enemyName +" have been defeated");
            dropWeapon();
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

    public void dropWeapon(){
    System.out.println(enemyName + enemyWeapon + " drops" + enemyWeapon);
    }
}
