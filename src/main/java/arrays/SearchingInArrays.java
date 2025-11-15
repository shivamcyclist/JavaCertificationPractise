package arrays;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        int[] numbers = {0, 2, 4, 6, 8, 10};
        int indexOfEight = Arrays.binarySearch(numbers,8);
        System.out.println("Index of eight in the array is: " + indexOfEight);

        int indexOfSeven = Arrays.binarySearch(numbers,7);
        System.out.println("Index of seven in the array is: " + indexOfSeven);
    }
}
