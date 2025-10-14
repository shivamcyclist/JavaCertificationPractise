package numbers;

public class NumberConversionsInJava {
    public static void main(String[] args) {
        System.out.println("-------------Octal Number--------------");
        //Octal
        //All Octal numbers range from 0-7
        int octalNumber1 = 015;
        System.out.println(octalNumber1);
        int octalNumber2 = 0104;
        System.out.println(octalNumber2);
        int sumOctalNumbers = octalNumber1 + octalNumber2;
        System.out.println(sumOctalNumbers);
        System.out.println("Converting decimal sum to octal: " + Integer.toOctalString(sumOctalNumbers));

        System.out.println("-------------Hexadecimal Number--------------");

        int hexaDecimal1 = 0x1B0;
        System.out.println(hexaDecimal1);
        int hexaDecimal2 = 0X2F;
        System.out.println(hexaDecimal2);
        int sum = hexaDecimal2 + hexaDecimal1;
        System.out.println(Integer.toHexString(sum));

        System.out.println("-------------Binary Number--------------");

        int binaryNumber1 = 0b1001;
        System.out.println(binaryNumber1);
        int binaryNumber2 = 0b1110;
        System.out.println(binaryNumber2);
        int sumofBinaryNumbers = binaryNumber1 + binaryNumber2;
        System.out.println(Integer.toBinaryString(sumofBinaryNumbers));

    }
}
