import java.util.Scanner;

public class UserInterface {
//private Adventure adventure;
    Adventure adventure = new Adventure();
boolean gameIsRunning = true;
Room room;
    public UserInterface() {
        adventure = new Adventure();
    }
    public void userOptionsForDirections(){
        System.out.println("Write 'go north' to go north");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go east' to go east");
        System.out.println("Write 'Look' to go look around");
        System.out.println("Write 'start game' to go start game");
    }

    public void processUserInput () {
        while (gameIsRunning) {
            Scanner scanner = new Scanner(System.in);
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
                    System.out.println("Going West");
                    adventure.currentRoom.getWest();
                    break;
                case "go south":
                    if (adventure.currentRoom.getSouth() != null) {
                        adventure.currentRoom = adventure.currentRoom.getSouth();
                        System.out.println("going south");
                    }
                    break;
                case "go east":
                    System.out.println("Going East");
                    adventure.currentRoom.getEast();
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
}