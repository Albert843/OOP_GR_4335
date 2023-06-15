public class User<T,V> {
    private T firstName;
    private T secondName;
    private V age;

    /**
     * конструктор класса
     * @param firstName имя
     * @param secondName фамилия
     * @param age возраст
     */
    public User(T firstName, T secondName, V age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }
    public T getFirstName(){
        return firstName;
    }
    public void setFirstName(T firstName){
        this.firstName = firstName;
    }
    public T getSecondName(){
        return secondName;
    }
    public void setSecondName(T sName){
        this.secondName = secondName;
    }
    public V getAge(){
        return age;
    }
    public void setAge(V age){
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
