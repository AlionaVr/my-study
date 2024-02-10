package aliona.newproject.GuessTheShip;

import java.util.ArrayList;
import java.util.List;

public class GuessTheShip {
    private final GameHelper helper = new GameHelper();
    private final ArrayList<Ship> shipList = new ArrayList<>();
    private int numOfGuesses = 0;

    private void setUpGame() {
        shipList.addAll(
                List.of(
                        new Ship("Titanic"),
                        new Ship("Victoria"),
                        new Ship("Atlanta")
                )
        );

        System.out.println("Ваша цель - потопить три коробля: Titanic, Victoria, Atlanta.\n " +
                "Попыйтесь потопить их за минимальное количество попыток");
        for (Ship shipInSea : shipList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            shipInSea.setLocationCells(newLocation);
            System.out.println("Location of ship: " + shipInSea.getName() + " | Locations of the ship: " + shipInSea.getLocationCells());
        }


    }

    private void startPlaying() {
        while (!shipList.isEmpty()) {
            String userGuess = helper.getUserInput("сделайте ход");
            checkGuess(userGuess);
        }
        System.out.println("Все корабли ушли ко дну. количество ваших попыток -" + numOfGuesses);
    }

    private void checkGuess(String userGuess) {
        numOfGuesses++;
        String result = " Мимо";
        for (Ship shipUnderAttack : shipList) {
            result = shipUnderAttack.checker(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                shipList.remove(shipUnderAttack);
                break;
            }
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        GuessTheShip game = new GuessTheShip();
        game.setUpGame();
        game.startPlaying();
    }

}
