package aliona.newproject.GuessTheShip;
import java.util.ArrayList;

public class GuessTheShip {
    private GameHelper helper = new GameHelper();
    private ArrayList <Ships> shiplist = new ArrayList<Ships>();
    private int numOfGuesses = 0;
    private void setUpGame () {
        Ships one = new Ships();
        one.setName ("Titanic");
        Ships two = new Ships();
        two.setName ("Victoria");
        Ships three = new Ships();
        three.setName ("Atlanta");
        shiplist.add (one);
        shiplist.add (two);
        shiplist.add (three);
        System.out.println( "аша цель - потопить три коробля: titanic, Victoria, Atlanta.\n " +
                "Попыйтесь потопить их за минимальное еколичество попыток");
        for (Ships shipInSea: shiplist) {
            ArrayList <String> newLocation = helper.placeDotCom(3);
            shipInSea.setLocationCells(newLocation);
        }



    }
    private void startPlaying () {
        while (!shiplist.isEmpty()) {
            String userGuess = helper.getUserInput("сделайте ход");
            checkGuess (userGuess);
        }
        System.out.println( "Все корабли ушли ко дну. количество ваших попыток -" + numOfGuesses);
    }
    private void checkGuess (String userGuess) {
        numOfGuesses++;
        String result = " Мимо";
        for (Ships shipUnderAttack: shiplist) {
            result = shipUnderAttack.checker(userGuess);
            if (result.equals("Попал")) {
                break;
            }
            if (result.equals("Потопил")) {
                shiplist.remove(shipUnderAttack);
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
