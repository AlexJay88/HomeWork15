public abstract class AutomaticVehicles extends Vehicle {

    public AutomaticVehicles(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    private void checkEngine(){
        System.out.println("Проверяем двигатель");
    }

    @Override
    public void service() {
        super.service();
        checkEngine();
    }
}




