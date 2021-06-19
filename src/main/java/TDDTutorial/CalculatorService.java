package TDDTutorial;

import java.util.Arrays;

public class CalculatorService {
    public int getSum(String s) {
        if (s.isEmpty())
            return 0;
        else if (s.length() == 1)
            return Integer.parseInt(s);
        else
            return getSumForMultipleNumbers(s);
    }

    private int getSumForMultipleNumbers(String s) {
        return Arrays.
                stream(s.split("")).
                mapToInt(Integer::parseInt).
                sum();
    }
}
