import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsoluteNumberCalculatorTest {
    @Test
    void testFindAbsolute(){
        int number = 0;
        int expect = 0;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect,result);
    }

}