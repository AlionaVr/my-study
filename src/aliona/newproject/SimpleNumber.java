package aliona.newproject;

import java.util.ArrayList;

class SimpleNumber {
    private static ArrayList <String> locationCells;


    public static void setLocationCells(ArrayList<String> locs) {

         locationCells = locs;
    }

    public String checker(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
            }
            else {
                result = "Попал";

            }
        }
        System.out.println(result);
        return result;
    }
}