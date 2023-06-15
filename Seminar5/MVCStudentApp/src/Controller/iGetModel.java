package Controller;
import java.util.List;
import java.util.HashMap;
import Model.Student;

public interface iGetModel {
    /**
     * метод интерфейса создан на семинаре
     * @return List
     */
    public List<Student> getAllStudents();

    /**
     * метод интерфейса создан для домашнего задания
     * @return HashMap
     */
    public HashMap<Long,Student> getAllHashStudents();
}
