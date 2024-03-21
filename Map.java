public class Map {
    //Attributes
    private Room firstRoom;

    //Constructor
    public Map() {
        createMap();
    }

    //Methods
    public void createMap() {

        Room room1 = new Room("Dragon Chamber", "Glowing streams of lava surrounds the eggs under a sky of scales and flame, while the dragons are resting in slumber.");

        Room room2 = new Room("Elf King's Parlor", "Crystal-like flowers bloom over swaying treetops, while elves dance among luminous dust particles.");

        Room room3 = new Room("Sky Tower's Library", "Clouds envelop floating books, while starry sky archives and sky-blue shelves stretch towards the infinity of knowledge.");

        Room room4 = new Room("Wizard's Laboratory", "Bubbling cauldrons and sparkling elixirs surround a swirling portal, where the pulsating heart of magic creates a kaleidoscopic spectacle.");

        Room room5 = new Room("Underwater Palace", "Mother-of-pearl corals forms a labyrinth around floating castles, where the sea's inhabitants gather among seaweed forests and shining crystal caves.");

        Room room6 = new Room("Heart of the Forest", "Sun rays filter through the branches of the canopy, casting golden streaks over moss-covered paths and whispering living trees.");

        Room room7 = new Room("Hobbit Home", "Cozy houses hide among colorful flower meadows and fragrant kitchen gardens, where light dances on crooked stone terraces.");

        Room room8 = new Room("Demonic Court", "Lava rivers surround a ruined courthouse, where demonic creatures hold court and pronounce fateful judgments under a flaming sky.");

        Room room9 = new Room("Garden of Angels", "A cloudless sky bathes angels in golden light, while flower beds shine in all colors and a brook murmurs between noble stones.");

        firstRoom = room1;
        //ROOM 1
        room1.setEast(room2);
        room1.setSouth(room4);
        room1.addItemToCurrentRoom(new Food("wine", " a bottle of red wine", -15));
        room1.addItemToCurrentRoom(new MeleeWeapon("knife", " The sharpest hunting knife", 15));
        room1.addEnemyToCurrentRoom(new Enemy("potatoes", "A great big sack of potatoes", 35, new MeleeWeapon("potatopeeler", "A truly fearsome potatopeeler", 15)));

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
