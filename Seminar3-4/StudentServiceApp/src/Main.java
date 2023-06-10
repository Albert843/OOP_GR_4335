import Controllers.EmployeeController;
import Services.AverageAge;
import Services.TeacherService;
import StudentDomen.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
//        ========================== SEMINAR 3 ==============================

//        /**
//         * увеличен список студентов
//         */
//        Student s1 = new Student("Сергей", "Иванов", 23, 12345);
//        Student s2 = new Student("Андрей", "Сидоров", 22, 54321);
//        Student s3 = new Student("Иван", "Петров", 21, 15003);
//        Student s4 = new Student("Игорь", "Иванов", 45, 30251);
//        Student s5 = new Student("Даша", "Цветкова", 35, 10023);
//        Student s6 = new Student("Лена", "Незабудкина", 27, 76501);
//        Student s7 = new Student("Роман", "Круглов", 20, 12347);
//        Student s8 = new Student("Максим", "Инин", 26, 54328);
//        Student s9 = new Student("Валентина", "Карпова", 25, 15009);
//        Student s10 = new Student("Светлана", "Белова", 25, 30252);
//        Student s11 = new Student("Рита", "Григорьева", 32, 10024);
//        Student s12= new Student("Ольга", "Васильева", 24, 76502);
//        /**
//         * разделение списков студентов
//         */
//        List<Student> listStud1 = new ArrayList<Student>();
//        listStud1.add(s1);
//        listStud1.add(s2);
//        listStud1.add(s3);
//        listStud1.add(s4);
//        listStud1.add(s5);
//        List<Student> listStud2 = new ArrayList<Student>();
//        listStud2.add(s6);
//        listStud2.add(s7);
//        listStud2.add(s8);
//        listStud2.add(s9);
//        List<Student> listStud3 = new ArrayList<Student>();
//        listStud3.add(s10);
//        listStud3.add(s11);
//        listStud3.add(s12);
//        /**
//         * добавлены группы
//         */
//        StudentGroup group1 = new StudentGroup(1, listStud1);
//        StudentGroup group2 = new StudentGroup(2, listStud2);
//        StudentGroup group3 = new StudentGroup(3, listStud3);
//        /**
//         * список потока (в нем перечислены группы)
//         */
//        List<StudentGroup> steamList = new ArrayList<StudentGroup>();
//        steamList.add(group1);
//        steamList.add(group2);
//        steamList.add(group3);
//        StudentSteam steam = new StudentSteam(steamList);
//
//        //============================== СЕМИНАР ЗАДАНИЕ ===============================
////        /**
////         * итерация для списка студентов
////         */
////        for (Student student:group1) {
////            System.out.println(student);
////        }
////        System.out.println("--------------- после сортировки -----------------");
////        Collections.sort(group1.getStudents());
////        /**
////         * сортировка списка студентов
////         */
////        for (Student student:group1) {
////            System.out.println(student);
//
//        System.out.println("\n====================== ДОМАШНЕЕ ЗАДАНИЕ ========================\n");
//        /**
//         * итерация для списка групп
//         */
//        for (StudentGroup group:steam) {
//            System.out.println(group);
//        }
//        System.out.println("\n--------------- после сортировки -----------------\n");
//        Collections.sort(steam.getGroup());
//        /**
//         * сортировка списка групп по размеру группы (кол-во студентов в группе)
//         */
//        for (StudentGroup group:steam) {
//            System.out.println(group);
//        }


//        ======================================== SEMINAR 4 ===========================================
//        Employee per1 = new Employee("Борис", "Иванов", 40, "basic");
//        Student s1 = new Student("Сергей", "Иванов", 23, 12345);
//        EmployeeController empContr = new EmployeeController();
//        EmployeeController.paySalary(per1);
//        EmployeeController.paySalary(s1);
//        empContr.paySalary(per1);
//        empContr.paySalary(s1);


//        =============================== ДОМАШНЕЕ ЗАДАНИЕ по SEMINAR 4 ======================================
        /**
         * создание экземпляра <ts> класса <TeacherService>
         */
        TeacherService ts = new TeacherService();
        /**
         * создание и вывод в консоль списка учителей
         */
        ts.create("Сергей","Иванов",28);
        ts.create("Вадим","Говоров",34);
        ts.create("Сергей","Завьялов",54);
        ts.create("Артем", "Васильев", 37);
        ts.create("Сергей","Васнецов", 41);
        System.out.println(ts.getAll());

        System.out.println("-------------- после сортировки ------------------");
        /**
         * сортировка и вывод в консоль списка учителей
         */
        List<Teacher> newTeachersList = ts.getSortedByFIOTeachersList();
        System.out.println(newTeachersList);

        System.out.println("------- Средний возраст -------");

        /**
         * подсчет среднего возраста учителей
         */
        AverageAge<Teacher> teacherAverageAge = new AverageAge<Teacher>(newTeachersList);
        double teacherAge = teacherAverageAge.getAverageAge(newTeachersList);
        System.out.println("Средний возраст учителей: " + teacherAge);
    }
}