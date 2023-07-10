package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    private Feline feline;
    private Cat cat;

    @Before
    public void setUp(){
        cat = new Cat(feline);
    }

    @Test
    public void getSoundTest() {
        String expected = "Мяу";
        String actual = cat.getSound();
        assertEquals(expected, actual);
    }

    @Test
    public void getFoodTest() throws Exception {
        List<String> expected = List.of("Вискас", "Китикет - корм энергичных кошек");
        Mockito.when(feline.eatMeat()).thenReturn(expected);
        List<String> actual = cat.getFood();
        assertEquals(expected, actual);

    }
}