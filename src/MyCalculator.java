// Workbook methods, Q.10
// import scanner
import java.util.Scanner;

public class MyCalculator {

    //create a method to add two numbers
    static int addMethod(int x, int y) {
        return x+y;
    }
    //create a method to subtract two numbers
    static int subtractMethod(int x, int y) {
        return x-y;
    }
    //create a method to multiply two numbers
    static int multiplyMethod( int x, int y){
        return x* y;
    }
    //create a method to divide two numbers
static int divideMethod(int x, int y){
        return x/y;
}

    // main method
    public static void main(String[] args) {
        // create scanner object
        Scanner reader = new Scanner(System.in);
        // ask user to enter the first number, create integer variable num1 to read this input
        System.out.println("Enter the first number : ");
        int num1 = reader.nextInt();
        // ask user to enter second number, create integer variable num2 to read this input
        System.out.println("Enter the second number : ");
        int num2 = reader.nextInt();

        // method calls to add, subtract, multiply and divide the numbers, print the result
        System.out.println("Result of addition : " + addMethod(num1, num2));
        System.out.println("Results of subtraction : " + subtractMethod(num1, num2));
        System.out.println("Result of multiplication: " + multiplyMethod(num1 , num2));
        System.out.println("Result of division: " +divideMethod(num1, num2));

    }
}
