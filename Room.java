public class Room {
    //attributes
    private String roomName;
    private String roomDiscription;
    private Room north, east, west, south;  // room objekt

    //Constructor
    public Room(String roomName, String roomDiscription) {
        this.roomDiscription = roomDiscription;
        this.roomName = roomName;
    }
    // Getter & setter Methods
    public String getRoomName() {
        return roomName;
    }
    public String getRoomDiscription() {
        return roomDiscription;
    }
    public Room getSouth() {
        return south;
    }
    public Room getEast() {
        return east;
    }
    public Room getNorth() {
        return north;
    }
    public Room getWest() {
        return west;
    }
    public void setEast(Room east) {
        this.east = east;
    }
    public void setWest(Room west) {
        this.west = west;
    }
    public void setNorth(Room north) {
        this.north = north;
    }

    public void setSouth(Room south) {
        this.south = south;
    }
}


/*public String toString (){
    String direction = "";
    direction*/

