package inheritance;

public class RoadVehicle extends Vehicle {

    public void travelOnRoad() {
        System.out.println("These vehicles travels on road");
    }

    @Override
    public void start() {
        System.out.println("Road Vehicle has started");
    }

    @Override
    public void stop() {
        System.out.println("Road Vehicle has stopped");
    }

    @Override
    public void fuel() {
        System.out.println("Road Vehicle has fueled");
    }

}
