package StudentDomen;
import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;
    public StudentGroupIterator(List<Student> students){
        this.students = students;
        counter = 0;
    }
    @Override
    public boolean hasNext() {
        return counter < students.size();
    }
    @Override
    public Student next() {
        if(!hasNext()){
            return null;
        }
        else {
            return students.get(counter++);
        }
    }
}
