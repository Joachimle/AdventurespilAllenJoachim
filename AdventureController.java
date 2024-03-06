public class AdventureController {
    //Attributes
    private Map gameMap;
    private Player gamePlayer;
    private UserInterface userInterface;
    //UI-Object

    //Map-object

    //Constructor
    public AdventureController() {
        gameMap = new Map();
        gamePlayer = new Player();
        userInterface = new UserInterface();
    }
//Getters bliver lavet her
    public Player getGamePlayer() {
        return gamePlayer;
    }

    public Map getGameMap() {
        return gameMap;
    }
    public UserInterface getUserInterface (){
        return userInterface;
    }
//Setters bliver lavet her:
    public void setGameMap(Map gameMap) {
        this.gameMap = gameMap;
    }

    public void setGamePlayer(Player gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public void setUserInterface(UserInterface userInterface) {
        this.userInterface = userInterface;
    }
    //Methods


}