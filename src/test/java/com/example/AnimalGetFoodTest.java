package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalGetFoodTest {
    private Animal animal;
    private final String animalKind;
    private final List<String> expected;

    public AnimalGetFoodTest (String animalKind, List<String> expected){
        this.animalKind = animalKind;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]
                {
                        {"Травоядное", List.of("Трава", "Различные растения")},
                        {"Хищник", List.of("Животные", "Птицы", "Рыба")}
                };
    }
    @Test
    public void animalGetFoodTest() throws Exception{
        animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        assertEquals(expected, actual);
    }
}