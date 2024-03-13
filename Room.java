import java.util.ArrayList;

public class Room {
    //attributes
    private String roomName;
    private String roomDiscription;
    private Room north, east, west, south;
    private ArrayList<Item> itemList = new ArrayList<>();

    //Constructor
    public Room(String roomName, String roomDiscription) {
        this.roomDiscription = roomDiscription;
        this.roomName = roomName;
    }
    // Metoder

    public void addItemToCurrentRoom(Item item) {
        itemList.add(item);
    }

    public Item lookForItemsInCurrentRoom(String shortName) {
        for (Item i : itemList) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }

    public void deleteItemFromCurrentRoom(String shortName) {
        Item item = lookForItemsInCurrentRoom(shortName);
        itemList.remove(item);
        }
    public Item searhForItemsInCurrentRoom(String shortName) {
        for (Item i : itemList) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }
    public void removeItem(Item item) {
        itemList.remove(item);
    }
    public ArrayList<Item> itemsInCurrentRoom() {
        return itemList;
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
