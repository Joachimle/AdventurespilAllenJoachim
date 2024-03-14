import java.util.ArrayList;

public class Player {

    //Attributes
    public Map map;
    private Room currentRoom;
    private Player player;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int health = 100;


    //CONSTRUCTOR
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();
        this.health = health;
    }


    public Integer playerDied() {
        if (health < 0) {
            System.out.println("you died");
            System.exit(0);
        }
        return null;
    }

    public int getPlayerHealth() {
        return  health;
    }

    public void setPlayerHealth(int newHealth) {
        if(newHealth <= 0) { // health range er sat fra 0-100
            playerDied();
        } else if (newHealth > 100){

        } else {
            health = newHealth;
        }
    }

    public void takeItemAndAddToInventory(String itemName) {
        Item item = currentRoom.searhForItemsInCurrentRoom(itemName);
        if (item != null) {
            currentRoom.removeItem(item);
            addItem(item);
            System.out.println("you took the: " + item.getShortName() + ".");
        } else {
            System.out.println("no item with the name : " + itemName + " exists.");
        }
    }

    public Item findItemFromInventory(String shortName) {
        for (Item i : inventory) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }

    //removes item from inventory
    public void dropItemInCurrentRoom(String shortName) {
        System.out.println("Writhe the name of the item you want to drop");
        Item item = findItemFromInventory(shortName);
        if (item != null) {
            removeItem(item);
            currentRoom.addItemToCurrentRoom(item);
            System.out.println("the item " + item + " has been removed");
        } else {
            System.out.println("no item in inventory with the name :" + item + ".");
        }

    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }


    public void addItem(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }


    public Room getCurrentRoom() {
        return currentRoom;
    }

    public void setCurrentRoom(Room currentRoom) {
        this.currentRoom = currentRoom;
    }

    public String look() {
        StringBuilder roomInfo = new StringBuilder();
        roomInfo.append("You are in: ").append(currentRoom.getRoomName());
        roomInfo.append("\n").append(currentRoom.getRoomDiscription());
        roomInfo.append("\n");
        roomInfo.append("You find the following items in the room: ");
        roomInfo.append("\n").append(currentRoom.itemsInCurrentRoom());
        return roomInfo.toString();
    }

    //Overført fra "Adventure del 2 review" PDF slide 15
    public boolean move(String direction){
        Room desiredRoom = switch (direction){
            case "north", "n" -> currentRoom.getNorth();
            case "south", "s" -> currentRoom.getSouth();
            case "east", "e" -> currentRoom.getEast();
            case "west", "w" -> currentRoom.getWest();
            default -> null;
        };

        if(desiredRoom != null){
          currentRoom = desiredRoom;
          return true;
        }
        else {
            return false;
        }
    }
}

