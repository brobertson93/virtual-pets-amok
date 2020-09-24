package PetShelter;

public class Dog extends OrganicPets {




    private int soilLevel;


    public Dog(String name, int health, int hunger, int thirst, int happiness, int soilLevel, boolean isAlive) {
        super(name, health, hunger, thirst, happiness, isAlive);

      //  this.name = name;
      //  this.hunger = hunger;
        //this.thirst = thirst;
       // this.happiness = happiness;
        this.soilLevel = soilLevel;
     //   this.isAlive = isAlive;


    }



    public int getSoilLevel() {
        return soilLevel;
    }

    public void setSoilLevel(int soilLevel) {
        this.soilLevel = soilLevel;
    }


    public void feed() {
        hunger = hunger + 7;
        thirst = thirst - 3;
        happiness = happiness + 2;
        soilLevel = soilLevel + 5;
    }



    public void drink() {
        hunger = hunger - 2;
        thirst = thirst + 10;
        soilLevel = soilLevel + 2;
    }

    public void tick() {
        hunger = hunger - 2;
        thirst = thirst - 3;
        happiness = happiness - 4;
        soilLevel = soilLevel + 2;
    }

    public void walk() {
        hunger = hunger - 10;
        thirst = thirst -10;
        happiness = happiness + 25;
        soilLevel = 0;
    }

    @Override
    public void editHealth() {

    }
}
