import Domen.Bottle;
import Domen.HotDrink;
import Domen.Product;
import VendingMachines.VendingMachine;

import  java.lang.IllegalStateException;

public class Main {
    public static void main(String[] args) {
        //класс Product - родитель
        Product item1  = new Product(1, "Lase", "Чипсы", 59);
        System.out.println(item1.toString());
        //класс Bottle - наследник от Product
        Product item2 = new Bottle(2,"Cola", "Water", 70, 500);
        System.out.println(item2.toString());
        //класс HotDrink - наследник от Product
        Product item3 = new HotDrink(3,"Coffee", "Black", 65, 60);
        System.out.println(item3.toString());

        VendingMachine iMachine = new VendingMachine(500);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(item3);
        iMachine.addProduct(new Product(4, "Масло", "Сливочное", 340));
        iMachine.addProduct(new Bottle(5,"Вода", "Вода", 170, 1500));
        iMachine.addProduct(new HotDrink(6,"Tea", "Indian", 95, 80));

        for (Product prod:iMachine.getProducts()) {
            System.out.println(prod.toString());
        }
    }
}