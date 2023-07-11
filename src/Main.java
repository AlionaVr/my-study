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
       int i,j;
       boolean number;
       System.out.println("простые числа:\n");
       for (i=2; i<=100; i++) {
           number = true;
           for (j=2; j<=i/j; j++) {
               if (i%j==0) number = false;}
       if (number==true) System.out.println(i);
       }
    }

}

