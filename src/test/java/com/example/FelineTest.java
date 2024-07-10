package com.example;

import org.junit.Assert;
import org.junit.Test;
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
