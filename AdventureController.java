public class AdventureController {
    //opret et enkelt room-objekt i Adventure. Lad det være currentRoom, som spilleren befinder sig i. Udskriv navn og beskrivelse når spilleren skriver "look".
    Room currentRoom;

    public AdventureController() {
        createRoom();
    }

    public String look() {
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;
    }
    public String look() {
        String look = (currentRoom.getRoomName() + currentRoom.getRoomDiscription());
        return look;

    }
}
