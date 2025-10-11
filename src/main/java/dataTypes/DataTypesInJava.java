package dataTypes;

public class DataTypesInJava {
    public static void main(String[] args) {
        boolean a = true;
        char b = 'b';
        byte c = 12;
        short d = 12345;
        int e = 1234567899;
        long f = 12345678999L;
        float g = 123.12356789f;
        double h = 1234.12345678999999;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        System.out.println("e = "+ e);
        System.out.println("f = "+ f);
        System.out.println("g = "+ g);
        System.out.println("h = "+ h);

        //Extras
        int money = 13_10_484;
        System.out.println("Money = "+ money);
    }
}
