package Model;
import Controller.iGetModel;
import java.util.HashMap;
import java.util.List;

public class Model implements iGetModel {
    private List<Student> students;
    /**
     * поле hashStudents - для домашнего задания
     */
    private HashMap<Long,Student> hashStudents;
    public Model(List<Student> students){
        this.students = students;
    }
    public List<Student> getAllStudents(){
        return students;
    }

    /**
     * метод создан для домашнего задания
     * @return hashStudents
     */
    @Override
    public HashMap<Long,Student> getAllHashStudents() {
        return hashStudents;
    }
}
