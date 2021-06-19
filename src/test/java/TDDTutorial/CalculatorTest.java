package TDDTutorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void givenEmptyString_WhenCalculateSum_ThenReturn0(){
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.getSum("");
        assertEquals(0, result);
    }

    @Test
    public void givenAStringWith1Number_WhenCalculateSum_ThenReturnIt(){
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.getSum("5");
        assertEquals(5, result);
    }

    @Test
    public void givenAStringWith2Numbers_WhenCalculateSum_ThenReturnSum(){
        CalculatorService calculatorService = new CalculatorService();
        int result = calculatorService.getSum("69");
        assertEquals(15, result);
    }

}
