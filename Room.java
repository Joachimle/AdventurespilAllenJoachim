import java.util.ArrayList;

public class Room {
    //attributes
    private String roomName;
    private String roomDescription;
    private Room north, east, west, south;
    private ArrayList<Item> itemList = new ArrayList<>();
    private ArrayList<Enemy> enemyList = new ArrayList<>();

    //Constructor
    public Room(String roomName, String roomDescription) {
        this.roomDescription = roomDescription;
        this.roomName = roomName;
    }

    //Methods
    public void addItemToCurrentRoom(Item item) {
        itemList.add(item);
    }

    public Item searchForItemsInCurrentRoom(String shortName) {
        for (Item i : itemList) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }
    //Removes/deletes item from current room
    public void removeItem(Item item) {
        itemList.remove(item);
    }

    public ArrayList<Item> itemsInCurrentRoom() {
        return itemList;
    }

    //Enemy-methods
    public void addEnemyToCurrentRoom(Enemy enemyName){
        enemyList.add(enemyName);
    }
    public Enemy searchForEnemiesInCurrentRoom(String enemyName) {
        for (Enemy enemy : enemyList) {
            if (enemy.getEnemyName().equals(enemyName)) {
                return enemy;
            }
        }
        return null;
    }
    //Removes/deletes item from current room
    public void removeEnemy(Enemy enemy) {
        enemyList.remove(enemy);
    }

    public ArrayList<Enemy> enemiesInCurrentRoom() {
        return enemyList;
    }

    // Getter & setter Methods
    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
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
