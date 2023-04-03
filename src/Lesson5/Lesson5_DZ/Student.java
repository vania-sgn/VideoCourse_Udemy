package Lesson5.Lesson5_DZ;


public class Student {
    int id_student_ticket;
    String name;
    String surname;
    short year_study;
    float average_rating_economy;
    float average_rating_math;
    float average_rating_foreign_language;

}

class StudentTest {
    double sredArifmOcenka(Student st) {
        double srefOcenka = (st.average_rating_math + st.average_rating_economy + st.average_rating_foreign_language) / 3;
        System.out.println("Средняя оценка студента " + st.name + " " + st.surname + ":" + srefOcenka);
        return srefOcenka;
    }

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.id_student_ticket = 1;
        st1.name = "Ivan";
        st1.surname = "Skladchykov";
        st1.year_study = 2022;
        st1.average_rating_economy = 180.1f;
        st1.average_rating_math = 192.5f;
        st1.average_rating_foreign_language = 178.1f;

        Student st2 = new Student();
        st2.id_student_ticket = 2;
        st2.name = "Danil";
        st2.surname = "Kotlov";
        st2.year_study = 2021;
        st2.average_rating_economy = 158.1f;
        st2.average_rating_math = 195.5f;
        st2.average_rating_foreign_language = 190.1f;

        Student st3 = new Student();
        st3.id_student_ticket = 3;
        st3.name = "Dima";
        st3.surname = "Berd";
        st3.year_study = 2023;
        st3.average_rating_economy = 168.1f;
        st3.average_rating_math = 145.5f;
        st3.average_rating_foreign_language = 198.1f;

        StudentTest Stest = new StudentTest();
        Stest.sredArifmOcenka(st1);
        Stest.sredArifmOcenka(st2);
        Stest.sredArifmOcenka(st3);

        //System.out.println("Средняя арифметическая оценка студента "+Ivan.name+" "+Ivan.surname + " = "+(Ivan.average_rating_math+ Ivan.average_rating_economy+ Ivan.average_rating_foreign_language)/3);
        //  System.out.println("Средняя арифметическая оценка студента "+Danil.name+" "+Danil.surname + " = "+(Danil.average_rating_math+ Danil.average_rating_economy+ Danil.average_rating_foreign_language)/3);
        //    System.out.println("Средняя арифметическая оценка студента "+st3.name+" "+st3.surname + " = "+(Dima.average_rating_math+ Dima.average_rating_economy+ Dima.average_rating_foreign_language)/3);
    }
}
