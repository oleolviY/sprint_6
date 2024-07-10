package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AnimalExceptionTest {
    private static final String EXPECTED_ERROR = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    private String animalKind;

    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
                {"всеядный"},
                {"null"},
                {"прожора"},
        };
    }
    public AnimalExceptionTest(String animalKind){
        this.animalKind = animalKind;
    }

    @Test
    public void checkFood(){
        Animal animal = new Animal();
        Exception exception = Assert.assertThrows(Exception.class, () -> {animal.getFood(animalKind);
        });
        Assert.assertEquals(EXPECTED_ERROR, exception.getMessage());
    }
}
