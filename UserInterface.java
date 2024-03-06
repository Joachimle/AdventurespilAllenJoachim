import java.util.Scanner;

public class UserInterface {
AdventureController adventure = new AdventureController();
boolean gameIsRunning = true;
    public void processUserInput () {
        while (gameIsRunning) {
            Scanner scanner = new Scanner(System.in);
            //scanner.useDelimiter("\n");
            String command;
            command = scanner.nextLine().toLowerCase();

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
                    System.out.println(adventure.look());
                    break;
                default:
                    System.out.println("You cannot go that way, try again");
            }
        }
    }
    public void userOptionsForDirections(){
        System.out.println("Write 'go north' to go north");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go east' to go east");
        System.out.println("Write 'Look' to go look around");
    }
    public UserInterface() {
        adventure = new AdventureController();
    }
}