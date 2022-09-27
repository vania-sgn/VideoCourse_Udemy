package Lesson5;

import javax.print.DocFlavor;

public class Method_test {
    int summa(int a, int b, int c){
        int result = a+b+c;
        return result;
    }
    int sredneeArif( int a1, int b1, int c1){
        int result2 = summa(a1, b1, c1)/3;
        return result2;
    }
}
 class Test{

    public static void main(String[] args) {
    Method_test t = new Method_test();
    int summaTrexChisel = t.summa(4,5,12);
        System.out.println(summaTrexChisel);
        System.out.println(t.summa(12,34,123));

        System.out.println(t.sredneeArif(20,40,60));
    }
}
