public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();  // Parent reference → Parent object
        Animal d = new Dog();     // Parent reference → Child object
        Animal c = new Cat();     // Parent reference → Child object

        a.speak(); 
        d.speak(); 
        c.speak(); 
    }
}
