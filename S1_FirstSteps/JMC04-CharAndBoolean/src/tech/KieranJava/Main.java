package tech.KieranJava;

public class Main {

    public static void main(String[] args) {

        // char: SINGLE character (A-z, 1-0)
            // char is 2 bytes (allows for Unicode character ~65535 characters)
            // created inside single quote (`''`)
        char myChar = 'D';
        System.out.println(myChar);

        char myUnicodeChar = '\u0044'; // 'D' in unicode
        System.out.println(myUnicodeChar);

        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        // boolean: true/false, yes/no values
            // commonly has `is` in the name for readability
        boolean isCxOver18 = true;
        System.out.println(isCxOver18);

        


    }
}
