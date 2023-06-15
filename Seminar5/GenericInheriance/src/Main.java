import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student<String, Integer> s1 = new Student<String, Integer>("Сергей", "Иванов", 24, 1);
        Student<String, Integer> s2 = new Student<String, Integer>("Иван", "Сидоров", 34, 2);
        Student<String, Integer> s3 = new Student<String, Integer>("Андрей", "Голиков", 44, 3);

        List<Student<String,Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        StudentGroup<String,Integer> group = new StudentGroup<String,Integer>(4335,listStud);
        for (Student<String,Integer> stud:group) {
            System.out.println(stud);
        }
        System.out.println("--------------- после сортировки----------------");
        Collections.sort(listStud);
        for (Student<String,Integer> stud:group) {
            System.out.println(stud);
        }

    }
}