public class Map {
    //Attributes
    private Room firstRoom;
    private Item item;

    //Constructor
    public Map() {
        createRoom();
    }


    //Methods
    public void createRoom() {
        Room room1 = new Room("Dragekammeret", "Lysende lavastrømme gløder om æggene under himlen af skæl og flamme, mens drager hviler i dvale.");
        Room room2 = new Room("Alvekongens Salon", "Krystallignende blomster blomstrer over svajende trætoppe, mens elvere danser mellem lysende støvpartikler.");
        Room room3 = new Room("Skytårnets Bibliotek", " Skyerne omslutter svævende bøger, mens stjernehimmel-arkiver og himmelblå reoler strækker sig mod uendeligheden af viden.");
        Room room4 = new Room("Troldmandens Laboratorium", "Boblende kedler og glimtende eliksirer omgiver en hvirvlende portal, hvor magiens pulserende hjerte skaber et kalejdoskopisk skuespil.");
        Room room5 = new Room("Undervands Paladset", "Perlemorskoraller danner en labyrint omkring svævende slotte, hvor havets folk samles mellem tangskove og skinnende krystalgrotter");
        Room room6 = new Room("Skovens Hjerte", "Solens stråler filtrerer gennem løvtagets grene og kaster gyldne strejf over mosdækkede stier og levende træers hvisken.");
        Room room7 = new Room("Hobbithjemmet", "Hyggelige huse gemmer sig blandt farverige blomsterenge og duftende køkkenhaver, hvor lyset danser på skæve stenterrasser.");
        Room room8 = new Room("Dæmonisk Domstol", "Lavafloder omgiver en ruineret domstol, hvor dæmoniske væsner holder hof og udfælder skæbnesvangre domme under en flammende himmel.");
        Room room9 = new Room("Englernes Have", "En skyfri himmel bader engle i gyldent lys, mens blomsterbede stråler i alskens farver og en bæk risler mellem ædle sten.");
        firstRoom = room1;


        //Rooms skal være forbundet til hinanden som på billedet
        //Room 1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItemToCurrentRoom();


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

    //items i rooms


    public Room getFirstRoom() {
        return firstRoom;
    }
}
