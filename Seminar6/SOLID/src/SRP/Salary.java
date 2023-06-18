package SRP;
public class Salary {
    private int baseSalary;
    private int tax;
    public Salary(int baseSalary, int tax){
        this.baseSalary = baseSalary;
        this.tax = tax;
    }
    public int getBaseSalary(){
        return baseSalary;
    }
    public int calculateNetSalary(){            //метод формула начисления оплаты труда
        int tax = (int)(baseSalary * 0.25);
        return  baseSalary - tax;
    }
}
