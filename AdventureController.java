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
}