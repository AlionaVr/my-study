class  Summat {
    int sum (int...n){
        int result=0;
        for (int i=0; i< n.length; i++)
            result+= n[i];
        return result;
    }
}
class SumIt {
    public static void main(String args[]) {
        Summat num1 = new Summat();
        int total = num1.sum(1, 2, 3);
        System.out.println("Сумма; " + total);

                total = num1.sum(1, 2, 3, 4, 5);
        System.out.println("Сумма: " + total);
    }
}