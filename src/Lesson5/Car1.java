package Lesson5;

public class Car1 {
    Car1( String cvet, String motor){
        color = cvet;
        engine = motor;
    }
    String color;
    String engine;

    void info(){
        System.out.println("Cvet:"+color+" Motor: "+ engine);
    }
}

class Car1_Test{
    public static void main(String[] args) {
        Car1 c1 = new Car1("red","v6");
        c1.info();
    }
}
