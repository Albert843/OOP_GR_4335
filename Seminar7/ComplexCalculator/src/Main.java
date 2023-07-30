public class Main {
    public static void main(String[] args) {

        /*
            программа без паттерна <Decorator>
        */
        //iCalculable calculator = new Calculator(0, 0);

        /*
            программа с паттерном <Decorator> --> (Calculator + Logger)
        */
        iCalculable calculator = new CalcDecorator(new Calculator(0, 0), new Logger());
        ViewCalculator view = new ViewCalculator(calculator);
        view.run();
    }
}