import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {

    public UserInterface() {

        System.out.println("Welcome to this magical journey");
        System.out.println("Write 'go north' to go north");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go east' to go east");
        System.out.println("Write 'Look' to go look around");
        //System.out.println("Write 'exit' to exit to the main menu");
        //System.out.println("Write 'help' to open the help menu");


        Scanner input = new Scanner(System.in);
        String userInput = input.nextLine();
        input.useDelimiter("\n");
        switch (userInput.toLowerCase()) {
            case "go north":
                System.out.println("Going North");
                break;
            case "go west":
                System.out.println("Going West");
                break;
            case "go south":
                System.out.println("Going South");
                break;
            case "go east":
                System.out.println("Going East");
                break;
            case "exit":
                System.exit(0);
                break;
            case "help":
                System.out.println("***Under construction***");
                break;
                case "look":
                System.out.println("***Under construction***");
                break;
            default:
                System.out.println("You cannot go that way, try again");
        }
    }
}