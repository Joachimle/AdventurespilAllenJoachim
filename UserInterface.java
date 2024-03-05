public class UserInterface {
private Adventure adventure;
    public UserInterface() {
        adventure = new Adventure();
    }
    public void userOptionsForDirections(){
        System.out.println("Write 'go north' to go north");
        System.out.println("Write 'go west' to go west");
        System.out.println("Write 'go south' to go south");
        System.out.println("Write 'go east' to go east");
        System.out.println("Write 'Look' to go look around");
    }
    public boolean processUserInput (String input) {
        switch (input.toLowerCase()) {
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
                System.out.println(adventure.look());
                break;
            default:
                System.out.println("You cannot go that way, try again");
                return false;
        }
        return true;
    }
}