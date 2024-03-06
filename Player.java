public class Player {
    // kalder map klassen ind
    Map map = new Map();

    //Player objekt
    private Player move, look;

    Map currentRoom;

    public String look() {
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;
    }

    //public String move() {
      //  String move = (currentRoom.getRoomName() +


    //CONSTRUCTOR
    public Player() {

    }

    public void createPlayer() {
        Player player1 = new Player();
    }


    //public void move( String direction){
    //    Player room1 = currentRoom.ge
    //}

    // public void Player(Room startingRoom) {
    //this.currentRoom = startingRoom;
}


//  public String move() {
//     String move = (character.g)
//   }

