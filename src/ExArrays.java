public class ExArrays {
    public static void main (String [] arg){

        //Задача №1. Вычисляет среднее арифметическое массива и сортирует массив//
        double num [] = {1.2,2.5,6.7,5.6,7.9,8,8.4,6.7,8.8,6.4};
        double sum=0;
        for (int i=0; i<num.length; i++){
            sum+=num[i];
        }
        System.out.println ("Среднее арифметическое массива:" + sum/ num.length);


    }
}
