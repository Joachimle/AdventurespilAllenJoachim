import java.util.Scanner;

public class UserInterface {
    //Attributes
    boolean gameIsRunning = true;
    Scanner scanner;
    AdventureController controller;

    //Constructor
    public UserInterface() {
        //Player-object
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        controller = new AdventureController();
    }

    //Methods
    public void startGame() {
        String command;
        System.out.println("Welcome");
        userOptionsForDirections();
        while (gameIsRunning) {
            command = scanner.next().toLowerCase();
            switch (command) {

                //her er playerobjektet tilføjet fra player-klassen
                //case 1 - look around.
                case "go north", "n" ->{;
                    controller.moveNorth("go north");
                }
                case "go west", "w" ->{
                    controller.moveWest("go west");
                }
                case "go south", "s" -> {
                    controller.moveSouth("go south");
                }
                case "go east", "e" -> {
                    controller.moveEast("go east");
                }
                case "exit" -> {
                    System.exit(0);
                }
                case "help", "h" -> {
                    System.out.println("please write a new direction");
                }
                case "look", "l" -> {
                    System.out.println(controller.look());
                    System.out.println("please write a direction");
                }
                case "inventory", "inv", "i" -> {
                    if (controller.getGamePlayer().showInventory().isEmpty()) {
                        System.out.println("Is empty");
                    } else
                    controller.getGamePlayer().showInventory();
                }
                default -> System.out.println("Your input is invalid");
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