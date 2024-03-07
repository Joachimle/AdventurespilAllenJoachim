import java.util.ArrayList;

public class Player {

    //Attributes
    private Room currentRoom;
    private Player player;
    private ArrayList<Item> inventory;


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
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;
    }

    public void move(String direction) {

        switch (direction) {

            case "go north":
                if (currentRoom.getNorth() != null) {
                    System.out.println("please write a direction");
                    currentRoom = currentRoom.getNorth();
                    System.out.println("Going North");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go west":
                if (currentRoom.getWest() != null) {
                    System.out.println("please write a direction");
                    currentRoom = currentRoom.getWest();
                    System.out.println("Going west");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go south":
                if (currentRoom.getSouth() != null) {
                    System.out.println("please write a direction");
                    currentRoom = currentRoom.getSouth();
                    System.out.println("going south");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go east":
                if (currentRoom.getEast() != null) {
                    System.out.println("please write a direction");
                    currentRoom = currentRoom.getEast();
                    System.out.println("Going East");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            default:
                System.out.println(" Invalid direction. Try another one");


        }
    }
}

