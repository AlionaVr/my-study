import java.util.Arrays;
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] num1 = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            num1[i] = scanner.nextInt();
        }
        System.out.println("Массив: " + Arrays.toString(num1));
        scanner.close();

        int sum = 0;
        for (int i : num1) {
            sum = sum + i;
        }
        System.out.println("сумма чисел в массиве: " + sum);
        if (sum % 2 == 0)
            System.out.println("число четное ");
        else
            System.out.println("Нечетное");

    }
}


