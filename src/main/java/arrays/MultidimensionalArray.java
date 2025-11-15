package arrays;

import java.util.Arrays;

public class MultidimensionalArray {

    public static void main(String[] args) {

        int[][] twoDimArray = new int[3][3];
        twoDimArray[0][0] = 0;
        twoDimArray[0][1] = 1;
        twoDimArray[0][2] = 2;
        twoDimArray[1][0] = 3;
        twoDimArray[1][1] = 4;
        twoDimArray[1][2] = 5;
        twoDimArray[2][0] = 6;
        twoDimArray[2][1] = 7;
        twoDimArray[2][2] = 8;

        System.out.println("Two Dimensional Array: " + Arrays.toString(twoDimArray));
        System.out.println(Arrays.toString(twoDimArray[0]));//Prints the elements of first 1D array
        System.out.println(Arrays.toString(twoDimArray[1]));//Prints the elements of second 1D array
        System.out.println(Arrays.toString(twoDimArray[2]));//Prints the elements of third 1D array

        int ages[][] = {
                {5,20},
                {51,52,28,21},
                {28}
        };

        System.out.println("Ages array: " + Arrays.toString(ages));
        System.out.println(Arrays.toString(ages[0]));//Prints the elements of first 1D array
        System.out.println(Arrays.toString(ages[1]));//Prints the elements of second 1D array
        System.out.println(Arrays.toString(ages[2]));//Prints the elements of third 1D array

        System.out.println("-----------------Working with 3D arrays----------------");

        char threeDimArray[][][] = {
                {
                        {'a','b','c'},
                        {'d'}
                },
                {
                        {'e','f','g'}
                }
        };

        System.out.println("Three Dimensional Array: " + Arrays.toString(threeDimArray));
        System.out.println("First Two Dimensional Array: " + Arrays.toString(threeDimArray[0]));
        System.out.println("Second Two Dimensional Array: " + Arrays.toString(threeDimArray[1]));
        System.out.println("First one dim array of first two D array:" + Arrays.toString(threeDimArray[0][0]));
        System.out.println("Second one dim array of first two D array:" + Arrays.toString(threeDimArray[0][1]));
        System.out.println("First one dim array of second two D array:" + Arrays.toString(threeDimArray[1][0]));

    }
}
