package StudentDomen;
public class Teacher extends User{
    private long teacherId;
    private String grade;
    private String subject;
    public Teacher(String firstName, String secondName, int age, long teacherId, String grade, String subject){
        super(firstName, secondName, age);
        this.teacherId = teacherId;
        this.grade = grade;
        this.subject = subject;
    }
    public long getTeacherId(){
        return teacherId;
    }
    public void setTeacherId(long teacherId){
        this.teacherId = teacherId;
    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    /**
     * переопределение метода <toString()> для класса наследника <Teacher>
     * @return
     */
    @Override
    public String toString() {
        return "Teacher {" +
                "teacherId = " + getTeacherId() +
                ", firstName = " + super.getFirstName() +
                ", secondName = " + super.getSecondName() +
                ", age = " + super.getAge() +
                ", grade = " + getGrade() +
                ", subject = " + getSubject() +
                '}';
    }
}
