import PetShelter.Cat;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;




public class CatTest {



    Cat underTest = new Cat("Test", 100,100 , 100 , 100 , true);

    @Test
    public void shouldBeAbleToFeed() {
        underTest.feed();
        assertEquals(underTest.getHunger(),105);
        assertEquals(underTest.getThirst(),97);
        assertEquals(underTest.getHappiness(), 102);
        assertEquals(underTest.getSoilLevel(), 3);
        underTest.setSoilLevel(0);
    }

    @Test
    public void shouldBeAbleToDrink() {
        underTest.drink();

        assertEquals(underTest.getHunger(),95);
        assertEquals(underTest.getThirst(),110);
        assertEquals(underTest.getSoilLevel(),1);
        underTest.setSoilLevel(0);
    }

    @Test
    public void shouldBeOneLitterBox(){
        Cat underTest2 = new Cat("Test2", 25, 100, 100, 100, true);

        underTest.feed();
        underTest2.feed();

        assertEquals(underTest.getSoilLevel(),6);
        underTest.setSoilLevel(0);
        }
    @Test
    public void shouldTickAllAttributes(){
        underTest.tick();


        assertEquals(underTest.getHunger(), 98);
        assertEquals(underTest.getThirst(), 97);
        assertEquals(underTest.getHappiness(),95);
        assertEquals(underTest.getSoilLevel(),2);
        underTest.setSoilLevel(0);

    }
    @Test
    public void shouldClearLitterbox(){
        underTest.cleanLitterbox();
        assertEquals(underTest.getSoilLevel(), 0);

    }
@Test
    public void checksThePetsHealthAndModifiesIt(){
        underTest.editHealth();
        assertEquals(underTest.getHealth(),103);
        Cat underTest2 = new Cat("John",10,-1,-2,5,true);
        underTest2.editHealth();
        assertEquals(underTest2.getHealth(),6);

    }

    @Test
    public void checkPlayWithAnimals() {
        underTest.playWithAnimals();
        assertEquals(underTest.getHunger(),98);
        assertEquals(underTest.getThirst(),96);
        assertEquals(underTest.getSoilLevel(),2);
        assertEquals(underTest.getHappiness(),110);
    }
}
