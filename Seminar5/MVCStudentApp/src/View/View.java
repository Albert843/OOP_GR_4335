package View;
import Controller.iGetView;
import Model.Student;
import java.util.List;
import java.util.Scanner;

public class View implements iGetView {
    public void printAllStudents(List<Student> students){
        System.out.println("------вывод списка студентов--------");
        for (Student student:students) {
            System.out.println(student);
        }
        System.out.println("------ конец списка --------");
    }
    @Override
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
}
