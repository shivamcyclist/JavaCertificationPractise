package arrays;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {

        System.out.println("-------------Sorting double array------------");

        double[] firstArray = {2.3, 11.0, 4.6, -3.6, 0.8, 12};
        System.out.println("Unsorted Array: " + Arrays.toString(firstArray));
        Arrays.sort(firstArray);
        System.out.println("Sorted Array: " + Arrays.toString(firstArray));

        System.out.println("-------------Sorting int array------------");

        int[] secondArray = {1, 3, -5, 10, 2, 15, 9};
        System.out.println("Unsorted Array: " + Arrays.toString(secondArray));
        Arrays.sort(secondArray);
        System.out.println("Sorted Array: " + Arrays.toString(secondArray));

        System.out.println("-------------Sorting char array------------");

        char[] thirdArray = {'A', 'd', 'E', 'z', 'e', 'y', 'Y'};
        System.out.println("Unsorted Array: " + Arrays.toString(thirdArray));
        Arrays.sort(thirdArray);
        System.out.println("Sorted Array: " + Arrays.toString(thirdArray));

    }
}
