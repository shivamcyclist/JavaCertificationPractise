package arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] numArray = new int[5];

        numArray[0] = 1;
        numArray[1] = 2;
        numArray[2] = 3;
        numArray[3] = 4;
        numArray[4] = 5;

        int result = numArray[0] + numArray[1] + numArray[2] + numArray[3] + numArray[4];

        System.out.println(result);
        System.out.println(Arrays.toString(numArray));
        System.out.println(numArray.length);

        int[] numArray2 = {-5, 4, 3, 2, 7};
        System.out.println("before altering: " + Arrays.toString(numArray2));
        numArray2[3] = 8;
        System.out.println("after altering: " + Arrays.toString(numArray2));

        Object[] mixedArray = {3, 2.5, "Endurance", 'a', false};
        System.out.println("A mixed object array: " + Arrays.toString(mixedArray));
    }
}
