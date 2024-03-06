import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AdventureController startGame = new AdventureController();
        System.out.println("Welcome");
        startGame.userInterface.processUserInput();
    }
}
