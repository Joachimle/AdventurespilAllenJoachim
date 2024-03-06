import java.util.Scanner;

public class UserInterface {
    //Attributes
    boolean gameIsRunning = true;

    //Map-object
    Map adventure = new Map();
    //player-object
    Player player = new Player();

    //Constructor
    public UserInterface() {
        adventure = new Map();
    }

    //Methods
    public void startGame() {
        while (gameIsRunning) {
            Scanner scanner = new Scanner(System.in);
            scanner.useDelimiter("\n");
            String command;
            command = scanner.next().toLowerCase();

            switch (command) {
                case "go north":
                    if (adventure.currentRoom.getNorth() != null) {
                        adventure.currentRoom = adventure.currentRoom.getNorth();
                        System.out.println("Going North");
                    }
                    break;
                case "go west":
                    if (adventure.currentRoom.getWest() != null) {
                        adventure.currentRoom = adventure.currentRoom.getWest();
                        System.out.println("Going North");
                    }
                    break;
                case "go south":
                    if (adventure.currentRoom.getSouth() != null) {
                        adventure.currentRoom = adventure.currentRoom.getSouth();
                        System.out.println("going south");
                    }
                    break;
                case "go east":
                    if (adventure.currentRoom.getEast() != null) {
                        adventure.currentRoom = adventure.currentRoom.getEast();
                        System.out.println("Going East");
                    }
                    break;
                case "exit":
                    System.exit(0);
                    break;
                case "help":
                    System.out.println("***Under construction***");
                    break;
                case "look":
                    System.out.println(player.look());
                    break;
                default:
                    System.out.println("You cannot go that way, try again");
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