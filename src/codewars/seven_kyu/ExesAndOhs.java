package codewars.seven_kyu;

//Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.
//
//Examples input/output:
//
//XO("ooxx") => true
//XO("xooxx") => false
//XO("ooxXm") => true
//XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
//XO("zzoo") => false

public class ExesAndOhs {
    public static boolean getXO (String str) {
        int Ocounter = 0;
        int Xcounter = 0;

        for(int i = 0; i < str.length(); i++){
            String symbol = String.valueOf(str.charAt(i));
            if(symbol.equalsIgnoreCase("x")){
                Xcounter++;
            } else if(symbol.equalsIgnoreCase("o")){
                Ocounter++;
            }
        }

        if(Ocounter == Xcounter){
            return true;
        } else {
            return false;
        }

    }
}
