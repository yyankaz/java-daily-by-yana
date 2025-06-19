package Task5.RemoveDuplicates;

import java.util.Arrays;

public class RemoveDuplicatesMain {
    public static int[] removeDuplicates(int[] array) {
        return Arrays.stream(array)
                //decided to use stream API for this task
                .distinct()
                .toArray();
    }
}
