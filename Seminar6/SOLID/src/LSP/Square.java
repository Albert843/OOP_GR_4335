package LSP;
public class Square {
    /**
     * базовый класс
     */
    private int width;
    public int getWidth(){
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public int area() {
        return this.width * this.width;
    }
}
