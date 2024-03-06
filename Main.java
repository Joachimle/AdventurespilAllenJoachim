import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdventureController startGame = new AdventureController();
        System.out.println("Welcome");
        startGame.processUserInput().processUserInput();
        startGame.processUserInput();



        //malthes gamle noter.
       /* while (true) {
            Scanner input = new Scanner(System.in);
            String userInput = input.next();
            input.useDelimiter("\n");
            boolean result = startGame.processUserInput(userInput);
            if (result) {
                //user input OK.
            } else {
                //User input not OK; retry
            }
            startGame.userOptionsForDirections();
        }*/
    }
}
