package codewars.seven_kyu;

//An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string
// that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
//
//Example: (Input --> Output)
//
//"Dermatoglyphics" --> true
//"aba" --> false
//"moOse" --> false (ignore letter case)

public class Isograms {
    public static boolean isIsogram(String str) {
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j ++){
                if(String.valueOf(str.charAt(i)).equalsIgnoreCase(String.valueOf(str.charAt(j)))){
                    return false;
                }
            }
        }
        return true;
    }
}
