package Services;
import StudentDomen.User;
import java.util.List;
public class AverageAge <T extends User> {
    private List list;
    public AverageAge(List list){
        this.list = list;
    }
    /**
     * получение среднего возраста наследника класса <User>
     * @param list список
     * @return
     */
    public double getAverageAge(List<T> list){
        double sum = 0.0;
        for (T user:list) {
            sum += user.getAge();
        }
        return sum/list.size();
    }
}
