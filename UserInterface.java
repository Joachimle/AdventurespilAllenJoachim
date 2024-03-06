import java.util.Scanner;

public class UserInterface {
    //Attributes
    boolean gameIsRunning = true;
    Player player;
    Scanner scanner;

    //Constructor
    public UserInterface() {
        //Player-object
        player = new Player();
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
    }

    //Methods
    public void startGame() {
        String command;
        while (gameIsRunning) {
            command = scanner.next().toLowerCase();
            switch (command) {
                case "go north":
                    if (player.map.currentRoom.getNorth() != null) {
                        System.out.println("please write a direction");
                        player.map.currentRoom = player.map.currentRoom.getNorth();
                        System.out.println("Going North");
                    } else{
                        System.out.println("You can't go this way");
                    }
                    break;
                case "go west":
                    if (player.map.currentRoom.getWest() != null) {
                        System.out.println("please write a direction");
                        player.map.currentRoom = player.map.currentRoom.getWest();
                        System.out.println("Going North");
                    }else{
                        System.out.println("You can't go this way");
                    }
                    break;
                case "go south":
                    if (player.map.currentRoom.getSouth() != null) {
                        System.out.println("please write a direction");
                        player.map.currentRoom = player.map.currentRoom.getSouth();
                        System.out.println("going south");
                    }else{
                        System.out.println("You can't go this way");
                    }
                    break;
                case "go east":
                    if (player.map.currentRoom.getEast() != null) {
                        System.out.println("please write a direction");
                        player.map.currentRoom = player.map.currentRoom.getEast();
                        System.out.println("Going East");
                    }else{
                        System.out.println("You can't go this way");
                    }
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "help":
                    System.out.println("***Under construction***");
                    System.out.println("please write a direction");
                    break;
                case "look":
                    System.out.println(player.look());
                    System.out.println("please write a direction");
                    break;
                default:
                    System.out.println("Your input is invalid");
            }
        }
    }

    public void userOptionsForDirections() {
        System.out.println("Write 'go north' to go north");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go east' to go east");
        System.out.println("Write 'Look' to go look around");
    }

}