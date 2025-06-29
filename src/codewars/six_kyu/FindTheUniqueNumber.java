package codewars.six_kyu;

//There is an array with some numbers. All numbers are equal except for one. Try to find it!
//
//Kata.findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }); // => 2
//Kata.findUniq(new double[]{ 0, 0, 0.55, 0, 0 }); // => 0.55
//
//It’s guaranteed that array contains at least 3 numbers.
//
//The tests contain some very huge arrays, so think about performance.

import java.util.*;
import java.util.stream.Collectors;

public class FindTheUniqueNumber {
    public static double findUniq(double[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(
                        d -> d,
                        Collectors.counting()
                ))
                .entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElseThrow(() -> new NoSuchElementException("Not found"));
    }
}
