package codingTests;

import java.util.Scanner;

public class GetFullNameProgram {

    static String firstName, lastName;

    public static void main(String[] args) {
        System.out.println(getFullName());
    }

    public static String getFullName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        firstName = input.next();
        System.out.println("Enter last name");
        lastName = input.next();
        String fullName = firstName + " " + lastName;
        return fullName;
    }
}
