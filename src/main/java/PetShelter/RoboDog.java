package PetShelter;

public class RoboDog extends InorganicPets {


    private int isWalking;

    public RoboDog(String name, int health, int oilLevel, int happiness, boolean isAlive) {
        super(name, health, oilLevel,happiness,isAlive);

    }

    @Override
    public void oil() {
        oilLevel = oilLevel + 12;
        happiness = happiness - 4;
    }


    public void goOnWalk() {
        happiness = happiness + 15;
        oilLevel = oilLevel - 15;
    }

    @Override
    public void editHealth() {
        if(oilLevel < 0) {
            int healthLevel = getHealth() - 2;
            setHealth(healthLevel);
        }
        else if(oilLevel > 25) {
            int heathLevel = getHealth() + 1;
            setHealth(heathLevel);
        }

        else if (happiness < 0) {
            int healthLevel = getHealth() -2;
            setHealth(healthLevel);
        }
        else if(happiness > 25) {
            int heathLevel = getHealth() + 1;
            setHealth(heathLevel);
        }

    }

    @Override
    public void tick() {
        oilLevel = oilLevel - 2;
        happiness = happiness - 3;
    }
}
