public class Car {
    private String model;
    private int speed;
    private Person owner;

    // Constructor
    public Car(String model, int speed, Person owner) {
        this.model = model;
        this.speed = speed;
        this.owner = owner;
    }

    // Getters
    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    public Person getOwner() {
        return owner;
    }

    // Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    // Main method to test
    public static void main(String[] args) {
        Person owner = new Person("Priya");
        Car myCar = new Car("Swift", 120, owner);

        System.out.println("Car model: " + myCar.getModel());
        System.out.println("Owner: " + myCar.getOwner().getName());
        System.out.println("Speed: " + myCar.getSpeed() + " km/h");
    }
}
