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

    public void cleanCages() {
        hunger = hunger -4;
        thirst = thirst -2;
        happiness = happiness - 5;
        soilLevel = 0;
    }

    @Override
    public void editHealth() {

        if (hunger < 0) {
            int healthLevel = getHealth() - 2;
            System.out.println("--------" + name + " is feeling really hungry, please feed them!!! --------");

            setHealth(healthLevel);
        }
        else if (hunger > 25) {
            int healthLevel = getHealth() + 1;
            setHealth(healthLevel);
        }

        if (thirst < 0) {
            int healthLevel = getHealth() - 2;
            System.out.println("--------" + name + " is really thirsty, they need water! --------");

            setHealth(healthLevel);
        }
        else if (thirst > 25) {
            int healthLevel = getHealth() + 1;
            setHealth(healthLevel);
        }

        if (happiness < 0) {
            int healthLevel = getHealth() - 2;
            System.out.println("--------" + name + " is not very happy try taking them on a walk! --------");

            setHealth(healthLevel);
        }
        else if (happiness > 25) {
            int healthLevel = getHealth() + 1;
            setHealth(healthLevel);
        }

        if (soilLevel > 25) {
            int healthLevel = getHealth() - 4;
            setHealth(healthLevel);
            System.out.println("--------" + name + " cage is too dirty, it needs to be cleaned!!! --------");
        }

    }

    @Override
    public void playWithAnimals() {
        hunger = hunger - 2;
        thirst = thirst - 4;
        soilLevel = soilLevel - 2;
        happiness = happiness + 10;
    }
}
