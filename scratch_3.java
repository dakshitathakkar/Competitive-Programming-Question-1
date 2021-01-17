import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

class Question1 {
    // Please try not to change anything in this method.
    public static void main(String[] args) {
        int[] numbers = new int[15];
        addRandomNumbers(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println(findPairs(numbers, 10));
        //findPairs(numbers, 10);
    }

    // Please try not to change anything in this method.
    public static void addRandomNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt() % 10;
        }
    }


    // Try to complete this method.
    public static HashMap<Integer, Integer> findPairs(int[] numbers, int desiredSum) {

        Arrays.sort(numbers);
        HashMap<Integer, Integer> pairsList = new HashMap<>();

        int firstPointer = 0;
        int secondPointer =  numbers.length - 1;
        while(firstPointer < secondPointer){
            int sum = numbers[firstPointer] + numbers[secondPointer];
            //System.out.println(sum);
            if(sum == desiredSum){
                pairsList.put(numbers[firstPointer], numbers[secondPointer] );
                firstPointer++; secondPointer--;
            }
            else if(sum<desiredSum){
                firstPointer++;
            }
            else{
                secondPointer--;
            }
        }
        /*
        List keys = new ArrayList(pairsList.keySet());
        List values = new ArrayList(pairsList.values());

        return keys;

         */
        //System.out.println(pairsList);
        return pairsList;
    }


}