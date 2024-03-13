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

    public Player(int health) {
        if(health < 0 || health > 100) {
            throw new IllegalArgumentException();
        } else {
            this.health = health;
        }
    }

    public int getPlayerHealth() {
        return health;
    }

    public void setPlayerHealth(int newHealth) {
        if(newHealth < 0 || newHealth > 100) {
            throw new IllegalArgumentException();
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

    public void move(String direction) {

        switch (direction) {

            case "go north":
                if (currentRoom.getNorth() != null) {
                    currentRoom = currentRoom.getNorth();
                    System.out.println("Going North");
                    System.out.println("Please write a new direction if you wanna leave the room");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go west":
                if (currentRoom.getWest() != null) {
                    currentRoom = currentRoom.getWest();
                    System.out.println("Going west");
                    System.out.println("Please write a new direction if you wanna leave the room");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go south":
                if (currentRoom.getSouth() != null) {
                    currentRoom = currentRoom.getSouth();
                    System.out.println("Going south");
                    System.out.println("Please write a new direction if you wanna leave the room");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go east":
                if (currentRoom.getEast() != null) {
                    currentRoom = currentRoom.getEast();
                    System.out.println("Going East");
                    System.out.println("Please write a new direction if you wanna leave the room");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            default:
                System.out.println(" Invalid direction. Try another one");
        }
    }
}

