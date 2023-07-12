import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[])

        throws java.io.IOException {
        char choice;
        System.out.println("Справка: \n " +
                            "1. if \n " +
                            "2. switch \n " +
                            "Выберите:");
        choice = (char) System.in.read();
        switch (choice) {
            case '1':
                System.out.println("Оператор if: \n if (условие) оператор;\n else оператор;");
            break;
            case '2':
                System.out.println ("Оператор switch: \n switch(выражение){\n последовательность операторов\n" +
                        "break;\n ... \n }");
            break;
            default:
                System.out.print("Зaпpoc не найден.");
        }

    }

}

