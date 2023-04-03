package Lesson6;

public class MethodOverloading_1 {
    int sum(int i1, int i2) {
        return i1 + i2;
    }

    String sum(String s1, String s2) {
        return s1 + s2;
    }

}

class MethodOverloading_Test1 {
    public static void main(String[] args) {
        MethodOverloading_1 mO = new MethodOverloading_1();
        int a = mO.sum(1, 2);
        System.out.println(a);
        String s = mO.sum("Hello", " Ivan");
        System.out.println(s);

    }
}