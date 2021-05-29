package optionalTricks;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicValueTest {

    @Test
    public void dynamicValueTest(){
        assertEquals("hmm It's empty", getString());
    }

    @Test
    public void dynamicValueWithTrickTest(){
        assertEquals("hmm It's empty", getStringWithTrick());
    }

    private String getStringWithTrick() {
        return Optional.ofNullable(getStringFromDB()).orElseGet(this::doCalculation);
    }

    private String getString() {
        String result = getStringFromDB();
        if (result == null)
            return doCalculation();
        else
            return result;
    }

    private String doCalculation() {
        // do business things
        return "hmm It's empty";

    }

    private String getStringFromDB() {
        return null;
    }

}
