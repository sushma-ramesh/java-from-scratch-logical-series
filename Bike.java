public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Starting Bike...");
    }

    @Override
    public int getSpeed() {
        return 70;
    }
}
