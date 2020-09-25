package PetShelter;

public class RoboCat extends InorganicPets {
    public RoboCat(String name, int health, int happiness, int oilLevel, boolean isAlive) {
        super(name, health, happiness, oilLevel, isAlive);
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

        if (happiness < 0) {
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

    @Override
    public void oil() {
        oilLevel = oilLevel + 15;
        happiness = happiness - 5;
    }
}
