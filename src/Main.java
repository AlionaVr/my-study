public class Main {
    public static void main(String args[])
            throws java.io.IOException {
        // меняет регистр введенных символов//
        char symbol;
        int changes = 0;
        System.out.println("Введите символы. Для остановки введите '.'");
        do {
            symbol = (char) System.in.read();
            if (symbol >= 'a' & symbol <= 'z') {
                symbol -= 32;
                changes++;
            } else if (symbol >= 'A' & symbol <= 'Z') {
                symbol += 32;
                changes++;
            }
        }
        while (symbol != '\n');
        System.out.println("Количество изменений регистра:" + changes);
    }
}

