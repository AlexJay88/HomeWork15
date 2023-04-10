public abstract class Vehicle implements Diagnostic {
    private String modelName;
    private int wheelsCount;

    public Vehicle(String modelName,
                   int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }


    private void updateTyres() {
        for (int i = 0; i < wheelsCount; i++) {
            updateTyre();

        }
    }

    @Override
    public void service() {
        System.out.println("обслуживаем "+modelName);
        updateTyres();

    }
}










