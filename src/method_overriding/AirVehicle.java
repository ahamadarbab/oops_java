package method_overriding;

public class AirVehicle extends Vehicle {

    public void travelInAir() {
        System.out.println("These vehicles travel in air");
    }

    @Override
    public void start() {
        System.out.println("Air Vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Air Vehicle has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Air Vehicle has fueled");
    }
}
