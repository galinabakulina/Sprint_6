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
public class LionTest {
    @Mock
    private Feline feline;
    private Lion lion;

    @Before
    public void setUp() throws Exception {
        lion = new Lion(feline, "Самец");
    }

    @Test
    public void getKittens() {
        Mockito.when(feline.getKittens()).thenReturn(42);
        int actual = lion.getKittens();
        int expected = 42;
        assertEquals(expected, actual);
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Зебра", "Газель"));
        List<String> actual = lion.getFood();
        List<String>  expected = List.of("Зебра", "Газель");
        assertEquals(expected, actual);
    }

    @Test (expected = Exception.class)
    public void invalidSex() throws Exception {
        lion = new Lion(feline, "Зайка");
    }
}