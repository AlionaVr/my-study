package main.java.playground.aliona.oldprojects;

public class  LeapYears {
    public static boolean isLeapYear(int year) {
       return year % 100 != 0&&year % 4== 0||year%400==0;
        }
    public static void main(String[] args) {
        boolean leapYear = isLeapYear(2100);

        System.out.println(leapYear);
    }
}
