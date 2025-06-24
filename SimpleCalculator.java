public class SimpleCalculator {

	public static int add(int a, int b) {
	    return a + b;
	}

	public static int multiply(int a, int b) {
	    return a * b;
	}

	public static int power(int base, int exponent) {
	    int result = 1;
	    for (int i = 1; i <= exponent; i++) {
	        result *= base;
	    }
	    return result;
	}


    public static void main(String[] args) {
        System.out.println("Addition: " + add(10, 5));
        System.out.println("Multiplication: " + multiply(3, 4));
        System.out.println("Power: " + power(2, 3)); // Should return 8
    }
}
