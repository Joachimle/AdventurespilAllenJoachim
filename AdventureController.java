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

    public String look() {
        return gamePlayer.look();
    }



    //LAV EN ATTACK METODE DER FORBINDER ENEMY OG PLAYER
    public void attackSequence(String enemyName){
        Enemy currentEnemy = getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName);
        Room currentRoom = gamePlayer.getCurrentRoom();
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
            if (currentEnemy.getEnemyHealthPoints() <= 0){
                getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName).enemyDied();
                currentRoom.addItemToCurrentRoom(currentEnemy.getEnemyWeapon());
                currentRoom.removeEnemy(currentEnemy);
                System.out.println(enemyName +" have been defeated");
                //Her skal removeEnemy bruges til at fjerne enemy fra rummet
                //getGamePlayer().getCurrentRoom().removeEnemy(enemyName);
                System.out.println("Well done!!!");
                //getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName).
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