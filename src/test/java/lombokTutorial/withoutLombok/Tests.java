package lombokTutorial.withoutLombok;

import lombokTurorial.withoutLombok.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    void builderPatternTest(){
        Human human = new Human(1).
                name("Ahmed").
                ageInYears(20);

        assertEquals(1, human.getId());
        assertEquals("Ahmed", human.getName());
        assertEquals(20, human.getAgeInYears());
    }

    @Test
    void toStringTest(){
        Human human = new Human(2).
                name("Omar").
                ageInYears(30);

        assertEquals("Id: 2, name: Omar, age in years: 30", human.toString());
    }

}
