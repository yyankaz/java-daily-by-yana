package Task6.SecondLargestElement;

public class SecondLargestMain {

    public static int secondLargest(int[] array){
        int max = array[0];
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i < array.length - 1; i++){
            if(array[i + 1] > max) {
                secondMax = max;
                max = array[i + 1];
            } else if (array[i + 1] > secondMax && array[i + 1] != max) {
                secondMax = array[i + 1];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element (all elements might be equal).");
        }

        return secondMax;
    }
}
