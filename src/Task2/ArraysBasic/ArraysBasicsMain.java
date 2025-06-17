package Task2.ArraysBasic;

public class ArraysBasicsMain {
    public static void main(String[] args) {
        int[] someArray = {1, 4, 7, 12, 15};
        int target = 19;
        boolean answer = twoPlus(someArray, target);

        System.out.println(answer);
    }

    public static boolean twoPlus(int[] array, int a){
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                int sum = array[i] + array[j];
                if(sum == a) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean twoMinus(int[] array, int a){
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                int diff = array[i] - array[j];
                if(diff == a) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean threePlus(int[] array, int a){
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++) {
                for (int k = j+1; k < array.length; k++) {
                    int sum = array[i] + array[j] + array[k];
                    if (sum == a) {
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public static boolean twoMultiply(int[] array, int a){
        for(int i = 0; i< array.length; i++){
            for(int j = i+1; j< array.length; j++){
                int multiply = array[i] * array[j];
                if(multiply == a) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean twoNearPlus(int[] array, int a){
        for(int i = 0; i< array.length - 1; i++){
            int sum = array[i] + array[i + 1];
            if(sum == a) {
                return true;
            }
        }
        return false;
    }


}