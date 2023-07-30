public class CalcDecorator implements iCalculable{
    private iCalculable oldCalc;
    private Logger logger;
    public CalcDecorator(iCalculable oldCalc, Logger log){
        this.oldCalc = oldCalc;
        this.logger = log;
    }
    @Override
    public iCalculable sum(int realPart, int imaginePart) {
        int primaryRealPart = oldCalc.getRealResult();
        int primaryImaginePart = oldCalc.getImagineResult();
        logger.log(String.format("Первое значение калькулятора %d + %di. Начало вызова метода sum с параметром %d + %di", primaryRealPart, primaryImaginePart, realPart, imaginePart));
        iCalculable result = oldCalc.sum(realPart, imaginePart);
        logger.log(String.format("Вызова метода sum произошел"));
        return result;
    }

    @Override
    public iCalculable multi(int realPart, int imaginePart) {
        int primaryRealPart = oldCalc.getRealResult();
        int primaryImaginePart = oldCalc.getImagineResult();
        logger.log(String.format("Первое значение калькулятора %d + %di. Начало вызова метода multi с параметром %d + %di", primaryRealPart, primaryImaginePart, realPart, imaginePart));
        iCalculable result = oldCalc.multi(realPart, imaginePart);
        logger.log(String.format("Вызова метода multi произошел"));
        return result;
    }

    @Override
    public int getRealResult() {
        int result = oldCalc.getRealResult();
        logger.log(String.format("Получение действительного результата результата %d", result));
        return result;
    }

    @Override
    public int getImagineResult() {
        int result = oldCalc.getImagineResult();
        logger.log(String.format("Получение мнимого результата %di", result));
        return result;
    }
}
