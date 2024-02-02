package app.textRevers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntDivisionTest {

    @Test
    void divisionByZero(){
        assertEquals("Divisor cannot be 0, division by zero", IntDivision.divide(145,0));
    }

    @Test
    void zeroDividend(){
        assertEquals("0/5=0", IntDivision.divide(0,5));
    }

    @Test
    void zeroDividendAndDivisor(){
        assertEquals("Divisor cannot be 0, division by zero", IntDivision.divide(0,0));
    }

    @Test
    void dividendGreaterThanDivisor(){
        assertEquals("5/145=0", IntDivision.divide(5,145));
    }

    @Test
    void dividendLessThanZero(){
        String answer="""
                _145356|3435
                 13740 |--
                 ----- |42
                  _7956
                   6870
                   ----
                   1086
                   """;
        assertEquals(answer,IntDivision.divide(-145356,-3435));
    }
}