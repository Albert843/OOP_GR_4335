package Controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import Model.Student;
import Model.HashModel;
import View.View;
import Controller.Commands;

public class Controller {
    private iGetView view;
    private iGetModel model;
    /**
     * поле для домашнего задания
     */
    private HashModel hashModel;
    private List<Student> students;
    /**
     * хранилище HashMap для домашнего задания
     */
    private HashMap<Long,Student> hashStudents;
    public Controller(iGetView view, iGetModel model){
        this.view = view;
        this.model = model;
        this.students = new ArrayList<Student>();
        this.hashStudents= new HashMap<Long,Student>();
    }
    public void getAllStudents(){
        students = model.getAllStudents();
    }
    /**
     * метод для домашнего задания
     */
    public void getAllHashStudents(){
        hashStudents = hashModel.getAllHashStudents();
    }
    public boolean testData(){
        if(students.size() > 0){
            return true;
        }else {
            return false;
        }
    }
    public void update(){
//                              MVP < Model - View - Controller >
        getAllStudents();
        if(testData()){
            view.printAllStudents(students);
        }else {
            System.out.println("список студентов пуст");
        }
//                              MVC < Model - View - Presenter >
//        view.printAllStudents(model.getAllStudents());
    }
    public void run(){
        Commands com = Commands.NONE;
        boolean getNewIteration = true;
        while (getNewIteration){
            String command = view.prompt("Введите команду: ");
            com = Commands.valueOf(command.toUpperCase());
            switch (com){
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    getAllStudents();
                    view.printAllStudents(students);
                    break;

            }
        }
    }
}
