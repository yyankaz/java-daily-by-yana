package Task8.PalindromeCheck;

public class PalindromeCheckMain {

    public static boolean isPalindrome(String input) {
        //delete spaces and remake case of sentence
        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        //create two variables which hold numbers of fist and last symbols
        int left = 0;
        int right = cleaned.length() - 1;

        //loop which checking symbols equality
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }

            //variables modifier
            left++;
            right--;
        }

        return true;
    }
}
