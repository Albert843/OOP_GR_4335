package OCP;
public class Bus extends Vehicle{
    private static int maxSpeed;
    public Bus(String type, int maxSpeed) {
        super(type);
        this.maxSpeed = maxSpeed;
    }
    public static int getMaxSpeed() {
        return maxSpeed;
    }
}
