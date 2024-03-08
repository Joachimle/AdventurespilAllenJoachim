import java.util.ArrayList;

public class Player {

    //Attributes
    public Map map;
    private Room currentRoom;
    private Player player;
    private ArrayList<Item> inventory = new ArrayList<>();


    //CONSTRUCTOR
    public Player(Room room) {
        currentRoom = room;
    }

    //METODER
//Finds item in inventory
    public Item findItemFromInventory(String shortName) {
        for (Item i : inventory) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }

    //removes item from inventory
    public void removeItemFromInventory(String shortName) {
        Item item = findItemFromInventory(shortName);
        inventory.remove(item);
    }

    public void addToInventory(Item item) {
        inventory.add(item);
    }

    public String look() {
        String look = (currentRoom.getRoomName() + "\n"
                + currentRoom.getRoomDiscription() +"\n"
                + currentRoom.lookForItemsInCurrentRoom("knife"));
        return look;
    }

    public ArrayList<Item> showInventory() {
        return inventory;
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

