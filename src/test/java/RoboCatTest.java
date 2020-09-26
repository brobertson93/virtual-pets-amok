import PetShelter.RoboCat;
import PetShelter.RoboDog;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RoboCatTest {
    RoboCat underTest = new RoboCat("Frank", 10,25,25,false);

    @Test
    public void shouldBeAbleToBeOiled() {
        underTest.oil();
        assertEquals(underTest.getOilLevel(), 40);
        assertEquals(underTest.getHappiness(),20);
    }

    @Test
    public void shouldBeAbleToBePlayedWith(){
        underTest.playWithAnimals();
        assertEquals(underTest.getOilLevel(),20);
        assertEquals(underTest.getHappiness(),35);
    }

}


