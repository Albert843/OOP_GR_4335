import Domen.Bottle;
import Domen.Product;
import VendingMachines.VendingMachine;

import  java.lang.IllegalStateException;

public class Main {
    public static void main(String[] args) {
        Product item1  = new Product(1, "Lase", "Чипсы", 59);
        item1.setPrice(90);
        System.out.println(item1.toString());

        Product item2 = new Bottle(2,"Cola", "Water", 70, 500);
        System.out.println(item2.toString());

        VendingMachine iMachine = new VendingMachine(500);
        iMachine.addProduct(item1);
        iMachine.addProduct(item2);
        iMachine.addProduct(new Product(3, "Масло", "Сливочное", 340));
        iMachine.addProduct(new Bottle(4,"Вода", "Вода", 170, 1500));

        for (Product prod:iMachine.getProducts()) {
            System.out.println(prod.toString());
        }
    }
}