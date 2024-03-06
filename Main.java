public class Main {
    public static void main(String[] args) {
        AdventureController UI = new AdventureController();
        System.out.println("Welcome");
        UI.getUserInterface().userOptionsForDirections();
        UI.getUserInterface().startGame();
        //hurrah
    }
}
