package StudentDomen;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup>{
    /**
     * <groupId> добавлен для домашнего задания
     */
    private long groupId;
    private List<Student> students;
    public StudentGroup(long groupId, List<Student> students){
        this.groupId = groupId;
        this.students = students;
    }
    public long getGroupId(){
        return groupId;
    }
    public void setGroupId(long groupId){
        this.groupId = groupId;
    }
    public List<Student> getStudents() {
        return students;
    }
    public void setStudents(List<Student> students){
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group {" +
                " groupId = " + groupId +
                ",  students = " + students + '}';
    }

    /**
     * Использование анонимного итератора
     * @return
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }
            @Override
            public Student next() {
                if(!hasNext()){
                    return null;
                }
                else {
                    return students.get(index++);
                }
            }
        };
    }
    /**
     * Использование итератора с созданием класса "StudentGroupIterator"
     */
//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(students);
//    }

    /**
     * добавлен для сортировки <StudentGroup>
     * @param o the object to be compared.
     * @return
     */
    @Override
    public int compareTo(StudentGroup o) {
        if(this.getStudents().size() == o.getStudents().size()) return 0;
        if(this.getStudents().size() < o.getStudents().size()) return -1;
        return 1;
    }
}
