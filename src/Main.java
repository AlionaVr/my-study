import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[])
            throws java.io.IOException {
        char symbol;
        int counter=0;
        System.out.println("для остановки введите '.' ");
        do {
            symbol = (char) System.in.read();
            if (symbol == ' ') counter++;
        }
        while (symbol != '.');
        System.out.println("counter:"+ counter);
        System.out.println("конец");
    }
}

