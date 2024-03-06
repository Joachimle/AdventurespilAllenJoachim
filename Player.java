public class Player {

    //Attributes
    private Player move, look;

    public Map map;
    private Room currentRoom;

    //CONSTRUCTOR
    public Player() {
        map = new Map();
    }

    //look-method
    public String look() {
        String look = (map.getCurrentRoom().getRoomName() + map.getCurrentRoom().getRoomDiscription());
        return look;
    }

    //set room method
    public Room setCurrentroom(Room room){
        return currentRoom = room;}

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

/*
public void move(String direction) {

    switch (direction) {

        case "go north":
            if (player.map.currentRoom.getNorth() != null) {
                System.out.println("please write a direction");
                player.map.currentRoom = player.map.currentRoom.getNorth();
                System.out.println("Going North");
            } else {
                System.out.println("You can't go this way");
            }
            break;


        case "go west":
            if (this.map.currentRoom.getWest() != null) {
                System.out.println("please write a direction");
                player.map.currentRoom = player.map.currentRoom.getWest();
                System.out.println("Going North");
            } else {
                System.out.println("You can't go this way");
            }
            break;


        case "go south":
            if (this.map.currentRoom.getSouth() != null) {
                System.out.println("please write a direction");
                player.map.currentRoom = player.map.currentRoom.getSouth();
                System.out.println("going south");
            } else {
                System.out.println("You can't go this way");
            }
            break;


        case "go east":
            if (this.map.currentRoom.getEast() != null) {
                System.out.println("please write a direction");
                player.map.currentRoom = player.map.currentRoom.getEast();
                System.out.println("Going East");
            } else {
                System.out.println("You can't go this way");
            }
            break;

        default:
            System.out.println(" Invalid direction. Try another one");
    }
}
public Map getCurrentroom(){
    return currentRoom;
}
*/