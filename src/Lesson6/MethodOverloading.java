package Lesson6;

public class MethodOverloading {
    void show(int i1){
        System.out.println(i1);
    }
    void show(boolean a){
        System.out.println(a);
    }
    void show(String s){
        System.out.println(s);
    }
}
 class MethodOverloading_Test{
     public static void main(String[] args) {
         MethodOverloading mO = new MethodOverloading();
         int i=10;
         mO.show(i);
         boolean a1 = true;
         mO.show(a1);
         String s1 = "Hello";
         mO.show(s1);

     }
 }