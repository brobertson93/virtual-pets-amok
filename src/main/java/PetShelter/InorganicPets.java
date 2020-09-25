package PetShelter;

public abstract  class InorganicPets extends Pets {



    protected int oilLevel;

    public InorganicPets(String name, int health,  int happiness, int oilLevel, boolean isAlive) {
        super(name, health, happiness, false);
        this.oilLevel = oilLevel;

    }

    public abstract void oil();


    public int getOilLevel() {
        return oilLevel;
    }

    public void setOilLevel(int oilLevel) {
        this.oilLevel = oilLevel;
    }
}
