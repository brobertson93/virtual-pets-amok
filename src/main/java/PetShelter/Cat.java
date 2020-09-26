package PetShelter;

public class Cat extends OrganicPets {

    //robot implements

    public static int soilLitterbox;

    public Cat(String name, int health, int hunger, int thirst, int happiness,  boolean isAlive) {
        super(name, health, hunger, thirst, happiness, isAlive);



    }





public void cleanLitterbox () {
        soilLitterbox = 0;
        happiness = happiness -2;
}
@Override
    public void tick() {
        hunger = hunger - 2;
        thirst = thirst - 3;
        happiness = happiness - 5;
        soilLitterbox = soilLitterbox + 2;

    }
    @Override
    public void feed() {

        hunger = hunger + 5;
        thirst = thirst - 3;
        happiness = happiness +2;
        soilLitterbox = soilLitterbox + 3;

    }

  //  @Override
    public void drink() {
        hunger = hunger - 5;
        thirst = thirst + 10;
        soilLitterbox = soilLitterbox + 1;
    }



    public int getSoilLevel() {
        return soilLitterbox;
    }

    public void setSoilLevel(int soilLevel) {
        soilLitterbox = soilLevel;
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

        if (soilLitterbox > 25) {
            int healthLevel = getHealth() - 4;
            setHealth(healthLevel);
            System.out.println("--------" + name + " cage is too dirty, it needs to be cleaned!!! --------");
        }
    }

    @Override
    public void playWithAnimals() {
        hunger = hunger - 2;
        thirst = thirst - 4;
        soilLitterbox = soilLitterbox + 2;
        happiness = happiness + 10;
    }
}



