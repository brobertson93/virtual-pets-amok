package PetShelter;

public abstract class OrganicPets extends Pets {
    protected int hunger;
    protected int thirst;


    public OrganicPets(String name, int health, int hunger, int thirst, int happiness, boolean isAlive) {
        super(name, health, happiness, true);
        this.hunger = hunger;
        this.thirst = thirst;
        this.happiness = happiness;
        this.health = health;

    }

    public abstract void feed();

    public abstract void drink();

    public abstract void tick();

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
}



