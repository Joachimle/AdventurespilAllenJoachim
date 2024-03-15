import java.util.ArrayList;

public class Player {

    //Attributes
    public Map map;
    private Room currentRoom;
    private Player player;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int playerHealth = 100;


    //CONSTRUCTOR
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();
        this.playerHealth = playerHealth;
    }


    public Integer playerDied() {
        if (playerHealth < 0) {
            System.out.println("you died");
            System.exit(0);
        }
        return null;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int newHealth) {
        if(newHealth <= 0) { // health range er sat fra 0-100
            playerDied();
        } else if (newHealth > 100){

        } else {
            playerHealth = newHealth;
        }
    }
    public void eatFoodOrItem(String shortName) {
        Item item = findItemFromInventoryOrCurrentRoom(shortName);
        if (item == null) {
            System.out.println("you found nothing to eat");
        } else if (item instanceof Food food) {
            removeItem(item);
            playerHealth += food.getHealthPoints();
            System.out.println("you gained " + food.getHealthPoints());
        } else System.out.println(item + " Not eatable");
    }

    public void takeItemAndAddToInventory(String itemName) {
        Item item = currentRoom.searchForItemsInCurrentRoom(itemName);
        if (item != null) {
            currentRoom.removeItem(item);
            addItemToInventory(item);
            System.out.println("you took the: " + item.getShortName() + ".");
        } else {
            System.out.println("no item with the name : " + itemName + " exists.");
        }
    }

    public Item findItemFromInventoryOrCurrentRoom(String shortName) {
        for (Item i : inventory) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        for (Item i : currentRoom.itemsInCurrentRoom()) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }

    //removes item from inventory
    public void dropItemInCurrentRoom(String shortName) {
        System.out.println("Write the name of the item you want to drop");
        Item item = findItemFromInventoryOrCurrentRoom(shortName);
        if (item != null) {
            removeItem(item);
            currentRoom.addItemToCurrentRoom(item);
            System.out.println("the item " + item + " has been removed");
        } else {
            System.out.println("no item in inventory with the name :" + item + ".");
        }

    }

    public void addItemToInventory(Item item) {
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
        roomInfo.append("\n").append(currentRoom.getRoomDescription());
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

