package ICP;
public class Circle implements AreaShape{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return 2*3.14*radius;   // площадь круга
    }
}
