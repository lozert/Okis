package org.example;

import static org.example.MathFunc.*;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestMathFunc {

    @BeforeClass
    public void setUp() {
        System.out.println("Запустился тестовый класс для проверки математических функций");
    }
    //Положительный
    @Test
    public static void TestDichotomy(){
        final double A = 0;
        final double B = 3;
        final double DELTA = 1e-4;
        double expectResult = 1.41421;
        double actualResult;

        actualResult = Dichotomy(A,B);

        Assert.assertEquals(actualResult,expectResult,DELTA);
    }

    @Test(group = {"sort"})
    public void TestQuickSort() {
        int[] array = {2, 4, 9, 10, -2, 0};

        QuickSort(array);
        // Проверяем, что массив отсортирован по возрастанию
        for (int i = 0; i < array.length - 1; i++) {
            Assert.assertTrue(array[i] <= array[i + 1]);
        }
    }

    @Test(group = {"sort"})
    public void TestSelectionSort() {
        int[] array = {2, 4, 9, 10, -2, 0};

        SelectionSort(array);
        // Проверяем, что массив отсортирован по возрастанию
        for (int i = 0; i < array.length - 1; i++) {
            Assert.assertTrue(array[i] <= array[i + 1]);
        }

    }

    @Test
    public void TestDf(){
        final double NUM1 = 2;
        final double DELTA = 1e-4;
        double expectResult = 4;
        double actualResult = Df(NUM1);


        Assert.assertEquals(actualResult,expectResult,DELTA);
    }
}
