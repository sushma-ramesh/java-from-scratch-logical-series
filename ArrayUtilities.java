public class ArrayUtilities {

    // Resize array by adding a new element at the end
    public static int[] resize(int[] arr, int newElement) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = newElement;
        return newArr;
    }

    // Remove all occurrences of a specific element from the array
    public static int[] remove(int[] arr, int target) {
        int count = 0;

        // Count how many times target occurs
        for (int value : arr) {
            if (value == target) {
                count++;
            }
        }

        // Create new array with adjusted size
        int[] newArr = new int[arr.length - count];
        int index = 0;

        for (int value : arr) {
            if (value != target) {
                newArr[index++] = value;
            }
        }

        return newArr;
    }

    // Print frequency of each element manually
    public static void frequency(int[] arr) {
        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                System.out.println(arr[i] + " appears " + count + " times.");
            }
        }
    }

    //  method to print array
    public static void printArray(int[] arr) {
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
    }

    // Main method to test all features
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 4, 5, 3};

        // Resize
        arr = resize(arr, 6);
        System.out.print("Resized: ");
        printArray(arr);

        // Remove
        int[] removed = remove(arr, 3);
        System.out.print("After removing 3: ");
        printArray(removed);

        // Frequency
        System.out.println("Frequency:");
        frequency(arr);
    }
}
