package operators;

public class AssignmentOperator {

    public static void main(String[] args) {

        int x = 20, y = 15, z = 0;

        z = x + y;//Simple assignment Operator
        System.out.println("z = x + y gives " + z);

        z += x;//Add and assignment operator
        System.out.println("z += x gives " + z);

        z -= x;//Simple assignment Operator
        System.out.println("z -= x gives " + z);

        z *= x;//Simple assignment Operator
        System.out.println("z *= x gives " + z);

        z /= x;//Simple assignment Operator
        System.out.println("z /= x gives " + z);

        z %= x;//Simple assignment Operator
        System.out.println("z %= x gives " + z);


    }
}
