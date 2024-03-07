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
                case "go north":
                   controller.move("go north");
                    break;


                case "go west":
                    controller.move("go west");
                    break;


                case "go south":
                    controller.move("go south");
                    break;


                case "go east":
                    controller.move("go east");
                    break;


                case "exit":
                    System.exit(0);
                    break;

                case "help":
                    System.out.println("***Under construction***");
                    userOptionsForDirections();
                    System.out.println("please write a new direction");
                    break;

                case "look":
                    System.out.println(controller.look());
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