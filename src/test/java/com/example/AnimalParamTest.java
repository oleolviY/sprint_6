package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParamTest {

    private final String animalKind;
    private final List<String> food;
    @Parameterized.Parameters
    public static Object[][] data(){
        return  new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    public AnimalParamTest(String animalKind, List<String> food){
        this.animalKind = animalKind;
        this.food = food;
    }

    @Test
    public void checkFood() throws Exception {
        Animal animal = new Animal();
        Assert.assertEquals(food, animal.getFood(animalKind));
    }
}
