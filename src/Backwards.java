class Bw {
    String str;

    Bw(String s) {
        str = s;
    }

    void bw(int idx) {
        if (idx != str.length() - 1) bw(idx + 1);
        System.out.print(str.charAt(idx));
    }
}
class Backwards {
    public static void main(String args[]) {
        Bw s = new Bw("Это тест");
        s.bw(0) ;}
}
