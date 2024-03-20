import java.util.ArrayList;

public class Player {

    //Attributes
    private Room currentRoom;
    private ArrayList<Item> inventory = new ArrayList<>();
    private int playerHealth = 0;
    private Weapon currentWeapon;
    private int playerDamageDone;

    //CONSTRUCTOR
    public Player(Room currentRoom) {
        this.currentRoom = currentRoom;
        this.inventory = new ArrayList<>();
        setPlayerHealth(100);
    }

    //Simple methods including getters and setters
    public int getPlayerHealth() {
        return playerHealth;
    }

    public Weapon getCurrentWeapon() {
        return currentWeapon;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public ArrayList<Item> getInventory() {
        return inventory;
    }

    public int getPlayerDamageDone() {
        return playerDamageDone;
    }

    public void setPlayerDamageDone(int playerDamageDone) {
        this.playerDamageDone = playerDamageDone;
    }

    public void setPlayerHealth(int changeInHealth) {
        playerHealth += changeInHealth;
        if(playerHealth <= 0) { // health range er sat fra 0-100
            playerDied();
        } else if (playerHealth > 100){
            playerHealth = 100;
        }
    }
    public void setCurrentWeapon(Weapon weapon){
        this.currentWeapon = weapon;
    }

    public void addItemToInventory(Item item) {
        inventory.add(item);
    }

    public void removeItem(Item item) {
        inventory.remove(item);
    }

    public Item findItemFromInventoryOrCurrentRoom(String shortName) {
        for (Item i : inventory) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        for (Item i : currentRoom.itemsInCurrentRoom()) {
            if (i.getShortName().equals(shortName)) {
                return i;
            }
        }
        return null;
    }
    public Item findItemFromInventory(String shortName){
        for (Item i : inventory){
            if (i.getShortName().equals(shortName)){
                return i;
            }
        }
        return null;
    }
    public void playerDied() {
        if (playerHealth <= 0) {
            System.out.println("you died");
            System.exit(0);
        }
    }
    public void playerHit(int damageTaken){
        playerHealth -= damageTaken;
        if (playerHealth <= 0) {
            playerDied();
        }
    }

    //Methods for commands in UI
    public void eatFoodOrItem(String shortName) {
        Item item = findItemFromInventoryOrCurrentRoom(shortName);
        if (item == null) {
            System.out.println("you found nothing to eat");
        } else if (item instanceof Food food) {
            removeItem(item);
            setPlayerHealth(food.getHealthPoints());
            if (playerHealth == 100){
                System.out.println("You consumed " + item);
                System.out.println("You're at full HP");
            } else {
                System.out.println("You consumed" + item + " and gained " + food.getHealthPoints() + " HP");
            }
        } else System.out.println(item + " is not edible");
    }

    public void equipWeapon(String shortName){
        Item itemToEquip = findItemFromInventory(shortName);
        if (itemToEquip == null){
            System.out.println(shortName + " is not in your inventory");
        } else if (itemToEquip instanceof Weapon) {
            setCurrentWeapon((Weapon) itemToEquip);
        } else {
            System.out.println(shortName + " is not a weapon!");
        }
    }
    public void playerAttack(String enemyName) {
        if (getCurrentWeapon().canUse()){
            getCurrentWeapon().setRemainingUses(currentWeapon.getRemainingUses()-1);
            setPlayerDamageDone(getCurrentWeapon().getDamagePerAttack());
        } else {
            System.out.println("You can't use your current weapon");
        }
    }

    public void takeItemAndAddToInventory(String itemName) {
        Item item = currentRoom.searchForItemsInCurrentRoom(itemName);
        if (item != null) {
            currentRoom.removeItem(item);
            addItemToInventory(item);
            System.out.println("you took the: " + item.getShortName() + ".");
        } else {
            System.out.println("no item with the name : " + itemName + " exists.");
        }
    }

    //removes item from inventory
    public void dropItemInCurrentRoom(String shortName) {
        System.out.println("Write the name of the item you want to drop");
        Item item = findItemFromInventoryOrCurrentRoom(shortName);
        if (item != null) {
            removeItem(item);
            currentRoom.addItemToCurrentRoom(item);
            System.out.println("the item " + item + " has been removed");
        } else {
            System.out.println("no item in inventory with the name :" + shortName + ".");
        }

    }

    public String look() {
        StringBuilder roomInfo = new StringBuilder();
        roomInfo.append("You are in: ").append(currentRoom.getRoomName());
        roomInfo.append("\n").append(currentRoom.getRoomDescription());
        roomInfo.append("\n");
        roomInfo.append("You find the following items in the room: ");
        roomInfo.append("\n").append(currentRoom.itemsInCurrentRoom());
        return roomInfo.toString();
    }

    //Overført fra "Adventure del 2 review" PDF slide 15
    public boolean move(String direction){
        Room desiredRoom = switch (direction){
            case "north" -> currentRoom.getNorth();
            case "south" -> currentRoom.getSouth();
            case "east" -> currentRoom.getEast();
            case "west" -> currentRoom.getWest();
            default -> null;
        };

        if(desiredRoom != null){
          currentRoom = desiredRoom;
          return true;
        }
        else {
            return false;
        }
    }
}

