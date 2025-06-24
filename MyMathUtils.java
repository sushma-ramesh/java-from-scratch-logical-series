public class MyMathUtils {

 
    public static int absolute(int num) {
        if (num < 0) {
            return -num;  
        } else {
            return num;   
        }
    }

    public static void main(String[] args) {
        System.out.println("Absolute of -10: " + absolute(-10)); // Should print 10
        System.out.println("Absolute of 5: " + absolute(5));     // Should print 5
        System.out.println("Absolute of 0: " + absolute(0));     // Should print 0
    }
}
