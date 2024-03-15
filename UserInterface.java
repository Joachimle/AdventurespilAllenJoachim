import java.util.Scanner;

public class UserInterface {
    //Attributes
    boolean gameIsRunning = true;
    Scanner scanner;
    AdventureController controller;
    String command;
    String commandParameter;

    //Constructor
    public UserInterface() {
        scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        controller = new AdventureController();
    }

   // Methods
    public void playGame(){
        System.out.println("Welcome");
        userOptionsForDirections();

        while (gameIsRunning) {
            command = "";
            commandParameter = "";
            command = processUserInput(scanner.next().toLowerCase());

            switch (command) {

                case "take", "t" ->{
                    String itemToTake = commandParameter;
                    controller.getGamePlayer().takeItemAndAddToInventory(itemToTake);
                }
                case "drop", "d" -> {
                    String itemToDrop = commandParameter;
                    controller.getGamePlayer().dropItemInCurrentRoom(itemToDrop);
                }
                case "go north", "north", "n" -> {
                    if (controller.getGamePlayer().move("north")){
                        System.out.println("Going north");
                    } else {
                        System.out.println("You can't go this way");
                    }
                }
                case "go south", "south", "s" -> {
                    if (controller.getGamePlayer().move("south")){
                        System.out.println("Going south");
                    } else {
                        System.out.println("You can't go this way");
                    }
                }
                case "go east", "east", "e" -> {
                    if (controller.getGamePlayer().move("east")){
                        System.out.println("Going east");
                    } else {
                        System.out.println("You can't go this way");
                    }
                }
                case "go west", "west", "w" -> {
                    if (controller.getGamePlayer().move("west")){
                        System.out.println("Going west");
                    } else {
                        System.out.println("You can't go this way");
                    }
                }
                case "exit" -> {
                    System.exit(0);
                }
                case "help", "h" -> {
                    System.out.println("Please write a direction if you wanna leave the room");
                }
                case "look", "l" -> {
                    System.out.println(controller.look());
                    System.out.println("Please write a direction if you wanna leave the room");
                }
                case "health", "hp" -> {
                    System.out.println(controller.getGamePlayer().getPlayerHealth());
                }
                case "inventory", "inv", "i" -> {
                    if (controller.getGamePlayer().getInventory().isEmpty()) {
                        System.out.println("Your inventory is empty");
                    } else
                        controller.getGamePlayer().getInventory();
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
        System.out.println("Write 'take' followed by the name of an item to take it");
        System.out.println("Write 'Look' to go look around");
        System.out.println("Write 'Help' to ask for help");
        System.out.println("Write 'Inventory' to look up your inventory");
    }

    public String processUserInput(String command){
        String[] userInputArray = command.split(" ");
        this.command = userInputArray[0];
        if (this.command.equals("eat")){
            commandParameter = userInputArray[1];
            return userInputArray[0];
        } else if (this.command.equals("drop")) {
            commandParameter = userInputArray[1];
            return userInputArray[0];
        } else if (this.command.equals("take")) {
            commandParameter = userInputArray[1];
            return userInputArray[0];
        }
        return command;
    }
}