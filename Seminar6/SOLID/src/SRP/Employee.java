package SRP;

import java.util.Date;

public class Employee {
    private String name;    //имя
    private Date dob;       //дата рождения
    public Employee(String name, Date dob){
        this.name = name;
        this.dob = dob;
    }
    public String getEmpInfo(){
        return "name- "+name+", dob-"+dob.toString();
    }

}
