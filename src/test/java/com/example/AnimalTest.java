package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.when;


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
