public class Car extends AutomaticVehicles {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }


    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void getRepair(){

        checkEngine();
        getEngine();


    }


}
