import java.util.Scanner;

public class ExceptionDemo {

    // Method that checks age and throws CustomException
    public static void validateAge(int age) throws CustomException {
        if (age <= 0) {
            throw new CustomException("InvalidAgeException: Age must be positive");
        } else {
            System.out.println("Valid age: " + age);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();

            validateAge(age);

        } catch (CustomException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println("Something went wrong: " + e.getMessage());

        } finally {
            System.out.println("Age validation complete.");
        }

        sc.close();
    }
}
