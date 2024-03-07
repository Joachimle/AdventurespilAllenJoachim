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

                //her er playerobjektet tilføjet fra player-klassen
                //case 1 - look around.
                case "go north":
                   player.move("go north");
                    break;


                case "go west":
                    player.move("go west");
                    break;


                case "go south":
                    player.move("go south");
                    break;


                case "go east":
                    player.move("go east");
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