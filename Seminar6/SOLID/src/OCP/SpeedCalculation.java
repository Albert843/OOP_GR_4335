package OCP;
public class SpeedCalculation {
    public double calculateAllowedSpeed(Vehicle vehicle) {
        if (vehicle.getType().equalsIgnoreCase("Car")) {
            return Car.getMaxSpeed() * 0.8;
        } else if (vehicle.getType().equalsIgnoreCase("Bus")) {
            return Bus.getMaxSpeed() * 0.6;
        }
        //  здесь можно добавлять другие средства передвижения
        return 0.0;
    }
}

