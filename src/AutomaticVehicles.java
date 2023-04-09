public abstract class AutomaticVehicles extends Vehicle {

    public AutomaticVehicles(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void getEngine() {
        System.out.println("У транспортного средства есть двигатель ");
    }
    @Override
    public void updateTyre() {
        super.updateTyre();
    }

    }

