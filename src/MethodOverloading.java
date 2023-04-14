public class MethodOverloading {
    //int myMethod(int x, int y)
    //double myMethod(double x, double y)
    //float myMethod(float x, float y)

    static int myMethod(int x, int y) {
        return x + y;
    }


    // overload the method with different datatypes
    static double myMethod (double x, double y) {
        return x+y;
    }

    // main
    public static void main(String[] args) {
        // call the method
        int num1 = myMethod(23, 7);
        double num2 = myMethod (23.67, 34.579);
        // your turn, pass on 8 and 5, print them
        
        System.out.println(num1);
        System.out.println(num2);
    }
}
