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
        System.out.println("*********************************");
        System.out.println("*                               *");
        System.out.println("*      Alice in Portalland      *");
        System.out.println("*                               *");
        System.out.println("*********************************\n");
        userStartMenu();

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
                case "eat", "drink" -> {
                    controller.getGamePlayer().eatFoodOrItem(commandParameter);
                    System.out.println();
                }
                case "attack" -> {
                    controller.attackSequence(commandParameter);
                    System.out.println("Remaining attacks " + controller.getGamePlayer().getCurrentWeapon().getRemainingUses());
                }
                case "equip" -> {
                        controller.getGamePlayer().equipWeapon(commandParameter);
                        System.out.println("You equipped " + controller.getGamePlayer().getCurrentWeapon());
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
                    System.out.println("Exiting the game");
                    System.exit(0);
                }
                case "help", "h" -> {
                    System.out.println("You have the following options:");
                    userHelp();
                }
                case "look", "l" -> {
                    System.out.println("You look around you and see: ");
                    System.out.println(controller.look());
                }
                case "health", "hp" -> {
                    System.out.println("You currently have " + controller.getGamePlayer().getPlayerHealth() + " HP");
                    System.out.println("To increase your HP, try to eat or drink something");
                }
                case "inventory", "inv", "i" -> {
                    if (controller.getGamePlayer().getInventory().isEmpty()) {
                        System.out.println("Your inventory is empty");
                    } else {
                        System.out.println(controller.getGamePlayer().getInventory());
                        System.out.println("Equipped weapon: " + controller.getGamePlayer().getCurrentWeapon());
                    }
                }

                default -> System.out.println("Your input is invalid - try writing something else");
            }
        }
    }

    public void userStartMenu() {
        System.out.println("You're running through the garden, when you suddenly trip on a small rock.");
        System.out.println("You tumble down a rabbit-hole and somehow also a glistening portal");
        System.out.println("You land on your feet and see multiple other portals - thinking to yourself 'What is this freaky place?'.\n");
        System.out.println("Please choose your next action:");
        System.out.println("Write 'Go north' to go north");
        System.out.println("Write 'Go west' to go west");
        System.out.println("Write 'Go south' to go south");
        System.out.println("Write 'Go east' to go east");
        System.out.println("Write 'Look' to go look around you");
        System.out.println("Write 'Help' to ask for help");
    }
    public void userHelp(){
        System.out.println("Write 'Look' to go look around you");
        System.out.println("Write 'Go' followed by a direction to move");
        System.out.println("Write 'Take' followed by the name of an item to put it in your inventory");
        System.out.println("Write 'Inventory' to look up your inventory");
        System.out.println("Write 'Eat' or 'drink' followed by the name of a food or drink in your inventory you'd like to consume");
        System.out.println("Write 'Health' to see your current health points");
        System.out.println("Write 'Equip' followed by the name of a weapon to equip the weapon");
        System.out.println("Write 'Attack' followed by the name of an enemy to attack the enemy");
        System.out.println("Write 'Exit' to leave the game");
    }

    //Split-method bruges til at dele kommandoen til switch-casen op i to dele -
    // - så spilleren f.eks. kan skrive "take example" for at tilgå "take" i switch og derefter videresende "example" til take-metoden i Player
    public String processUserInput(String command){
        String[] userInputArray = command.split(" ");
        if ((userInputArray[0].equals("eat") || userInputArray[0].equals("drink") || userInputArray[0].equals("drop") || userInputArray[0].equals("take") || userInputArray[0].equals("equip") || userInputArray[0].equals("attack")) && userInputArray.length > 1){
            commandParameter = userInputArray[1];
            return userInputArray[0];
        }
        return command;
    }
}