package codewars.six_kyu;

//Complete the solution so that it splits the string into pairs of two characters.
// If the string contains an odd number of characters then it should replace the missing second character
// of the final pair with an underscore ('_').
//
//Examples:
//
//* 'abc' =>  ['ab', 'c_']
//* 'abcdef' => ['ab', 'cd', 'ef']

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitStrings {
    public static String[] solution(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }

        List<String> list = new ArrayList<>();
        Matcher matcher = Pattern.compile("..").matcher(s);

        while (matcher.find()) {
            list.add(matcher.group());
        }

        return list.toArray(new String[0]);
    }

}
