package lombokTutorial.withoutLombok;

import lombokTurorial.withoutLombok.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    void constructorTest(){
        Human human = new Human(22, "Mark", 25);
        assertEquals(22, human.getId());
        assertEquals("Mark", human.getName());
        assertEquals(25, human.getAgeInYears());
    }

    @Test
    void builderPatternTest(){
        Human human = new Human().
                id(1).
                name("Ahmed").
                ageInYears(20);

        assertEquals(1, human.getId());
        assertEquals("Ahmed", human.getName());
        assertEquals(20, human.getAgeInYears());
    }

    @Test
    void toStringTest(){
        Human human = new Human().
                id(2).
                name("Omar").
                ageInYears(30);

        assertEquals("Human(id=2, name=Omar, ageInYears=30)", human.toString());
    }
}
