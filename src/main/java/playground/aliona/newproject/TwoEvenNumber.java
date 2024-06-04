package main.java.playground.aliona.newproject;

import java.util.ArrayList;

public class TwoEvenNumber {
    public static void main(String[] args) {
        int num[] = {16, 18, 11, 3};
        ArrayList<Integer> even = new ArrayList<>();

        for (int j : num) {
            if (j % 2 == 0) {
                even.add(j);
                System.out.println(j);
            }
        }
        System.out.println(even);
    }
}

