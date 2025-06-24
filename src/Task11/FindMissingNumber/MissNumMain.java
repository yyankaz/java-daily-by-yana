package Task11.FindMissingNumber;

public class MissNumMain {
    public static int findMissing(int[] nums) {
        int xorAll = 0;
        int xorArray = 0;

        for (int i = 1; i <= nums.length + 1; i++) {
            xorAll ^= i;
        }

        for (int num : nums) {
            xorArray ^= num;
        }

        return xorAll ^ xorArray;
    }
}
