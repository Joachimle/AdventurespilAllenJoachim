public class Player {
    //Attributes
    private Player move, look;
    public Map map;

    //CONSTRUCTOR
    public Player() {
        map = new Map();
    }

    //look-method
    public String look() {
        String look = (map.getCurrentRoom().getRoomName() + map.getCurrentRoom().getRoomDiscription());
        return look;
    }

}

/*
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
                            if (player.map.currentRoom.getWest() != null) {
        System.out.println("please write a direction");
player.map.currentRoom = player.map.currentRoom.getWest();
                        System.out.println("Going North");
                    } else {
                            System.out.println("You can't go this way");
                    }
                            break;
                            case "go south":
                            if (player.map.currentRoom.getSouth() != null) {
        System.out.println("please write a direction");
player.map.currentRoom = player.map.currentRoom.getSouth();
                        System.out.println("going south");
                    } else {
                            System.out.println("You can't go this way");
                    }
                            break;
                            case "go east":
                            if (player.map.currentRoom.getEast() != null) {
        System.out.println("please write a direction");
player.map.currentRoom = player.map.currentRoom.getEast();
                        System.out.println("Going East");
                    } else {
                            System.out.println("You can't go this way");
                    }
                            break;