package tech.KieranJava;

public class Main {

    public static void main(String[] args) {
    // operator: math/arithmetic symbols +-*/% etc
	// Operand: object that is manipulated by an operator
    // Expression: combined variables, literals, method return values, and operators

        int result = 1 + 2; // 3
        System.out.println("1 + 2 = " + result);

        int prevResult = result; // `prevResult` value is equal to CURRENT value of `result`;
        System.out.println("Previous Result: " + prevResult);

        result = result - 1;
        System.out.println("New Result of 3 - 1 = " + result);

        System.out.println("PrevResult value is independent of result value: " + prevResult);

        result = result * 10;
        System.out.println("New Result of 2 * 10 = " + result);

        result = result / 5;
        System.out.println(result);

        result = result % 3;
        System.out.println("Mod Result: 4 % 3 = " + result);


        // Abbreviating Operators
        // increment
        result++;
        System.out.println(result);

        // decrement
        result--;
        System.out.println(result);

        // increment by integer
        result += 2;
        System.out.println(result);

        // decrement by integer
        result -= 2;
        System.out.println(result);

        result *= 10;
        System.out.println(result);

        result /= 10;
        System.out.println(result);

    }
}
