import java.util.ArrayList;

public class Player {

    //Attributes
    public Map map;
    private Room currentRoom;
    private Player player;
    private ArrayList<Item> inventory;


    //CONSTRUCTOR
    public Player() {
        map = new Map();
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
        String look = (map.getCurrentRoom().getRoomName() + map.getCurrentRoom().getRoomDiscription());
        return look;
    }

    public void move(String direction) {

        switch (direction) {

            case "go north":
                if (this.map.currentRoom.getNorth() != null) {
                    System.out.println("please write a direction");
                    this.map.currentRoom = this.map.currentRoom.getNorth();
                    System.out.println("Going North");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go west":
                if (this.map.currentRoom.getWest() != null) {
                    System.out.println("please write a direction");
                    this.map.currentRoom = this.map.currentRoom.getWest();
                    System.out.println("Going west");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go south":
                if (this.map.currentRoom.getSouth() != null) {
                    System.out.println("please write a direction");
                    this.map.currentRoom = this.map.currentRoom.getSouth();
                    System.out.println("going south");
                } else {
                    System.out.println("You can't go this way");
                }
                break;


            case "go east":
                if (this.map.currentRoom.getEast() != null) {
                    System.out.println("please write a direction");
                    this.map.currentRoom = this.map.currentRoom.getEast();
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