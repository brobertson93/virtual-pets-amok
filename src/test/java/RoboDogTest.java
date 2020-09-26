import PetShelter.RoboDog;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;
public class RoboDogTest {

    RoboDog underTest = new RoboDog("Frank", 10,25,25,false);

    @Test
    public void shouldBeAbleToBeOiled() {
        underTest.oil();
        assertEquals(underTest.getOilLevel(), 35);
        assertEquals(underTest.getHappiness(),27);
    }
    @Test
    public void shouldBeAbleToBeWalked() {
        underTest.goOnWalk();
        assertEquals(underTest.getHappiness(),40);
        assertEquals(underTest.getOilLevel(),10);
    }

    @Test
    public void shouldBeAbleToBePlayedWith(){
        underTest.playWithAnimals();
        assertEquals(underTest.getOilLevel(),20);
        assertEquals(underTest.getHappiness(),40);
    }
}
