public class AdventureController {
    //Attributes
    private Map gameMap;
    private Player gamePlayer;

    //Constructor
    public AdventureController() {
        gameMap = new Map();
        gamePlayer = new Player(gameMap.getFirstRoom());
    }

    //Getters bliver lavet her
    public Player getGamePlayer() {
        return gamePlayer;
    }

    public Map getGameMap() {
        return gameMap;
    }

    public String look() {
        return gamePlayer.look();
    }

    //LAV EN ATTACK METODE DER FORBINDER ENEMY OG PLAYER
    public void attackSequence(String enemyName){
        if (gamePlayer.getCurrentWeapon() == null) {
            System.out.println("You need to equip a weapon first to attack");
        } else if (gamePlayer.getCurrentWeapon().canUse()) {
            //Brug 1 use af våben
            getGamePlayer().getCurrentWeapon().setRemainingUses(getGamePlayer().getCurrentWeapon().getRemainingUses()-1);
            //sæt damage som spilleren inflicter
            getGamePlayer().setPlayerDamageDone(gamePlayer.getCurrentWeapon().getDamagePerAttack());
            //Modstanderen tager skade
            getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName).enemyHit(getGamePlayer().getPlayerDamageDone());
            System.out.println("You attack the enemy for " + getGamePlayer().getPlayerDamageDone() + " damage!");
            //Hvis modstanderen er død:
            if (getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName).enemyDied()){
                //Her skal removeEnemy bruges til at fjerne enemy fra rummet
                System.out.println("Well done!!!");
                //Hvis ikke modstanderen er død:
            } else {
                //Spiller tager skade baseret på modstanderens våbens skade
                System.out.println("The enemy fights back!");
                getGamePlayer().playerHit(getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName).getEnemyWeaponDamage());
                System.out.println("Ouch! You're hit and down to " + getGamePlayer().getPlayerHealth() + " HP!");
                //Hvis spilleren er død:
                if (getGamePlayer().playerDied()){
                    System.out.println("You died and lost the game");
                    //Hvis ikke spilleren er død
                } else {
                    System.out.println("You have now attacked, choose your next action");
                }
            }

        }


    }

}