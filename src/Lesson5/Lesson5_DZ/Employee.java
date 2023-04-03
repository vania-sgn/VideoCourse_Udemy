package Lesson5.Lesson5_DZ;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1) {
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    double uvelichenieZarplati() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Skladchykov", 23, 2342.1, "ITTTT");
        Employee emp2 = new Employee(2, "Kotlov", 22, 23402.1, "Manager");

        emp1.uvelichenieZarplati();
        System.out.println("Новая зарплата работника " + emp1.surname + ": " + emp1.salary);

        double NewSalary = emp2.uvelichenieZarplati();
        System.out.println("Новая зарплата работника " + emp1.surname + ": " + NewSalary);

    }
}
