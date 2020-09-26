
import PetShelter.Dog;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DogTest {
    Dog underTest = new Dog("Test", 100,100, 100, 100, 0, true);

    @Test
    public void shouldBeAbleToFeed() {
        underTest.feed();
        assertEquals(underTest.getHunger(),107);
        assertEquals(underTest.getThirst(),97);
        assertEquals(underTest.getHappiness(), 102);
        assertEquals(underTest.getSoilLevel(), 5);

    }

    @Test
    public void shouldBeAbleToDrink() {
        underTest.drink();

        assertEquals(underTest.getHunger(),98);
        assertEquals(underTest.getThirst(),110);
        assertEquals(underTest.getSoilLevel(),2);

    }
    @Test
    public void shouldTickAllAttributes(){
        underTest.tick();


        assertEquals(underTest.getHunger(), 95);
        assertEquals(underTest.getThirst(), 97);
        assertEquals(underTest.getHappiness(),96);
        assertEquals(underTest.getSoilLevel(),2);


    }
    @Test
    public void shouldBeGoingOnAWalk (){
        underTest.walk();
    }

    @Test
    public void shouldHaveCagesCleaned() {
        underTest.cleanCages();
        assertEquals(underTest.getSoilLevel(), 0);
    }
@Test
    public void testsHealthLevelOfDogAndModifiesIt() {
    underTest.editHealth();
    assertEquals(underTest.getHealth(),103);
    Dog underTest2 = new Dog("John",10,-1,-2,5,0,true);
    underTest2.editHealth();
    assertEquals(underTest2.getHealth(),6);
}

}
