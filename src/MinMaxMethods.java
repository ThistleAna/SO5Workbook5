// 1. Import java scanner
import java.util.Scanner;
public class MinMaxMethods {
    // main method start
    public static void main(String[] args) {
        // 2. create scanner object/instance
         Scanner reader= new Scanner (System.in);
        // 3. ask user to enter num1
        System.out.println("Enter first number: ");
        // 4. read user input num1
        int num1 = reader.nextInt();
        // 5. ask user to enter
        System.out.println("Enter number 2 : ");
        // 6. read user input num2
        int num2 = reader.nextInt();
        // 7. ask user to enter num3
        System.out.println("Enter number 3 : ");
        // 8. read user input num3
        int num3 = reader.nextInt();

        // print the biggest number
        System.out.println("You have entered " + num1 + ", " + num2 + " ," + num3 + ".");
        System.out.println("The biggest number is " + maxMethod (num1, num2, num3));
        // print the smallest number
        System.out.println("The smallest number is " + minMethod (num1, num2, num3));

    } // main method ends

    // create method to find the biggest number
    static int maxMethod(int a, int b, int c){
        if (a > b && a > c) {
            return a; // scenario when a is the biggest
        } else if ( b > a && b > c) {
            return b; // scenario when b is the biggest
        } else {
            return c;
        }
    }

    // create method to find the smallest number
    static int minMethod(int a, int b, int c){
        if (a < b && a < c) {
            return a; // scenario when a is the biggest
        } else if ( b < a && b < c) {
            return b; // scenario when b is the biggest
        } else {
            return c;
        }
    }
}
