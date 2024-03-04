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

        String userInput = input.next();
        input.useDelimiter("\n");
        switch (userInput.toLowerCase()) {
            case "Go North":
                System.out.println("going North");
            break;
            case "go West":
                System.out.println("going west");
            break;
            case "Go South":
                System.out.println("Going south");
            break;
            case "Go east":
                System.out.println("Going East");
            break;
            default:
                System.out.println("Not available path");

        }
    }
}