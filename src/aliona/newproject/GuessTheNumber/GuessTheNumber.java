package aliona.newproject.GuessTheNumber;



import java.util.ArrayList;

public class GuessTheNumber {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleNumber num = new SimpleNumber();
        int randomNum = (int) (Math.random()*5);
        ArrayList<String> locations= new ArrayList<String>();
        locations.add(String.valueOf(randomNum));
        locations.add(String.valueOf(randomNum+1));
        locations.add(String.valueOf(randomNum-1));

        SimpleNumber.setLocationCells (locations);

        boolean isAlive = true;

        while (isAlive) {
            String guess = helper.getUserInput("Введите число");
            String result = num.checker(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isAlive = false;
                System.out.println("Вам потребовалось попыток : " + numOfGuesses);
            }
        }
    }
}

