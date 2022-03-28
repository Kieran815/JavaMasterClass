package tech.KieranJava;

public class Main {

    public static void main(String[] args) {
	// *** FLOATS AND DOUBLES:
        // precision number types that handle decimals

        // FLOAT is SINGLE PRECISION (to 32 bits)
        // DOUBLE is DOUBLE PRECISION (to 64 bits)

        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("Min Float: " + myMinFloatValue);
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Max Float: " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Min Double: " + myMinDoubleValue);
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Max Double: " + myMaxDoubleValue);

        int myIntValue = 5;
        // division on type `int` will round down if there is a remainder
        System.out.println("My Int Value/3: " + myIntValue / 3);
        // add `f` to cast int as `float`
        float myFloatValue = 5f; // same as (float) 5.25;
        System.out.println("My Float Value/3: " + myFloatValue / 3f);
        
        // add `d` to denote int as `double`
            // **** DOUBLE IS THE DEFAULT STANDARD FOR DECIMAL NUMBERS
            // i.e. - greater accuracy, machines process doubles faster
        double myDoubleValue = 5d;
        System.out.println("My Double Value/3: " + myDoubleValue / 3d);

        // Practice: Pounds to Kilos:
        double lbWeight = 200;
        double lbToKilo = lbWeight * 0.45359237d;
        System.out.println(lbToKilo);

    }
}
