package Task4.TwoSum.HashMap.ReturnIndex;

import java.util.HashMap;

public class ReturnIndex {
    public static int[] twoSum(int[] nums, int target) {
        //create empty HashMap
        HashMap<Integer, Integer> map = new HashMap<>();

        //create cycle for that have to check every array's element
        for (int i = 0; i < nums.length; i++) {

            //create variable that will save difference between target "a" and each element
            //using element's index
            int complement = target - nums[i];

            //start checking if HashSet contains this value
            //and if contains program should return this value with
            //index
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            //adding each element to HashMap step-by-step
            map.put(nums[i], i);
        }

        //exception
        throw new IllegalArgumentException("No two sum solution");
    }
}
