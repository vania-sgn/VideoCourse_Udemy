package Lesson5;

public class Car {
    String name;
    String color;
    double speed;

    int gaz(int skorost) {
        speed += skorost;
        return skorost;
    }

    int tormoz(int skorost) {
        speed -= skorost;
        return skorost;
    }

    void showInfo() {
        System.out.println("Marka- " + name + " cvet-" + color + " skorost-" + speed);
    }
}

class Car_Test {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.name = "bmv";
        c1.speed = 20.1;
        c1.color = "White";
        c1.gaz(20);
        c1.showInfo();
        c1.tormoz(10);
        c1.showInfo();
    }
}

