package main.java.playground.aliona.newproject.Sortings;

import java.util.Random;

public class SelectionSort {
    public static void Sort(int[] ar) {
        int min, temp;
        for (int i = 0; i < ar.length - 1; i++) {
            min = ar[i];

            for (int j = i + 1; j < ar.length; j++) {
                if (ar[j] < min) {
                    min = ar[j];
                    temp = ar[i];
                    ar[i] = min;
                    ar[j] = temp;
                }
            }
            System.out.print("Array after " + i + "-th iteration:\t ");
            for (int k = 0; k < ar.length; k++) {
                System.out.printf("%4d ", ar[k]);
            }
            System.out.println();
        }
        System.out.print("Sorted array:\t\t ");
        for (int i = 0; i < ar.length; i++) {
            System.out.printf("%4d ", ar[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] libraryNum = new int[10];
        Random rand = new Random();

        for (int num = 0; num < libraryNum.length; num++) {
            libraryNum[num] = rand.nextInt(1000);
        }
        System.out.print("Source array:\t\t ");
        for (int num = 0; num < libraryNum.length; num++) {
            System.out.printf("%4d ", libraryNum[num]);
        }
        System.out.println();
        Sort(libraryNum);
    }
}


