// method with return keyword
public class Example3 {
    static int plusMethod(int x, int y){
        return x+y;
    }

    static int minMethod(int x, int y){
        return x-y;
    }
    // main method
    public static void main(String[] args) {
        // calling the method with return keyword should be inside print statement
        int sum = plusMethod(4, 6); // add 40 + 50
        int min = minMethod(10, 3); // subtract 100 - 23

        System.out.println(sum);
        System.out.println(min);
    }
}
