package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineKittensCountTest {

    private Feline feline;
    private final int expected;
    private final int kittensCount;

    public FelineKittensCountTest(int expected, int kittensCount){
        this.expected = expected;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {{-1, -1}, {0, 0}, {1, 1}, {2, 2}, {3, 3}};
    }

    @Before
    public void setUp(){
        feline = new Feline();
    }

    @Test
    public void felineKittensCountTest() {
        int actual = feline.getKittens(kittensCount);
        assertEquals(expected, actual);
    }

}
