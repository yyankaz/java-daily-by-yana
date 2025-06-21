package Task7.ReverseString;

public class ReverseStringMain {

    public static String reverseString(String input) {
        //create array and put all String symbols on it
        char[] chars = input.toCharArray();

        //create StringBuilder object
        StringBuilder reversed = new StringBuilder();

        //create loop which will add symbols to StringBuilder object
        //in reversed way
        for (int i = chars.length - 1; i >= 0; i--) {
            reversed.append(chars[i]);
        }

        //exception and errors checking
        if (input == null) {
            throw new IllegalArgumentException("Input string cannot be null");
        }
        if (input.isEmpty()) {
            return "";
        }

        //return reversed String
        return reversed.toString();
    }

}
