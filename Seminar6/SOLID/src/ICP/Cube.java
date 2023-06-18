package ICP;
public class Cube implements AreaShape, VolumeShape{
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }
    @Override
    public double area() {
        return 6*edge*edge;     // площадь куба
    }
    @Override
    public double volume() {
        return edge*edge*edge;  // объем куба
    }
}
