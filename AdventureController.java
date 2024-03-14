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

    //Setters bliver lavet her:
    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }

    public void setGamePlayer(Player gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void showPlayerInventory () {
        gamePlayer.getInventory();
    }

    public String look() {
       return gamePlayer.look();
    }

    public void ctrlMove(String scannerDirection) {
        gamePlayer.move(scannerDirection.toLowerCase());
    }
    //Methods


}