package com.example;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {
    private Animal animal;
    @Before
    public void setUp(){ animal = new Animal(); }

    @Test (expected = Exception.class)
    public void invalidAnimalKind() throws Exception {
        List<String> actual = animal.getFood("Всеядное");
    }
    @Test
    public void getFamily() {
        String expected = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actual = animal.getFamily();
        assertEquals(expected, actual);
    }
}