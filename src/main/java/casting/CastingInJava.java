package casting;

public class CastingInJava {

    public static void main(String[] args) {

        int a = 124;
        long b = a;
        double d = b;

        System.out.println("Integer value: " + a);
        System.out.println("Long value: " + b);
        System.out.println("Double value: " + d);

        double dbl = 135.35;
        long lng = (long) dbl;
        byte byt = (byte) lng;//data loss happened here

        System.out.println("double value: " + dbl);
        System.out.println("long value: " + lng);
        System.out.println("byte value: " + byt);//converting a very large number to a very small number
    }
}
