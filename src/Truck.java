public class Truck extends AutomaticVehicles {

    public Truck(String modelName,
                 int wheelsCount)
    {
        super(modelName, wheelsCount);
    }
    private void checkTrailer() {
        System.out.println("Проверяем прицеп");

    }

    @Override
    public void service() {
        super.service();
        checkTrailer();
    }
}






