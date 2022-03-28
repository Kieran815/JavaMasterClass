package tech.KieranJava;

public class Main {

    public static void main(String[] args) {
//    Basic Data Types:
	// byte
    // short
    // int
    // long
    // float
    // double
    // char
    // boolean

//  **** STRINGS ****
//        String: Sequence of Characters,
//        String is actually a CLASS, not just a primitive data type
        String myString = "What's Good, Son?!?!";
        System.out.println("My String: " + myString);

        // you can append strings and update the value:
        myString = myString + " How's it Going?";
        System.out.println("My Appended String: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Numbers Inside Strings are Treated as Strings. Math operators do not work on strings: " + numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("Numbers added to strings are appended/concatenated to the string: " + lastString);

//        ***** NOTE: Strings are IMMUTABLE (can't be changed)
        // instead, the old string is copied and the changes are made, then the new updated string is saved (original string is discarded)
    }
}
