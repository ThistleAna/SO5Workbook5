// parameter passing example

public class Example2 {
    // create new method
    static void myMethod(){ // no parameter passing
        System.out.println("What name is a good name I wonder....");
    }
    static void myMethod(String firstName){ // pass on parameter firstName
        System.out.println(firstName + " Potter");
    }

    // method overloading, pass on two or more parameters with the same method name
    static void myMethod(String firstName, String lastName){ // pass on two parameters
        System.out.println(firstName + " " + lastName);
    }

    static void myMethod(String firstName, String middleName, String lastName){
        System.out.println(firstName + " " + middleName + " " + lastName);
    }
    // this is main method
    public static void main(String[] args) {
        myMethod();// no argument
        myMethod("Harry"); // pass on one argument
        myMethod("James");
        myMethod("Lilly");
        myMethod("Albus", "Dumbledore"); // pass on two arguments
        myMethod("Draco", "Lucius", "Malfoy"); // pass on three arguments

    }
}
