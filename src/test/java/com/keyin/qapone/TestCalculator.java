package com.keyin.qapone;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalculator{

    @Test
    public void calculatorTestOne(){
        Calculator testCalculator = new Calculator();

        Assertions.assertEquals(10, testCalculator.addition(5, 5));
        System.out.println("Test run successfully with expected answer");
    }
    @Test
    public void calculatorTestTwo(){
        Calculator testCalculator = new Calculator();

        Assertions.assertNotEquals(5,testCalculator.division(5, 5));
        System.out.println("Test run successfully with expected answer");
    }
    @Test
    public void calculatorTestThree(){
        Calculator testCalculator = new Calculator();

        Assertions.assertNotNull(testCalculator.multiplication(20,5));
        System.out.println("Test run successfully with expected answer of not null");

    }

}
