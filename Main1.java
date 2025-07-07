public class Main1 {
    public static void main(String[] args) {
        Vehicle bike = new Bike();
        bike.start();
        System.out.println("Speed: " + bike.getSpeed() + " km/h");

        System.out.println();

        Vehicle car1 = new Car1();
        car1.start();
        System.out.println("Speed: " + car1.getSpeed() + " km/h");
    }
}
