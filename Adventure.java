public class Adventure {
    //opret et enkelt room-objekt i Adventure. Lad det være currentRoom, som spilleren befinder sig i. Udskriv navn og beskrivelse når spilleren skriver "look".
    Room currentRoom;

    public void Adventure() {
        createRoom();
    }

    public String look() {
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;
    }

    // Opret de otte andre room-objekter, med navne og beskrivelser, og forbind dem

    public void createRoom() {
        Room room1 = new Room("room1", "");
        Room room2 = new Room("room2", "");
        Room room3 = new Room("room3", "");
        Room room4 = new Room("room4", "");
        Room room5 = new Room("room5", "");
        Room room6 = new Room("room6", "");
        Room room7 = new Room("room7", "");
        Room room8 = new Room("room8", "");
        Room room9 = new Room("room9", "");
        currentRoom = room1;


        //Rooms skal være forbundet til hinanden som på billedet
        room1.setEast(room2);
        room1.setSouth(room4);
        room2.setWest(room1);
        room2.setEast(room3);
        room3.setWest(room2);
        room3.setSouth(room6);
        room4.setNorth(room1);
        room4.setSouth(room7);
        room5.setSouth(room8);
        room6.setNorth(room3);
        room6.setSouth(room9);
        room7.setNorth(room4);
        room7.setEast(room8);
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room9.setWest(room8);
        room9.setNorth(room6);
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }
}
