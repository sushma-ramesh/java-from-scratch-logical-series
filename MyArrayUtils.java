public class MyArrayUtils {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int findSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void findDuplicates(int[] arr) {
        System.out.println("Duplicates:");
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("No duplicates found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 2, 9, 4, 5};

        printArray(arr);
        System.out.println("Sum: " + findSum(arr));
        System.out.println("Max: " + findMax(arr));
        
        findDuplicates(arr);
    }
}
