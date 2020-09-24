package PetShelter;

import java.util.Map;

public abstract class  Pets  {
    protected String name;
    protected int happiness;
    protected int health;
    protected boolean isAlive;



    public Pets(String name, int health, int happiness, boolean isAlive) {
        this.name = name;
        this.happiness = happiness;
        this.isAlive = isAlive;
        this.health = health;
    }
    public abstract void editHealth();

    public abstract void tick();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

}





