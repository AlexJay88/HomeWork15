public class Main {
    public static void main(String[] args) {

        ServiceStation serviceStation=new ServiceStation();
        Bicycle bicycle= new Bicycle("bicycle",2);
        Car car=new Car("car",4);
        Truck truck=new Truck("Truck",6);

        serviceStation.check(bicycle);
        serviceStation.check(car);
        serviceStation.check(truck);

    }}




























