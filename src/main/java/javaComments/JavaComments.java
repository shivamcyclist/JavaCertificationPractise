package javaComments;

public class JavaComments {
    public static void main(String[] args) {
        //This is a single line comment in java
        //This line prints a message.
        System.out.println("Java comments program");

        /*
        int x = 4;
        int y = 5;
        int prod = x * y;

        System.out.println(prod);*/

        doMultiplication(4, 5);
    }

    /**
     * This function multiplies the given two integers.
     * @param x is the first integer
     * @param y is the second integer
     * @return It returns the product of two integers.
     */
    public static int doMultiplication(int x, int y){
        return x * y;
    }
}
