package Model;
public class User {
    private String firstName;
    private String secondName;
    private int age;
    public User(String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getSecondName(){
        return secondName;
    }
    public void setSecondName(String sName){
        this.secondName = secondName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    /**
     * переопределение метода <toString()> для родительского класса <User>
     * @return
     */
    @Override
    public String toString() {
        return "User {" +
                "firstName = '" + firstName + "\'" +
                ", secondName = '" + secondName + "\'" +
                ", age = " + age + '}';
    }
    //    @Override
//    public String toString() {
//        return String.format("User: %s %s %d\n",firstName, secondName, age);
//    }
}
