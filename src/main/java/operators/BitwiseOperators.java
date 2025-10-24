package operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        System.out.println("-------------Bitwise & operator---------------");

        int num1 = 9; //1001
        int num2 = 8; //1000
        //1000
        System.out.println("num1 to binary: " + Integer.toBinaryString(num1));
        System.out.println("num2 to binary: " + Integer.toBinaryString(num2));
        System.out.println("num1 & num2 to binary: " + Integer.toBinaryString(num1 & num2));
        System.out.println("num1 & num2 to decimal: " + (num1 & num2));

        System.out.println("-------------Bitwise inclusive OR (|) operator---------------");

        int num3 = 9; //1001
        int num4 = 8; //1000
        //1001
        System.out.println("num3 to binary: " + Integer.toBinaryString(num3));
        System.out.println("num4 to binary: " + Integer.toBinaryString(num4));
        System.out.println("num3 & num4 to binary: " + Integer.toBinaryString(num3 | num4));
        System.out.println("num3 & num4 to decimal: " + (num3 | num4));

        System.out.println("-------------Bitwise exclusive OR (^) operator---------------");

        int num5 = 9; //1001
        int num6 = 8; //1000
        //0001 //Calculates and gives 1 if the digits being compared are diff, and gives 0 if they are same
        System.out.println("num5 to binary: " + Integer.toBinaryString(num5));
        System.out.println("num6 to binary: " + Integer.toBinaryString(num6));
        System.out.println("num5 & num6 to binary: " + Integer.toBinaryString(num5 ^ num6));
        System.out.println("num5 & num6 to decimal: " + (num5 ^ num6));

        System.out.println("---------------Signed Left Shift Operator << -----------------");

        int num7 = 9; //1001 << 2 -> 100100 -> 36 in decimal

        System.out.println("num7 to binary: " + Integer.toBinaryString(num7));
        System.out.println("bitwise left shift 2 on num7 in binary : " + Integer.toBinaryString(num7 << 2));
        System.out.println("bitwise left shift 2 on num7 in decimal : " + (num7 << 2));

        System.out.println("---------------Signed Right Shift Operator >> -----------------");

        int num8 = 9; //1001 >> 2 -> 10 -> 2 in decimal

        System.out.println("num8 to binary: " + Integer.toBinaryString(num8));
        System.out.println("bitwise right shift 2 on num8 in binary : " + Integer.toBinaryString(num8 << 2));
        System.out.println("bitwise right shift 2 on num8 in decimal : " + (num8 >> 2));

        System.out.println("---------------Unary Bitwise complement operator ~ -----------------");

        int num9 = 9; //1001 >> 2 -> 10 -> 2 in decimal

        System.out.println("num9 to binary: " + Integer.toBinaryString(num9));
        System.out.println("unary bitwise compliment operator on num9 in binary : " + Integer.toBinaryString(~num9));
        System.out.println("unary bitwise compliment operator on num9 in decimal : " + (~num9));
    }
}
