import java.util.Scanner;

public class ViewCalculator {
    private iCalculable calculator;
    public ViewCalculator(iCalculable calculator){
        this.calculator = calculator;
    }
    public void run(){
        while (true){
            int realNum1 = promptInt("Введите действительную часть первого числа: ");
            int imagineNum1 = promptInt("Введите мнимую часть первого числа: ");
            calculator.sum(realNum1, imagineNum1);
            //iCalculable calculator = calculableFactory.create(primaryArg);
            while (true){
                String cmd = prompt("Введите команду (*, +, =) : ");
                if(cmd.equals("+")){
                    int realNum2 = promptInt("Введите действительную часть второго числа: ");
                    int imagineNum2 = promptInt("Введите мнимую часть второго числа: ");
                    calculator.sum(realNum2, imagineNum2);
                    continue;
                }
                if(cmd.equals("*")){
                    int realNum2 = promptInt("Введите действительную часть второго числа: ");
                    int imagineNum2 = promptInt("Введите мнимую часть второго числа: ");
                    calculator.multi(realNum2, imagineNum2);
                    continue;
                }
                if(cmd.equals("=")){
                    int realResult = calculator.getRealResult();
                    int imagineResult = calculator.getImagineResult();
                    System.out.printf("Результат %d + %di\n", realResult, imagineResult);
                    break;
                }
            }
            String cmd = prompt("Ещё посчитать (Y/N)?");
            if(cmd.toLowerCase().equals("y")){
                continue;
            }
            break;
        }
    }
    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }
    private int promptInt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return Integer.parseInt(in.nextLine());
    }
}
