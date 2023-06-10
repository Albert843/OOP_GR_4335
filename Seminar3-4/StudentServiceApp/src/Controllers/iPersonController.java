package Controllers;
import StudentDomen.User;
import java.util.List;
public interface iPersonController<T extends User> {
    void create(String firstName, String secondName, int age);
}
