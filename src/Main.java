import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        //переводит из галлов в литры//
               /*System.out.println("Enter the volume in gallons: " );
                Scanner consol = new Scanner(System.in);
                double gallons = consol.nextDouble();
                double liters = gallons*3.7854;

                System.out.println("gallons = " + gallons);
                System.out.print("liters = " + liters);*/

        // *** задача поиска простых чисел *** //
      /* int i,j;
       boolean number;
       System.out.println("простые числа:\n");
       for (i=2; i<=100; i++) {
           number = true;
           for (j=2; j<=i/j; j++) {
               if (i%j==0) number = false;}
       if (number==true) System.out.println(i);
       }*/

        //*** Игра угадай букву ***//
        int number, attempt, counter;
        System.out.println(" Player №1, загадайте и введите число от 1 до 10");
        Scanner myScanner = new Scanner(System.in);
        number = myScanner.nextInt();
        Stream.iterate(1, i -> i < 15, i -> i + 1).forEach(i -> System.out.println());
        System.out.println(" Player №2, попробуйте угадать число. Количество попыток: " + (3));
        for (counter = 1; counter <= 3; counter++) {
            attempt = myScanner.nextInt();
            if ((attempt == number)) {
                System.out.println("*** ПОЗДРАВЛЯЕМ! ВЫ УГАДАЛИ ***");
                break;
            }
            else if (counter != 3)
                System.out.println("!!!  НЕТ, НЕ УГАДАЛИ !!! \n Попробуйте снова.Количество оставшихся попыток:" + (3 - counter));
            else System.out.println("!!!  Ну и балбес, НЕ УГАДАЛИ !!!");
        }

    }

}

