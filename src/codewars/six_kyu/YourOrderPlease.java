package codewars.six_kyu;

//Your task is to sort a given string. Each word in the string will contain a single number.
// This number is the position the word should have in the result.
//
//Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
//
//If the input string is empty, return an empty string.
// The words in the input String will only contain valid consecutive numbers.
//Examples
//
//"is2 Thi1s T4est 3a"  -->  "Thi1s is2 3a T4est"
//"4of Fo1r pe6ople g3ood th5e the2"  -->  "Fo1r the2 g3ood 4of th5e pe6ople"
//""  -->  ""

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class YourOrderPlease {
    public static String order(String words) {
        if (words == null || words.isEmpty()) return "";
        String [] list = words.split(" ");
        Map<Integer, String> someMap = new HashMap<>();
        for (String s : list) {
            Matcher m = Pattern.compile("[1-9]").matcher(s);
            if (m.find()) {
                int position = Integer.parseInt(m.group());
                someMap.put(position, s);
            }
        }
        String result = "";
        for(int i = 1; i <= list.length; i++){
            result += someMap.get(i) + " ";
        }
        return result.trim();
    }

}
