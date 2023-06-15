package Model;
public class Student extends User implements Comparable<Student>{
    private long studentId;
    public Student(String firstName, String secondName, int age, long studentId){
        super(firstName, secondName, age);
        this.studentId = studentId;
    }
    public long getStudentId(){
        return studentId;
    }
    public void setStudentId(long studentId){
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
    public int compareTo(Student o) {
        /**
         * сортировка по ID студента
         */
//        if(this.getStudentId() == o.getStudentId()) return 0;
//        if(this.getStudentId() < o.getStudentId()) return -1;
//        return 1;
//        System.out.println(super.getFirstName()+" - "+o.getFirstName());
        /**
         * сортировка по возрасту
         */
        if(this.getAge() == o.getAge()) return 0;
        if(this.getAge() < o.getAge()) return -1;
        return 1;
    }
}
