import java.util.ArrayList;

public class Player {

    //Attributes
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int playerHealth = 0;


    //CONSTRUCTOR
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();
        setPlayerHealth(100);
    }


    public void playerDied() {
        if (playerHealth < 0) {
            System.out.println("you died");
            System.exit(0);
        }
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int changeInHealth) {
        playerHealth += changeInHealth;
        if(playerHealth <= 0) { // health range er sat fra 0-100
            playerDied();
        } else if (playerHealth > 100){
            playerHealth = 100;
        }
    }
    public void eatFoodOrItem(String shortName) {
        Item item = findItemFromInventoryOrCurrentRoom(shortName);
        if (item == null) {
            System.out.println("you found nothing to eat");
        } else if (item instanceof Food food) {
            removeItem(item);
            //playerHealth += food.getHealthPoints();
            setPlayerHealth(food.getHealthPoints());
            System.out.println("you gained " + food.getHealthPoints() + " HP");
        } else System.out.println(item + " is not edible");
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
            System.out.println("no item in inventory with the name :" + shortName + ".");
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
            case "north" -> currentRoom.getNorth();
            case "south" -> currentRoom.getSouth();
            case "east" -> currentRoom.getEast();
            case "west" -> currentRoom.getWest();
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

