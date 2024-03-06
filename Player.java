public class Player {
    //Attributes
    private Player move, look;
    public Map map;

    //CONSTRUCTOR
    public Player() {
        map = new Map();
    }

    //look-method
    public String look() {
        String look = (map.getCurrentRoom().getRoomName() + map.getCurrentRoom().getRoomDiscription());
        return look;
    }

}
