public class Food extends Item { // den klasse er en subklasse af Item.mItem contructor er derfor kaldt ind med dens egenskaber.

    //Attributer
    private int healthPoints;

    //contructor
    public Food(String shortName,String longName, String healthpoints){
super(shortName, longName); // kalder item kontruktor ind
        this.healthPoints = Integer.parseInt(healthpoints); // burger parseint fordi healthPoins kan blive sat til et negativ tal.
    }
    //Food objekter

    Food mango = new Food(" Mango", " juicy & revitalising", "10");
    Food burger= new Food(" Burger", " Delicious beef burger", "50");
    Food potatoChips = new Food(" PotatoChips", " toxic crispy chips", "-10");


    //getter metod
    public int getHealthPoints(){
        return healthPoints;
    }
}
