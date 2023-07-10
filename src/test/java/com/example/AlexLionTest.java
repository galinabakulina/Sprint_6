package com.example;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import java.util.List;

import static org.junit.Assert.*;

public class AlexLionTest {

    @Mock
    private Feline feline;
    private AlexLion alex;

    @Before
    public void setUp() throws Exception {
        alex = new AlexLion(feline);
    }

    @Test
    public void getKittens() {
        int expected = 0;
        int actual = alex.getKittens();
        assertEquals(expected, actual);
    }

    @Test
    public void getFriends() {
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        List<String> actual = alex.getFriends();
        assertEquals(expected, actual);
    }

    @Test
    public void getPlaceOfLiving() {
        String expected = "Нью-Йорк";
        String actual = alex.getPlaceOfLiving();
        assertEquals(expected, actual);
    }
}