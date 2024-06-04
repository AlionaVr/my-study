package main.java.playground.aliona.newproject;/*
public class PhraseGenerater {
    public static void main (String[] args) {
        String [] listOne = {"круглосуточный", "взаимный", "точный", "верный", "нужный", "надежный", "выигрышный", "особенный"};
        String [] listTwo = {"ориентированный", "центральный", "фирменный", "ускоренный", "совместный", "проникающий", "сфокусированный", "распределенный"};
        String [] listThree = { "портал", "пункт следования", "образец", "обзор", "уровень", "приз","процесс", "тип"};
        System.out.println("первый список состоит из "+ listOne.length + " элементов, а второй - " + listTwo.length +  "; третий - " + listThree.length );
     int rand1 = (int) (Math.random()*listOne.length);
     int rand2 = (int) (Math.random()*listTwo.length);
     int rand3 = (int) (Math.random()*listThree.length);
        System.out.println(listOne [rand1] + " " + listTwo [rand2] + " " + listThree [rand3]);
    }
}*/

public class  Shuffle1 {
    public static void main(String[] args) {
        int x = 3;
        if (x > 2) {
            System.out.print("a");
        }
        while (x>0) {
            x=x-1;
            System.out.print("-");
            if (x==1) {
                System.out.print("d");
                x=x-1;
            }
            if (x==2) {
                System.out.print("b c");
            }
            }

        }
    }

