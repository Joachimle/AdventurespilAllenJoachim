public class Adventure {

    Room currentRoom = new Room("'THIS IS ROOM 1'",
            "You find yourself in a dimly lit tavern, \n" +
                    "the air thick with the scent of ale and wood smoke. \n" +
                    "The room is cozy, yet worn, with rough-hewn wooden beams overhead.");

    public void Adventure() {
    }
    public String look () {
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;
    }
}

