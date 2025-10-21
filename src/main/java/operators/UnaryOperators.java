package operators;

public class UnaryOperators {

    public static void main(String[] args) {

        double number = 5.4;
        boolean check = false;

        System.out.println("+number =" + +number);
        System.out.println("-number =" + -number);
        System.out.println("++number =" + ++number);
        System.out.println("--number =" + --number);
        System.out.println("!check =" + !check);

        System.out.println("--------------------------");

        double result = 4.7;
        System.out.println("result =" + result);
        System.out.println("++result =" + ++result);
        System.out.println("result =" + result);
        System.out.println("result++ =" + result++);
        System.out.println("result =" + result);
    }
}
