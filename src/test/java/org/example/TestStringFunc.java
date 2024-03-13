package org.example;

import static org.example.StringFunc.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestStringFunc {

    @BeforeClass
    public void setUp() {
        System.out.println("Запустился тестовый класс для проверки строковых функций");
    }
    @Test
    public static void TestIndexOf(){
        final String STR = "Hello, world";
        final char SUBSTR = 'l';
        int expectResult = 2;
        int actualResult;

        actualResult = IndexOf(STR, SUBSTR);

        Assert.assertEquals(actualResult,expectResult);
    }

    @Test
    public static void TestReplace(){
        final String STR = "Hello, world";
        final char REPLACE1 = 'l';
        final char REPLACE2 = 'd';
        String expectResult = "Heddo, wordd";
        String actualResult = Replace(STR, REPLACE1, REPLACE2);

        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public static void TestReverse(){
        final String STR = "assembler";
        String expectResult = "relbmessa";
        String actualResult = Reverse(STR);

        Assert.assertEquals(actualResult, expectResult);
    }

    @Test
    public static void TestAppend(){
        final String STR = "Hello";
        final char element = 'w';
        String expectResult = "Hellow";
        String actualResult = Append(STR, element);

        Assert.assertEquals(actualResult,expectResult);
    }
}
