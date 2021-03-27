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

}
