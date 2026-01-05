package method_overriding;

public class WaterVehicle extends Vehicle {

    public void travelOnWater() {
        System.out.println("These vehicles travel on water");
    }

    @Override
    public void start() {
        System.out.println("Water Vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Water Vehicle has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Water Vehicle has fueled");
    }

}
