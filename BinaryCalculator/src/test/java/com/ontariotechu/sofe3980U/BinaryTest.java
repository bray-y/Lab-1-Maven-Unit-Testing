package com.ontariotechu.sofe3980U;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for Binary class.
 */
public class BinaryTest {

    @Test
    public void normalConstructor() {
        Binary binary = new Binary("1001001");
        assertEquals("1001001", binary.getValue());
    }

    @Test
    public void constructorWithInvalidDigits() {
        Binary binary = new Binary("1001001211");
        assertEquals("0", binary.getValue());
    }

    @Test
    public void constructorWithInvalidChars() {
        Binary binary = new Binary("1001001A");
        assertEquals("0", binary.getValue());
    }

    @Test
    public void constructorWithNegativeSign() {
        Binary binary = new Binary("-1001001");
        assertEquals("0", binary.getValue());
    }

    @Test
    public void constructorWithZeroTailing() {
        Binary binary = new Binary("00001001");
        assertEquals("1001", binary.getValue());
    }

    @Test
    public void constructorEmptyString() {
        Binary binary = new Binary("");
        assertEquals("0", binary.getValue());
    }

    @Test
    public void add() {
        Binary binary1 = new Binary("1000");
        Binary binary2 = new Binary("1111");
        Binary binary3 = Binary.add(binary1, binary2);
        assertEquals("10111", binary3.getValue());
    }

    @Test
    public void add2() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("11");
        Binary binary3 = Binary.add(binary1, binary2);
        assertEquals("1101", binary3.getValue());
    }

    @Test
    public void add3() {
        Binary binary1 = new Binary("11");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.add(binary1, binary2);
        assertEquals("1101", binary3.getValue());
    }

    @Test
    public void add4() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("1010");
        Binary binary3 = Binary.add(binary1, binary2);
        assertEquals("1010", binary3.getValue());
    }

    @Test
    public void add5() {
        Binary binary1 = new Binary("0");
        Binary binary2 = new Binary("0");
        Binary binary3 = Binary.add(binary1, binary2);
        assertEquals("0", binary3.getValue());
    }

    @Test
    public void testOr() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.or(binary1, binary2);
        assertEquals("1110", result.getValue());
    }

    @Test
    public void testAnd() {
        Binary binary1 = new Binary("1010");
        Binary binary2 = new Binary("1100");
        Binary result = Binary.and(binary1, binary2);
        assertEquals("1000", result.getValue());
    }

    @Test
    public void testMultiply() {
        Binary binary1 = new Binary("101");
        Binary binary2 = new Binary("11");
        Binary result = Binary.multiply(binary1, binary2);
        assertEquals("1111", result.getValue());
    }
}
