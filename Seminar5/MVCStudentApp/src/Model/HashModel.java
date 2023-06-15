package Model;
import Controller.iGetModel;
import java.util.List;
import java.util.HashMap;

/**
 * класс HashModel создан для домашнего задания
 */
public class HashModel implements iGetModel {
    private HashMap<Long,Student> hashStudents;
    public HashModel(HashMap<Long,Student> hashStudents){
        this.hashStudents = hashStudents;
    }
    public HashMap<Long,Student> getAllHashStudents(){
        return hashStudents;
    }
    @Override
    public List<Student> getAllStudents() {
        return null;
    }
}
