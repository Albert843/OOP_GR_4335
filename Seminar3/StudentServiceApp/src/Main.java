import StudentDomen.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        /**
         * увеличен список студентов
         */
        Student s1 = new Student("Сергей", "Иванов", 23, 12345);
        Student s2 = new Student("Андрей", "Сидоров", 22, 54321);
        Student s3 = new Student("Иван", "Петров", 21, 15003);
        Student s4 = new Student("Игорь", "Иванов", 45, 30251);
        Student s5 = new Student("Даша", "Цветкова", 35, 10023);
        Student s6 = new Student("Лена", "Незабудкина", 27, 76501);
        Student s7 = new Student("Роман", "Круглов", 20, 12347);
        Student s8 = new Student("Максим", "Инин", 26, 54328);
        Student s9 = new Student("Валентина", "Карпова", 25, 15009);
        Student s10 = new Student("Светлана", "Белова", 25, 30252);
        Student s11 = new Student("Рита", "Григорьева", 32, 10024);
        Student s12= new Student("Ольга", "Васильева", 24, 76502);
        /**
         * разделение списков студентов
         */
        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s6);
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);
        List<Student> listStud3 = new ArrayList<Student>();
        listStud3.add(s10);
        listStud3.add(s11);
        listStud3.add(s12);
        /**
         * добавлены группы
         */
        StudentGroup group1 = new StudentGroup(1, listStud1);
        StudentGroup group2 = new StudentGroup(2, listStud2);
        StudentGroup group3 = new StudentGroup(3, listStud3);
        /**
         * список потока (в нем перечислены группы)
         */
        List<StudentGroup> steamList = new ArrayList<StudentGroup>();
        steamList.add(group1);
        steamList.add(group2);
        steamList.add(group3);
        StudentSteam steam = new StudentSteam(steamList);

        //============================== СЕМИНАР ЗАДАНИЕ ===============================
//        /**
//         * итерация для списка студентов
//         */
//        for (Student student:group1) {
//            System.out.println(student);
//        }
//        System.out.println("--------------- после сортировки -----------------");
//        Collections.sort(group1.getStudents());
//        /**
//         * сортировка списка студентов
//         */
//        for (Student student:group1) {
//            System.out.println(student);

        System.out.println("\n====================== ДОМАШНЕЕ ЗАДАНИЕ ========================\n");
        /**
         * итерация для списка групп
         */
        for (StudentGroup group:steam) {
            System.out.println(group);
        }
        System.out.println("\n--------------- после сортировки -----------------\n");
        Collections.sort(steam.getGroup());
        /**
         * сортировка списка групп по размеру группы (кол-во студентов в группе)
         */
        for (StudentGroup group:steam) {
            System.out.println(group);
        }
    }
}