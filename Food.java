public class Food extends Item { // den klasse er en subklasse af Item.mItem contructor er derfor kaldt ind med dens egenskaber.

    //Attributer
    private int healthPoints;

    //contructor
    public Food(String shortName, String longName, int healthPoints) {
        super(shortName, longName); // kalder item konstruktor ind
        this.healthPoints = healthPoints; // bruger parseint fordi healthPoinst kan blive sat til et negativ tal.
    }
    //Food objekter

//    Food mango = new Food(" Mango", " juicy & revitalising", "10");
//    Food burger= new Food(" Burger", " Delicious beef burger", "50");
//    Food potatoChips = new Food(" PotatoChips", " toxic crispy chips", "-10");

    //getter metod
    public int getHealthPoints() {
        return healthPoints;
    }
}
