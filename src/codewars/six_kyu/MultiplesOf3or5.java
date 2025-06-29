package codewars.six_kyu;

//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
// The sum of these multiples is 23.
//
//Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
//
//Note: If the number is a multiple of both 3 and 5, only count it once.

import java.util.ArrayList;
import java.util.List;

public class MultiplesOf3or5 {
    public int solution(int number) {
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < number; i++){
            list.add(i);
        }
        List<Integer> newList = list.stream().filter(a -> a % 3 == 0 || a % 5 == 0).toList();
        int sum = 0;
        for(Integer a: newList){
            sum += a;
        }
        return sum;
    }
}
