public class SquarePrinter {

    
    public static void printSquare(int number) {
        int square = number * number; 
        System.out.println("Square of " + number + " is " + square);
    }

    public static void main(String[] args) {
        printSquare(5); 
    }
}
