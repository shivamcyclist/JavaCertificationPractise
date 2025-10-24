package operators;

public class ConditionalOperator {
    public static void main(String[] args) {
        int number1 = 5, number2 = 8, number3 = 12;
        //Conditional && (AND) operator
        boolean result;

        result = (number2 > number1) && (number3 > number1);
        System.out.println("The result is: " + result);

        //Conditional OR(||) operator
        result = (number2 < number1) || (number1 > number3);

        System.out.println("The result is: " + result);

        //Ternary Operator (?:)
        result = number1 > number2 ? true : false;
        System.out.println(result);
    }
}
