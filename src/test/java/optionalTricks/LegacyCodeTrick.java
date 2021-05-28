package optionalTricks;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class LegacyCodeTrick {

    @Test
    public void test(){
        assertEquals("It's empty", doThing());
        assertEquals("It's empty", doThingWithTrick());
    }

    private String doThingWithTrick() {
        return Optional.ofNullable(getResult()).orElse("It's empty");
    }

    private String doThing() {
        String result = getResult();
        if (result == null)
            return "It's empty";
        else
            return result;
    }

    private String getResult() {
        return null;
    }
}
