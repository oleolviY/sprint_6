package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionExceptionTest {
    private static final String EXPECTED_ERROR = "Используйте допустимые значения пола животного - самей или самка";
    private String sex;

    @Parameterized.Parameters
    public static Object[][] data(){
        return new Object[][]{
                {"самозванец"},
                {"null"},
                {"двуликий"},
        };
    }
    public  LionExceptionTest(String sex){
        this.sex = sex;
    }

    @Test
    public void doesHaveMane(){
        IndexOutOfBoundsException indexOutOfBoundsException = Assert.assertThrows(IndexOutOfBoundsException.class, () -> {new Lion(sex, null);
        });
        Assert.assertEquals(EXPECTED_ERROR, indexOutOfBoundsException.getMessage());
    }
}
