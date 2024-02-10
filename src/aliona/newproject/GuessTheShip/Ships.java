package aliona.newproject.GuessTheShip;

import java.util.ArrayList;

public class Ships {
    private static ArrayList<String> locationCells;
    private String name;

    public void setLocationCells (ArrayList<String> loc) {
        locationCells = loc;
    }
    public void setName (String n) {
        name=n;
    }

    public String checker(String userGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(userGuess);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Вы потопили : " + name);
            }
            else {
                result = "Попал";

            }

        }
        return result;
    }
}

