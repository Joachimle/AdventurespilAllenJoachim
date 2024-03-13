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

    public void moveNorth(String goNorth) {
        gamePlayer.move("go north");
    }
    public void moveWest(String goWest) {
        gamePlayer.move("go west");
    }
    public void moveEast(String goEast) {
        gamePlayer.move("go east");
    }
    public void moveSouth(String goSouth) {
        gamePlayer.move("go south");
    }

    public void showPlayerInventory () {
        gamePlayer.getInventory();
    }

    public String look() {
       return gamePlayer.look();
    }

    public void testMove(String scannerDirection) {
        gamePlayer.testMove(scannerDirection.toLowerCase());
    }
    //Methods


}