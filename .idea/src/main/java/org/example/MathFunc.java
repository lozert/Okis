package org.example;

import java.util.Arrays;

import static java.lang.Math.E;
import static java.lang.Math.abs;


public class MathFunc {

    public static double func(double x){
        return x*x -2;
    }

    public static double Df(double x){
        final double EPS = 1e-4;
        return (func(x + EPS) - func(x - EPS)) / (2 * EPS);
    }

    public static double Dichotomy(double a, double b){
        final double EPS = 1e-4;

        double c = 0;
        while (abs(b-a) > EPS ){
            c = (b + a) / 2;

            if(func(a) * func(c) < 0){
                b = c;
            } else if(func(c) * func(b) < 0) {
                a = c;
            } else if(func(c) == 0){
                return c;
            }
        }
        return c;
    }

    public static void QuickSort(int[] sortArr , int low, int high) {

        if (sortArr.length == 0 || low >= high) return;

        //выбираем опорный элемент
        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        //разделияем на подмассивы и меняем местами
        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }
        // вызов рекурсии для сортировки левой и правой части
        if (low < j) {
            QuickSort(sortArr, low, j);
        }
        if (high > i){
            QuickSort(sortArr, i, high);
        }
    }

    public static void SelectionSort(int[] sortArr) {
        for (int i = 0; i < sortArr.length; i++) {
            int pos = i;
            int min = sortArr[i];
            //цикл выбора наименьшего элемента
            for (int j = i + 1; j < sortArr.length; j++) {
                if (sortArr[j] < min) {
                    //pos - индекс наименьшего элемента
                    pos = j;
                    min = sortArr[j];
                }
            }
            sortArr[pos] = sortArr[i];
            //меняем местами наименьший с sortArr[i]
            sortArr[i] = min;
        }
    }

    //Перегруженный метод
    public static void QuickSort(int[] arr){
        QuickSort(arr, 0, arr.length - 1);
    }

//    public static void main(String[] args){
//        int[] x = { 8, 0, 4, 7, 3, 7, 10, 12, -3 };
//        System.out.println("Было");
//        System.out.println(Arrays.toString(x));
//
//        int low = 0;
//        int high = x.length - 1;
//
//        QuickSort(x, low, high);
//        System.out.println("Стало");
//        System.out.println(Arrays.toString(x));
//    }

}
