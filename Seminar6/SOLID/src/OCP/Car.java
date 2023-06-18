package OCP;
public class Car extends Vehicle{
    private static int maxSpeed;
    public Car(String type, int maxSpeed) {
        super(type);
        this.maxSpeed = maxSpeed;
    }
    public static int getMaxSpeed() {
        return maxSpeed;
    }
}
