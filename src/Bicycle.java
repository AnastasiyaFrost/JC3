public class Bicycle extends Vehicle {
    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void repair() {
        System.out.println("Обслуживаем " + this.modelName);
        this.updateTyre();

    }
}
