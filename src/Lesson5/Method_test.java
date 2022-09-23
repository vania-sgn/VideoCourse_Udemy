package Lesson5;

public class Method_test {
    int summa(int a, int b, int c){
        int result = a+b+c;
        return result;
    }}
 class Test{

    public static void main(String[] args) {
    Method_test t = new Method_test();
    int summaTrexChisel = t.summa(4,5,12);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(12,34,123));
    }
}
