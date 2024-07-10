package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    Lion lion;
    int expectedKittens;
    int actualKittens;
    List<String> expectedFood;
    List<String> actualFood;
    String sex = "Самка";

    @Mock
    Feline feline;
    @Before
    public void setup(){
        lion = new Lion(sex, feline);
    }

    @Test
    public void getKittensTest(){
        Mockito.when(feline.getKittens()).thenReturn(1);
        expectedKittens =1;
        actualKittens = lion.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }
    @Test
    public void getFoodTest() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        expectedFood = List.of("Животные", "Птицы", "Рыба");
        actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }
}
