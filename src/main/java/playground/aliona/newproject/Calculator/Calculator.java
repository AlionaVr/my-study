package main.java.playground.aliona.newproject.Calculator;

public class Calculator {
    public static void main(String[] args) {
        double x, y;
        double sum;

        x = inputDoubleFromConsole();
        y = inputDoubleFromConsole();

        sum = addition(x, y);

        System.out.println(x + " + " + y + " = " + sum);
    }

    public static double inputDoubleFromConsole() {
        double value;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value: ");
        while (!sc.hasNextDouble()) {
            sc.nextLine();
            System.out.print("Invalid input. Enter value: ");
        }
        value = sc.nextDouble();

        return value;
    }


    public static double addition(double a, double b) {
        double sum;

        sum = a + b;

        return sum;
    }

}
}
