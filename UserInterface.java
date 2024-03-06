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
                case "go direction":
                    //her skal playerobjektet tilføjes, når player-klassen er færdig.
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