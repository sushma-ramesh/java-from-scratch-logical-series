public class Car1 implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting Car...");
    }

    @Override
    public int getSpeed() {
        return 100;
    }
}
