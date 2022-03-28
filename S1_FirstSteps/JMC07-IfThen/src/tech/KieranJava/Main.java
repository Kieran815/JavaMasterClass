package tech.KieranJava;

public class Main {

    public static void main(String[] args) {
	// If/Then Conditionals

        boolean isAlien = false;
        // `==` means `Strictly Equals To`

        // `if` statements w/o a code block (`{}`) will only trigger the next line of an if/else statement
            // anything past that next line will run as independent code
        if (isAlien == true)
            System.out.println("Not an Alien..."); // won't run (next line)
            System.out.println("Aliens ain't Shit!!!"); // will run (code past prev line)

        if (isAlien == false) { // will evaluate and run ALL lines inside code block
            System.out.println("Not an Alien...");
            System.out.println("Aliens ain't Shit!!!");
        }


        // Logical Operators
        int topScore = 90;
        // `>=` greater than or equal to
        if (topScore >= 100) {
            System.out.println("You Got the Top Score!!!");
        }

        int secondTopScore = 80;

        // && requires all connected statements to be true
        if (topScore < 100 && topScore > secondTopScore) {
            System.out.println("You Took Second Place");
        }

        // || only requires one of the connected statements to be true
        if (topScore > 80 || topScore < 91) {
            System.out.println("Keep Playing!!!");
        }

        // **** TERNARY OPERATOR

        boolean isCar = false;
        boolean wasCar = isCar ? true : false;


        // Operator Challenge:
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double sumTimesHundred = 100d * (firstDouble + secondDouble);
        double sumRemainder = sumTimesHundred % 40.00d;

        boolean isRemainder = sumRemainder == 0 ? true : false;

        if (!isRemainder) {
            System.out.println("Got Some Remainder: " + sumRemainder);
        }

    }
}
