// Question 9
import java.math.BigInteger;

// Fibonacci series program
public class FibonacciCalc {
    // create method to pass on the sequence of the Fibonacci series
    public static void fibonacci (int counter){
        // to get the next sequence add the first two number together
        BigInteger num1 = BigInteger.valueOf(0);
        BigInteger num2 = BigInteger.valueOf(1);
        BigInteger nextNum = BigInteger.valueOf(0); // 0 1 1 2
        System.out.println(num1);
        System.out.println(num2);
        for (int i=1; i< counter; i++) {
            nextNum = num1.add(num2); // 0+1 = 1
            num1 = num2; // update num1 to the next number in the sequece
            num2 = nextNum; // update num2 to the new value that we get previously
            System.out.println(nextNum);
        }

    }

    // main method
    public static void main(String[] args) {
        fibonacci(100); // 0 1 1 2 3

    }
}
// your turn : print the first 10 fibonacci series
// your turn : print the first 50 fibonacci series- HINT: use long dataType
// extension : print the first 100 fibonacci series- HINT : use BigInteger class
