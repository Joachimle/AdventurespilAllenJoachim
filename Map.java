public class Map {
    //Attributes
    private Room firstRoom;

    //Constructor
    public Map() {
        createMap();
    }

    //Methods
    public void createMap() {
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


        //ROOM 1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItemToCurrentRoom(new Food("wine", " a bottle of red wine", -15));
        room1.addItemToCurrentRoom(new MeleeWeapon("knife", " The sharpest hunting knife", 15));

        //ROOM 2
        room2.setWest(room1);
        room2.setEast(room3);
        room2.addItemToCurrentRoom(new Food("energy bar", " A proteing bar with strawberryflavour",70));
        room2.addItemToCurrentRoom(new Food("pie", "Apple pie", 20));

        //ROOM 3
        room3.setWest(room2);
        room3.setSouth(room6);
        room3.addItemToCurrentRoom(new Food("cookie", "chockolate cookie", 10));
        room3.addItemToCurrentRoom(new Food("sausage", " juicy sausage", 40));
        room2.addItemToCurrentRoom(new RangedWeapon("rifle", " laser rifle", 50, 15));

        //ROOM 4
        room4.setNorth(room1);
        room4.setSouth(room7);
        room4.addItemToCurrentRoom(new Food("chocolatemilk", "Supreme Chocolate milk", 15));
        room4.addItemToCurrentRoom(new Food("pancakes", " Fluffy American pancakes ", -10));

        //ROOM 5
        room5.setSouth(room8);
        room4.addItemToCurrentRoom(new RangedWeapon("crossbow", " Hunting crossbow ", 30, 10));

        //ROOM 6
        room6.setNorth(room3);
        room6.setSouth(room9);
        room6.addItemToCurrentRoom((new Food("bread", "Nutritious brown bred with butter ", 20)));
        room6.addItemToCurrentRoom((new Food("chicken", "Raw chicken", -15)));

        //ROOM 7
        room7.setNorth(room4);
        room7.setEast(room8);
        room7.addItemToCurrentRoom(new Food("burger", " Beef burger with bbq ", 25));
        room7.addItemToCurrentRoom(new Food("water", " Cold fresh mountain water", 5));
        room1.addItemToCurrentRoom(new MeleeWeapon("greataxe", " Two faced greataxe", 15));

        //ROOM 8
        room8.setWest(room7);
        room8.setNorth(room5);
        room8.setEast(room9);
        room8.addItemToCurrentRoom(new Food("energyDrink", " RedBull energy drink", 10));
        room8.addItemToCurrentRoom(new Food("cheese", " Cheese with black spots", -5));

        //ROOM 9
        room9.setWest(room8);
        room9.setNorth(room6);
        room9.addItemToCurrentRoom(new Food("bananas", " A hand of sweet bananas", 10));
        room9.addItemToCurrentRoom(new Food("pizza", "Neapolitan Pizza ", 30));
        room4.addItemToCurrentRoom(new RangedWeapon("blowgun", " Hunting blow gun with 20 darts ", 20, 10));
    }

    public Room getFirstRoom() {
        return firstRoom;
    }
}
