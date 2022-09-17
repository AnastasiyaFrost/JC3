public abstract class Vehicle implements Repair{
    protected String modelName;
    protected int wheelsCount;

    public Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        for (int i = 1; i <= wheelsCount; i++) {
            System.out.println("Меняем покрышку.");
        }
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}