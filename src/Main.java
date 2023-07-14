import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;
        //do {//
            System.out.println("Cnpaвкa:");
            System.out.println(" 1. if");
            System.out.println(" 2. switch");
            System.out.println(" З. for");
            System.out.println(" 4. while");
            System.out.println(" 5. do-while\n");
            System.out.print("Bыбepитe: ");
            choice = (char) System.in.read();
            // Эта часть позволяет игнорировать все остальные цифры, повторяет справочное меню до тех пор пока не выберет нужный вариант//
            /*do {
                ignore = (char) System.in.read();}
            while(ignore != '\n');}
            while ( choice < '1' | choice > '5') ;*/
        switch (choice) {
            case '1':
                System.out.println("Оператор if: \n if (условие) оператор;\n else оператор;");
            break;
            case '2':
                System.out.println ("Оператор switch: \n switch(выражение){\n последовательность операторов\n" +
                        "break;\n ... \n }");
            break;
            case '3':
                System.out.println("Oпepaтop for:\n " +
                        "for(инициaлизaция; условие; итерация)\n " +
                        "оператор;");
                break;
            case '4':
                System.out.println("Oпepaтop while:\n while(ycлoвиe) оператор;");
                break;
            case '5':
                System.out.println("Oпepaтop do-while:\n" +
                        "do {оператор;} while (условие);");
                break;
            default:
                System.out.print("Зaпpoc не найден.");
        }

    }

}

