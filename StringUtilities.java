public class StringUtilities {

    // Check if a string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Check if two strings are anagrams (manually count characters)
    public static boolean isAnagram(String str1, String str2) {
        // If lengths are not equal, not anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to lowercase and store counts
        int[] freq = new int[256]; // Assuming ASCII

        for (int i = 0; i < str1.length(); i++) {
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for (int count : freq) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    // Count number of words in a sentence (manually, no split())
    public static int wordCount(String sentence) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ' && !inWord) {
                count++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        // Palindrome check
        String palindromeTest = "madam";
        System.out.println("Is Palindrome (" + palindromeTest + "): " + isPalindrome(palindromeTest));

        // Anagram check
        String a1 = "listen";
        String a2 = "silent";
        System.out.println("Is Anagram (" + a1 + "/" + a2 + "): " + isAnagram(a1, a2));

        // Word count
        String sentence = "This is a simple sentence";
        System.out.println("Word count: " + wordCount(sentence));
    }
}
