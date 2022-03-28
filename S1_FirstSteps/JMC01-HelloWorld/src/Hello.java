

// Access Modifier: defines scope (if it can be accessed outside the class), i.e. `public`
// define `class` name
public class Hello {

    // static: member belongs to the type itself, rather than an instance of the type
    // void: method won't return any information.

    public static void main(String[] args) {
//        code block is made of statements, like below:
        System.out.println("What's Good!!!");

        int myFirstNumber = 46; // int is integer (num w/ no decimal)
        System.out.println("My First Number is " + myFirstNumber + " and Two.");

//        Java Operators and Variables
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);
    }
}
