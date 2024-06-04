package main.java.playground.aliona.newproject.GuessTheShip;

import java.util.ArrayList;

public class Ship {
    private ArrayList<String> locationCells;
    private final String name;

    public Ship(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> newLocation) {
        locationCells = newLocation;
    }

    public ArrayList<String> getLocationCells() {
        return locationCells;
    }

    public String getName() {
        return name;
    }

    public String checker(String userGuess) {
        String result = "Мимо";
        int index = locationCells.indexOf(userGuess);
        if (index != -1) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "Потопил";
                System.out.println("Вы потопили : " + name);
            } else {
                result = "Попал";
            }
        }
        return result;
    }
}

