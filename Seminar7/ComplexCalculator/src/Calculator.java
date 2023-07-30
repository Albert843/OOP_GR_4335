public class Calculator implements iCalculable{
    private int primaryRealPart;
    private int primaryImaginePart;
    public Calculator(int primaryRealPart, int primaryImaginePart){
        this.primaryRealPart = primaryRealPart;
        this.primaryImaginePart = primaryImaginePart;
    }
    @Override
    public iCalculable sum(int realPart, int imaginePart) {
        primaryRealPart += realPart;
        primaryImaginePart += imaginePart;
        return this;
    }
    @Override
    public iCalculable multi(int realPart, int imaginePart) {
        primaryRealPart *= realPart;
        primaryImaginePart *= imaginePart;
        return this;
    }
    @Override
    public int getRealResult() {
        return primaryRealPart;
    }
    @Override
    public int getImagineResult() {
        return primaryImaginePart;
    }
}