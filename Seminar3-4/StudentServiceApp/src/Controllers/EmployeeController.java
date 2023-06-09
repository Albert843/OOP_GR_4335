package Controllers;
import Services.EmployeeService;
import StudentDomen.Employee;
import StudentDomen.User;
public class EmployeeController implements iPersonController<Employee>{
    private final EmployeeService empServ = new EmployeeService();
    @Override
    public void create(String firstName, String secondName, int age) {
        empServ.create(firstName, secondName, age);
    }
    static public <T extends Employee> void paySalary(T person){
        System.out.println(person.getFirstName() + " выплачена зарплата 10000 р. ");
    }
}
