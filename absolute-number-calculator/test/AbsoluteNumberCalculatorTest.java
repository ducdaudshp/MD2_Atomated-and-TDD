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

    @Test
    void testFindAbsolute1(){
        int number = 1;
        int expect = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect,result);
    }

    @Test
    void testFindAbsoluteNegative(){
        int number = -1;
        int expect = 1;
        int result = AbsoluteNumberCalculator.findAbsolute(number);
        assertEquals(expect,result);
    }
}