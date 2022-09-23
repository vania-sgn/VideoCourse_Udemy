package Lesson4;

public class Student_DZ_4_1 {
    int id_student_ticket;
    String name;
    String surname;
    short year_study;
    float average_rating_economy ;
    float average_rating_math ;
    float average_rating_foreign_language;
}
class StudentTest{
    public static void main(String[] args) {
        Student_DZ_4_1 Ivan = new Student_DZ_4_1();
        Student_DZ_4_1 Danil = new Student_DZ_4_1();
        Student_DZ_4_1 Dima = new Student_DZ_4_1();
        Ivan.id_student_ticket=1;
        Ivan.name = "Ivan";
        Ivan.surname = "Skladchykov";
        Ivan.year_study = 2022;
        Ivan.average_rating_economy= 180.1f;
        Ivan.average_rating_math = 192.5f;
        Ivan.average_rating_foreign_language = 178.1f;

        Danil.id_student_ticket=2;
        Danil.name = "Danil";
        Danil.surname = "Kotlov";
        Danil.year_study = 2021;
        Danil.average_rating_economy= 158.1f;
        Danil.average_rating_math = 195.5f;
        Danil.average_rating_foreign_language = 190.1f;

        Dima.id_student_ticket=3;
        Dima.name = "Dima";
        Dima.surname = "Berd";
        Dima.year_study = 2023;
        Dima.average_rating_economy= 168.1f;
        Dima.average_rating_math = 145.5f;
        Dima.average_rating_foreign_language = 198.1f;

        System.out.println("Средняя арифметическая оценка студента "+Ivan.name+" "+Ivan.surname + " = "+(Ivan.average_rating_math+ Ivan.average_rating_economy+ Ivan.average_rating_foreign_language)/3);
        System.out.println("Средняя арифметическая оценка студента "+Danil.name+" "+Danil.surname + " = "+(Danil.average_rating_math+ Danil.average_rating_economy+ Danil.average_rating_foreign_language)/3);
        System.out.println("Средняя арифметическая оценка студента "+Dima.name+" "+Dima.surname + " = "+(Dima.average_rating_math+ Dima.average_rating_economy+ Dima.average_rating_foreign_language)/3);
    }
}
