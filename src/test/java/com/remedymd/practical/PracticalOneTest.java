package com.remedymd.practical;

import org.junit.Assert;
import org.junit.Test;

public class PracticalOneTest {
    PracticalOne practicalOne;

    public PracticalOneTest() {
        //TODO: Instantiate your implementation
        practicalOne = null; //new PracticalOneImpl();
    }

    @Test
    public void reverseWordsInStringTest() {
        Assert.assertEquals("phil is name my Hello", practicalOne.reverseWordsInString("Hello my name is phil"));
        Assert.assertEquals("shins my kicking stop George,", practicalOne.reverseWordsInString("George, stop kicking my shins"));
        Assert.assertEquals("Strings-with-hyphens-are-still-one-word", practicalOne.reverseWordsInString("Strings-with-hyphens-are-still-one-word"));
        Assert.assertEquals("?  spaces  Two", practicalOne.reverseWordsInString("Two  spaces  ?"));
    }

    @Test
    public void doCalculationTest() {
        Assert.assertEquals(2, practicalOne.doCalculation("1+1"));
        Assert.assertEquals(4, practicalOne.doCalculation("1+1+1+1"));
        Assert.assertEquals(3, practicalOne.doCalculation("1+3-1"));
        Assert.assertEquals(2, practicalOne.doCalculation("1-1+2"));
        Assert.assertEquals(7, practicalOne.doCalculation("1-1+2+3+4+5-3-5-2+2-2+3"));
    }

    @Test
    public void isPalindromeTest() {
        Assert.assertEquals(true, practicalOne.isPalindrome("racecar"));
        Assert.assertEquals(true, practicalOne.isPalindrome("Hannah"));
        Assert.assertEquals(true, practicalOne.isPalindrome("Able was I ere I saw Elba"));
        Assert.assertEquals(false, practicalOne.isPalindrome("Kevin likes to climb rocks"));
        Assert.assertEquals(false, practicalOne.isPalindrome("Hannahash"));
    }
}
