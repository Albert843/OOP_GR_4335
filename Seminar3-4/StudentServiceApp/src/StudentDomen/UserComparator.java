package StudentDomen;
import java.util.Comparator;
public class UserComparator<T extends User> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        int compareResult = o1.getFirstName().compareTo(o2.getFirstName());
        if(compareResult == 0){
            compareResult = o1.getSecondName().compareTo(o2.getSecondName());
            return compareResult;
        } else {
            return compareResult;
        }
    }
}
