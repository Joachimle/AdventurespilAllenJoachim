import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("Welcome to this magical journey");
        System.out.println("Write 'go north' to go north");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go east' to go east");

        Scanner input = new Scanner(System.in);
        //Scanne-objekt.

        String userInput = input.nextLine();
        input.useDelimiter("\n");
        switch (userInput.toLowerCase()) {
            case "go north":
                System.out.println("going North");
            break;
            case  "go west":
                System.out.println("going west");
            break;
            case "go south":
                System.out.println("Going south");
            break;
            case "go east":
                System.out.println("Going East");
            break;
            default:
                System.out.println("You cannot go that way");

        }
    }
}