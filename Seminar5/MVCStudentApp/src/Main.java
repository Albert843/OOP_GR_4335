import Controller.Controller;
import Model.Model;
import Model.Student;
import Model.FileModel;
import View.View;
import View.ViewEng;
import Controller.iGetModel;
import Controller.iGetView;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        /**
         * создание списка студентов
         */
        List<Student> students = new ArrayList<>();
        Student s1 = new Student("Сергей","Иванов", 21, 12345);
        Student s2 = new Student("Андрей","Сидоров", 22, 12346);
        Student s3 = new Student("Иван","Петров", 22, 12347);
        Student s4 = new Student("Игорь","Иванов", 23, 12348);
        Student s5 = new Student("Даша","Цветкова", 25, 12349);
        Student s6 = new Student("Лена","Незабудкина", 23, 12340);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);
        students.add(s6);
        /**
         * вывод на русском языке (Семинар закомментировано)
         */
//        iGetModel model = new Model(students);
//        iGetView view = new View();
//        Controller controller = new Controller(view, model);
//        controller.update();

        FileModel fmodel = new FileModel("StudentsDB.txt");
//        fmodel.saveAllStudentsToFile(students);


        /**
         * вывод на английском языке (домашнее задание)
         */
        iGetModel model = new Model(students);
        iGetModel newFModel = fmodel;
        iGetView view = new ViewEng();
        Controller controller = new Controller(view, newFModel);
//        controller.update();
        controller.run();



    }
}