package Services;
import StudentDomen.Employee;
import StudentDomen.PersonComparator;
import StudentDomen.Student;

import java.util.ArrayList;
import java.util.List;
public class EmployeeService implements iPersonService<Employee>{
    private int count;
    public List<Employee> employees;
    public EmployeeService(){
         this.employees = new ArrayList<Employee>();
    }
    @Override
    public List<Employee> getAll() {
        return null;
    }
    @Override
    public void create(String firstName, String secondName, int age) {
        Employee per = new Employee(firstName, secondName, age, "basic");
        employees.add(per);
    }
    public List<Employee> getSortedByFIOEmployeesList(){
        List<Employee> newEmployeesList = new ArrayList<Employee>(employees);
        newEmployeesList.sort(new PersonComparator<Employee>());
        return newEmployeesList;
    }
}
