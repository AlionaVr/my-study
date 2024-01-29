package aliona.newproject;

public class GuessTheNumber {
    public static void main(String[] args) {
        SimpleNumber num = new SimpleNumber();
        int[] locations = {2, 3, 4};
        num.setLocationCells(locations);
        String userGuess = "2";
        String result = num.checker(userGuess);
    }
}
