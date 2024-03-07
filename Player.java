public class Player {

    //Attributes
    private Room currentRoom;

    //CONSTRUCTOR
    public Player(Room room) {
        currentRoom = room;
    }

    //look-method
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