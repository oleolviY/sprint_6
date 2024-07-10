package com.example;

import org.junit.Assert;
import org.junit.Test;


public class AnimalTest {
    private String expectedFamily;
    private String actualFamily;
    @Test
    public void getFamily(){
        Animal animal = new Animal();
        expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        actualFamily = animal.getFamily();
        Assert.assertEquals(expectedFamily, actualFamily);
    }

}
