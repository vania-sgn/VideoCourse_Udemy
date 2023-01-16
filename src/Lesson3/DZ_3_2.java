package Lesson3;

public class DZ_3_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = a-- - --a + ++a + a++ + a;
        System.out.println(b);

        int  c = 8;
        int d = ++b - b++ + ++b - --b;
        System.out.println(d);
        System.out.println(d);
    }
}
