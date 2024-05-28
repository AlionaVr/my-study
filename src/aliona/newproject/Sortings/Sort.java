package aliona.newproject.Sortings;

import java.util.Arrays;
import java.util.Random;

public class Sort {
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

        Arrays.sort(libraryNum);
        System.out.print("Sorted array:\t\t ");
        for (int i = 0; i < libraryNum.length; i++) {
            System.out.printf("%4d ", libraryNum[i]);
        }
        System.out.println();
    }
}



