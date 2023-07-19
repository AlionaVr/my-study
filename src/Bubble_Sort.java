import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Bubble_Sort {
    public static void main (String args[])
            throws java.io.IOException {
        //Scanner scanner = new Scanner (System.in);//
        int i, k, num, counter=1;
        /*System.out.println("Введите список цифр для сортирковки через пробел");
        /* Считает длину массива
        do {num = (int) System.in.read();
            if (num == ' ') counter++;}
        while (num != '\n');*/


        int list [] = {1, 89, 7486, 4,-45};
            for (i=1; i< list.length; i++){
                for (k=0; k< (list.length-i); k++) {
                    if (list[k]>list[k+1]) {
                        int t=list[k+1];
                        list[k+1] = list[k];
                        list[k] = t;
                    }
                }
            System.out.println(Arrays.toString(list));
            }
        System.out.println("Отсортированный список:"+ Arrays.toString(list));
    }
}

