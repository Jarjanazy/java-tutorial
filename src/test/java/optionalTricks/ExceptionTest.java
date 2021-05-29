package optionalTricks;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ExceptionTest {

    @Test
    public void exceptionTest(){
        assertThrows(Exception.class, () -> getString());
    }

    @Test
    public void exceptionWithTrickTest(){
        assertThrows(Exception.class, () -> getStringWithTrick());
    }

    private String getStringWithTrick() throws Exception{
        return Optional.ofNullable(getStringFromDB()).orElseThrow(Exception::new);
    }

    private String getString() throws Exception{
        String result = getStringFromDB();
        if (result == null)
            throw new Exception();
        else
            return result;
    }

    private String getStringFromDB() {
        return null;
    }
}
