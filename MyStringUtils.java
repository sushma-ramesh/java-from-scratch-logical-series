public class MyStringUtils {

    public static String reverse(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static int findLength(String input) {
        int count = 0;
        try {
            while (true) {
                input.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // do nothing
        }
        return count;
    }

    public static boolean equalsIgnoreCase(String a, String b) {
        if (a.length() != b.length()) return false;

        for (int i = 0; i < a.length(); i++) {
            char ca = a.charAt(i);
            char cb = b.charAt(i);

            if (ca == cb) continue;

            if (ca >= 'A' && ca <= 'Z') ca = (char)(ca + 32);
            if (cb >= 'A' && cb <= 'Z') cb = (char)(cb + 32);

            if (ca != cb) return false;
        }
        return true;
    }

    public static String toUpperCase(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String input = "Hello";
        System.out.println("Reversed: " + reverse(input));
        System.out.println("Length: " + findLength(input));
        System.out.println("Equals Ignore Case: " + equalsIgnoreCase("java", "JAVA"));
        System.out.println("Uppercase: " + toUpperCase("java"));
    }
}
