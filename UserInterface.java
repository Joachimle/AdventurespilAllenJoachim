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

                case "5", "take item", "t" -> {
                    System.out.println("enter the name of the item you want to take");
                    String itemToTake = scanner.next();
                    controller.getGamePlayer().takeItemAndAddToInventory(itemToTake);
                }
                case "take" ->{
                    String itemToTake = commandParameter;
                    controller.getGamePlayer().takeItemAndAddToInventory(itemToTake);
                }
                case "6", "drop", "d" -> {
                    System.out.println("enter the name of the item you want to drop");
                    String itemToDrop = scanner.next();
                    controller.getGamePlayer().dropItemInCurrentRoom(itemToDrop);
                }
                case "move" -> {
                    System.out.println("Enter your desired direction");
                    if (controller.getGamePlayer().move(scanner.next())){
                        System.out.println("You go into another room");
                    } else {
                        System.out.println("You can't go this way");
                    }
                }
                case "go north" -> {
                    if (controller.getGamePlayer().move("north")){
                        System.out.println("Going north");
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
        System.out.println("Write5 to take an item");
        System.out.println("Write 'Look' to go look around");
        System.out.println("Write 'Help' to ask for help");
        System.out.println("Write Inventory' to look up your inventory");
    }

    public String processUserInput(String command){
        String[] userInputArray = command.split(" ");
        command = userInputArray[0];
        if (command.equals("eat")){
            commandParameter = userInputArray[1];
            return userInputArray[0];
        } else if (command.equals("drop")) {
            commandParameter = userInputArray[1];
            return userInputArray[0];
        } else if (command.equals("take")) {
            commandParameter = userInputArray[1];
            return userInputArray[0];
        }
        return command;
    }
}