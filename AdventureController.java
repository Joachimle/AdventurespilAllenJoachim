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
            if (getGamePlayer().getCurrentRoom().searchForEnemiesInCurrentRoom(enemyName).enemyDied()){

            }

        }


    }

}