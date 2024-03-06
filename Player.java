public class Player {
    //Attributes
    private Room currentRoom;
    private Player move, look;

    //Map-object
    Map map = new Map();

    //CONSTRUCTOR
    public Player() {
    }

    //Methods
    public void createPlayer() {
        Player player1 = new Player();
    }

    public String look() {
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;
    }
}
