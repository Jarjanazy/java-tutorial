package optionalTricks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StaticValueTest {

    @Test
    public void staticValueTest(){
        assertEquals("It's empty", getString());
        assertEquals("It's empty", getStringWithTrick());
    }

    private String getStringWithTrick() {
        return Optional.ofNullable(getStringFromDB()).orElse("It's empty");
    }

    private String getString() {
        String result = getStringFromDB();
        if (result == null)
            return "It's empty";
        else
            return result;
    }

    private String getStringFromDB() {
        return null;
    }
}
