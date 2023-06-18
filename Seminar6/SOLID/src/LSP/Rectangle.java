package LSP;
public class Rectangle extends Square{
    /**
     * класс наследник
     */
    private int heigth;
    public int getHeigth(){
        return heigth;
    }
    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }
    public int area() {
        return super.getWidth() * this.heigth;
    }
}
