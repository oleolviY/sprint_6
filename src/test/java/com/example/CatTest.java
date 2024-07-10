package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    Feline feline;
    private String expectedSound;
    private String actualSound;

    @Test
    public void getSoundTest(){
        Cat cat = new Cat(feline);
        expectedSound ="Мяу";
        actualSound = cat.getSound();
        Assert.assertEquals(expectedSound, actualSound);
    }

    @Test
    public void predatorTest() {
        Cat cat = new Cat(feline);
        Assert.assertEquals(feline, cat.predator);
    }

    @Test
    public void getFoodTest() throws Exception {
        feline = new Feline();
        Cat cat = new Cat(feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = cat.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

}
