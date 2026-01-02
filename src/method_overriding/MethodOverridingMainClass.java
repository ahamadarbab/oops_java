package method_overriding;

public class MethodOverridingMainClass {
    public static void main(String[] args) {

        System.out.println("-----------Vehicle parent class------------");
        Vehicle vehicle1 = new Vehicle();
        vehicle1.start();
        vehicle1.stop();
        vehicle1.fuel();

        System.out.println("----------Water Vehicle child class------------");
        WaterVehicle watervehicle1 = new WaterVehicle();
        watervehicle1.travelOnWater();
        watervehicle1.start();
        watervehicle1.stop();
        watervehicle1.fuel();

        System.out.println("-----------Air Vehicle child class-----------");
        AirVehicle airVehicle1 = new AirVehicle();
        airVehicle1.travelInAir();
        airVehicle1.start();
        airVehicle1.stop();
        airVehicle1.fuel();

        System.out.println("-----------Road Vehicle child class----------");
        RoadVehicle roadVehicle1 = new RoadVehicle();
        roadVehicle1.travelOnRoad();
        roadVehicle1.start();
        roadVehicle1.stop();
        roadVehicle1.fuel();
    }
}
