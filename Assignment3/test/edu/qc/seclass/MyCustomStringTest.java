package edu.qc.seclass;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class MyCustomStringTest
{

    private MyCustomStringInterface mycustomstring;

    @Before
    public void setUp()
    {
        mycustomstring = new MyCustomString();
    }

    @After
    public void tearDown()
    {
        mycustomstring = null;
    }

    @Test
    public void rigTest()
    {
        mycustomstring.setString("33 66 44");
        assertEquals(3, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers1()
    {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals(7, mycustomstring.countNumbers());
    }

    @Test(expected = NullPointerException.class)
    //Inspect the string to print out null when the exception point to null
    public void testCountNumbers2()
    {
        mycustomstring.setString(null);
        mycustomstring.countNumbers();
    }

    @Test
    // Inspect the test count number output the four digits
    public void testCountNumbers3()
    {
        mycustomstring.setString("Verify if 123 567 32 9 are four digits");
        assertEquals(4, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers4()
    {
        //Inspect the test count number 2
        mycustomstring.setString("Verify that  11 45 generated");
        assertEquals(2, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers5()
    {
        //Inspect if program recognizes a null string
        mycustomstring.setString("");
        assertEquals(0, mycustomstring.countNumbers());
    }

    @Test
    public void testCountNumbers6()
    {
        // Inspect to see there is no digit in the string
        mycustomstring.setString("No digit here.");
        assertEquals(0, mycustomstring.countNumbers());
    }


    @Test
    public void test2()
    {
        //Just testing to see if it works
        mycustomstring.setString("12345");
        assertEquals("24", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, false));
    }


    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd1()
    {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("d33p md1  i51,it", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, false));
    }



    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd2()
    {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("'bt t0 6snh r6rh", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }


    @Test(expected = NullPointerException.class)
    //Inspect the string to print out  this will work a null string
    public void testGetEveryNthCharacterFromBeginningOrEnd3()
    {
        mycustomstring.setString(null);
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, true);
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEn4()
    {
        // Inspect the string to print out an empty string
        mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(5, false));
    }


    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd5()
    {
        // checking to if the start or the end from works.
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        assertEquals("' 3trptsm 11si hs5rn,rgt", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }



   @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd6() {
        // Inspect or check the given string to print out the length of the string 8
        mycustomstring.setString("Rigsang");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(8, false));
    }

    @Test (expected = IllegalArgumentException.class)
    //check the string to print out exception when n is greater than zero
    public void testGetEveryNthCharacterFromBeginningOrEnd7() {
        mycustomstring.setString("Testing");
        mycustomstring.getEveryNthCharacterFromBeginningOrEnd(0, false);
    }

        @Test
        //Inspect the string to print out whatever we asked to output in backward
        public void testGetEveryNthCharacterFromBeginningOrEnd8() {
            mycustomstring.setString("Rigsang");
            assertEquals("Rigsang", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, true));
        }

        @Test
        // Inspect the string to print out whatever we asked to output in order
        public void testGetEveryNthCharacterFromBeginningOrEnd9() {
            mycustomstring.setString("My name is Rigsang");
            assertEquals("My name is Rigsang", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(1, false));
        }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd10() {
        //Inspect the string to give the all numbers that goes by 2
        mycustomstring.setString(" 1 2 3 4 5 6 7 8 9 ");
        assertEquals("2468", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(4, false));
    }

    @Test
    //Inspect the string  to see if we get all multiples of two
    public void testGetEveryNthCharacterFromBeginningOrEnd11() {
        mycustomstring.setString("123456789");
        assertEquals("2468", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    //Inspect the string in position
    public void testGetEveryNthCharacterFromBeginningOrEnd12() {
        mycustomstring.setString("Testing");
        assertEquals("ei", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(3, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd13() {
        // Inspect the string that there is extra space or blank string
        mycustomstring.setString("");
        assertEquals("", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testGetEveryNthCharacterFromBeginningOrEnd14() {
        // Inspect the string that there the all string
        mycustomstring.setString("P1l1l1");
        assertEquals("Pll", mycustomstring.getEveryNthCharacterFromBeginningOrEnd(2, true));
    }

    @Test
    public void testConvertDigitsToNamesInSubstring1() {
        mycustomstring.setString("I'd b3tt3r put s0me d161ts in this 5tr1n6, right?");
        mycustomstring.convertDigitsToNamesInSubstring(17, 23);
        assertEquals("I'd b3tt3r put sZerome dOneSix1ts in this 5tr1n6, right?", mycustomstring.getString());
    }

    @Test (expected = IllegalArgumentException.class)
    // Inspect the final position is less than beginning position
    public void testConvertDigitsToNamesInSubstring2() {
        mycustomstring.setString("Is start greater than end?");
        mycustomstring.convertDigitsToNamesInSubstring(1, 0);
    }

    @Test (expected = MyIndexOutOfBoundsException.class)
    //Inspect the final position is grater than beginning position and throw out of bound
    public void testConvertDigitsToNamesInSubstring3() {
        mycustomstring.setString("Can end be greater than length of the string?");
        mycustomstring.convertDigitsToNamesInSubstring(1, 200);
    }

    @Test (expected = MyIndexOutOfBoundsException.class)
    // Inspect to see if the beginning position is less than 0
    public void testConvertDigitsToNamesInSubstring4() {
        mycustomstring.setString("Check to see if less than ?");
        mycustomstring.convertDigitsToNamesInSubstring(-2, 30);
    }

    @Test (expected = NullPointerException.class)
    // Inspect to see if the is null
    public void testConvertDigitsToNamesInSubstring5() {
        mycustomstring.setString(null);
        mycustomstring.convertDigitsToNamesInSubstring(3, 5);
    }

    @Test
    public void testConvertDigitsToNamesInSubstring6() {
        // Inspect to see if the digits at the end will be converted
        mycustomstring.setString("its 5 rigsanges n domase to havent Tie4r");
        mycustomstring.convertDigitsToNamesInSubstring(35, 40);
        assertEquals("its 5 rigsanges n domase to havent TieFourr", mycustomstring.getString());
    }

    @Test
    public void testConvertDigitsToNamesInSubstring7() {
        // Inspect to see if the output is correct when we're going through the whole string to translate digits
        mycustomstring.setString("456345");
        mycustomstring.convertDigitsToNamesInSubstring(2, 5);
        assertEquals("4FiveSixThreeFour5", mycustomstring.getString());
    }
    @Test
    public void testConvertDigitsToNamesInSubstring8() {
        // Inspect to see if the output is correct when we're going through the whole string to translate digits for requested position
        mycustomstring.setString("416");
        mycustomstring.convertDigitsToNamesInSubstring(2, 3);
        assertEquals("4OneSix", mycustomstring.getString());
    }

}



