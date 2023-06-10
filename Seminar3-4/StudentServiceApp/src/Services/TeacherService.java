package Services;
import StudentDomen.PersonComparator;
import StudentDomen.Student;
import StudentDomen.Teacher;
import StudentDomen.UserComparator;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iUserService<Teacher>{
    private int count;
    private List<Teacher> teachers;
    public TeacherService(){
        this.teachers = new ArrayList<Teacher>();
    }
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Teacher per = new Teacher(firstName, secondName, age, 100, "High", "SomeSubject");
        count++;
        teachers.add(per);
    }
    public List<Teacher> getSortedByFIOTeachersList(){
        List<Teacher> newTeachersList = new ArrayList<Teacher>(teachers);
        newTeachersList.sort(new UserComparator<Teacher>());
        return newTeachersList;
    }
}
