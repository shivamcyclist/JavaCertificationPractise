package BasicInputOutput;

import java.util.Scanner;

public class BasicInputInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Getting Number as an input.
//        System.out.println("Enter a number");
////        int number = input.nextInt();
//        System.out.println("You entered: "+ input.nextInt());
//        input.close();

        //Getting single String as an input.
//        System.out.println("Please enter a word");
//        String word = input.next();
//        System.out.println("You entered: "+ word);
//        input.close();

        //Getting multiple String as an input.
        System.out.println("Please enter multiple words");
        String line = input.nextLine();
        System.out.println("You entered: "+line);
        input.close();
    }
}
