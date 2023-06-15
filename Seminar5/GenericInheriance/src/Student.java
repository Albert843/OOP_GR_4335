public class Student<T extends Comparable<T>,V> extends User<T,V> implements Comparable<Student<T,V>>{
    private V studentId;
    public Student(T firstName, T secondName, V age, V studentId){
        super(firstName, secondName, age);
        this.studentId = studentId;
    }
    /**
     *
     * @return id
     */
    public V getStudentId(){
        return studentId;
    }
    /**
     *
     * @param studentId присваивает уникальный номер
     */
    public void setStudentId(V studentId){
        this.studentId = studentId;
    }
    /**
     * переопределение метода <toString()> для класса наследника <Student>
     * @return
     */
    @Override
    public String toString() {
        return "Student {" +
                "studentId = " + studentId +
                ", firstName = " + super.getFirstName() +
                ", secondName = " + super.getSecondName() +
                ", age = " + super.getAge() + '}';
    }
    @Override
    public int compareTo(Student<T,V> o) {
        return super.getFirstName().compareTo(o.getFirstName());
    }
}
