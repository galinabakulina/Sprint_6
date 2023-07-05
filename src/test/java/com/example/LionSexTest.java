package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;
@RunWith(Parameterized.class)
public class LionSexTest {
    @Mock
    private Feline feline;
    private final String sex;
    private final boolean expected;

    public LionSexTest(String sex, boolean expectedHasMane){
        this.sex = sex;
        this.expected = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {{"Самка", false}, {"Самец", true}};
    }

    @Test
    public void lionSexTest() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
