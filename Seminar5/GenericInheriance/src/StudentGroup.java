import java.util.Iterator;
import java.util.List;
public class StudentGroup<T extends Comparable<T>,V> implements Iterable<Student<T,V>>, Comparable<StudentGroup>{
    /**
     * <groupId> добавлен для домашнего задания
     */
    private V groupId;
    private List<Student<T,V>> students;
    public StudentGroup(V groupId, List<Student<T,V>> students){
        this.groupId = groupId;
        this.students = students;
    }
    public V getGroupId(){
        return groupId;
    }
    public void setGroupId(V groupId){
        this.groupId = groupId;
    }
    public List<Student<T,V>> getStudents() {
        return students;
    }
    public void setStudents(List<Student<T,V>> students){
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
    public Iterator<Student<T,V>> iterator() {
        return new Iterator<Student<T,V>>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }
            @Override
            public Student<T,V> next() {
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
