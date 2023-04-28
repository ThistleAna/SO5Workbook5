// 1. Import java scanner
import java.util.Scanner;
public class Question11Part2 {
    // main method start
    public static void main(String[] args) {
        // 2. create scanner object/instance
        Scanner reader= new Scanner (System.in);
        // 3. ask user to enter num1
        System.out.println("Enter first number: ");
        // 4. read user input num1
        double num1 = reader.nextDouble();
        // 5. ask user to enter
        System.out.println("Enter number 2 : ");
        // 6. read user input num2
        double num2 = reader.nextDouble();
        // 7. ask user to enter num3
        System.out.println("Enter number 3 : ");
        // 8. read user input num3
        double num3 = reader.nextDouble();

        // print the biggest number

        if (num1%1==0 && num2%1==0 && num3%1== 0) { // numbers are integers
            System.out.println("The biggest number is " + maxMethod ((int)num1, (int)num2,(int)num3));
            // print the smallest number
            System.out.println("The smallest number is " + minMethod ((int)num1, (int)num2, (int)num3));
        }else { // numbers are double/fraction
            System.out.println("The biggest number is " + maxMethod (num1, num2, num3));
            // print the smallest number
            System.out.println("The smallest number is " + minMethod (num1, num2, num3));
        }





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
        // overload maxMethod to accept double numbers
    static double maxMethod(double a, double b, double c){
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

    // overload minMethod to accept double numbers
    static double minMethod(double a, double b, double c){
        if (a < b && a < c) {
            return a; // scenario when a is the biggest
        } else if ( b < a && b < c) {
            return b; // scenario when b is the biggest
        } else {
            return c;
        }
    }
}
