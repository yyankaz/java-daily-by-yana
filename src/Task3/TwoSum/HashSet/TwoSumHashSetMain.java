package Task3.TwoSum.HashSet;

import java.util.HashSet;

public class TwoSumHashSetMain {
    public static void main(String[] args){

    }

    public static boolean hasTwoSum(int[] array, int a){
        //create empty HashSet
        HashSet<Integer> hashSet = new HashSet<>();

        //start for-each-cycle that have to check every array's element
        for(int num : array){

            //create variable that will save difference between target "a" and each element
            int difference = a - num;

            //start checking if HashSet contains this value
            if(hashSet.contains(difference)){
                return true;
            }

            //adding each element to HashSet step-by-step
            hashSet.add(num);
        }
        return false;
    }
}
