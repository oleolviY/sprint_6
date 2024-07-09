package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class FelineTest {

    Feline feline = new Feline();

    @Test
    public void getEatTest() throws Exception {
        List<String> expectedEat = List.of("Животные", "Птицы", "Рыба");
        List<String> actualEat = feline.eatMeat();
        Assert.assertEquals(expectedEat, actualEat);
    }
    @Test
    public void getFamilyTest() {
        String expectedFamily = "Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

    @Test
    public void getKittensTest() {
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals(expectedKittens, actualKittens);
    }
    @Test
    public void getKittens1Test() {
        int expectedKittens = 2;
        int actualKittens = feline.getKittens(2);
        Assert.assertEquals(expectedKittens, actualKittens);
    }
}
