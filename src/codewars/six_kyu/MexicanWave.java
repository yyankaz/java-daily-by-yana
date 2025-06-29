package codewars.six_kyu;

//Task
//In this simple Kata your task is to create a function that turns a string into a Mexican Wave.
// You will be passed a string and you must return an array of strings where an uppercase letter is a person standing up.
//
//Rules
//1.  The input string will always consist of lowercase letters and spaces, but may be empty,
// in which case you must return an empty array.
// 2.  If the character in the string is whitespace then pass over it
// as if it was an empty seat

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {
        String[] array = new String[]{};
        List<String> list = new ArrayList<>(Arrays.asList(array));
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if (c == ' ') continue;
            String value = str.substring(0, i) +
                    Character.toUpperCase(c) +
                    str.substring(i + 1);
            list.add(value);
        }
        return list.toArray(new String[0]);
    }

}


