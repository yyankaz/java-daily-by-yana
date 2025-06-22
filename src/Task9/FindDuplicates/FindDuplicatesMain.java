package Task9.FindDuplicates;

import java.util.HashSet;

public class FindDuplicatesMain {
    public static HashSet<Integer> findDuplicates(int[] array) {
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int num : array) {
            // HashSet does not allow duplicates,
            // so if an array element cannot be added,
            // we can recognize it as a duplicate
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }

        return duplicates;
    }
}
