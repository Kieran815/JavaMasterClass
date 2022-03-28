package tech.KieranJava;

public class Main {

//    Primitive Data Type Sizes
//    byte = 8 bits
//    short = 16 bits
//    int = 32 bits

    public static void main(String[] args) {

//        Primitive Data Types: Building Blocks of Data Manipulation
//        boolean, byte, char, short, int, long, float, & double

        int myValue = 10000;

//        Wrapper Class: type classes that allow additional operations on basic data types.
        // Ex: Integer (below)
        int myMinIntValue = Integer.MIN_VALUE; // -2_147_483_648
        System.out.println("Integer Min Value = " + myMinIntValue);
        int myMaxIntValue = Integer.MAX_VALUE; // 2_147_483_647
        System.out.println("Integer Max Value = " + myMaxIntValue);

        // OVERFLOW: going over the allotted data size.
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1)); // rolls back to minValue
        // UNDERFLOW: going under the allotted data size
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1)); // roll over to maxValue

//        int myMaxIntTest = 2147483648;
//        will output error
//        java: integer number too large

        byte myMinByteValue = Byte.MIN_VALUE;
        System.out.println("Min Byte Value = " + myMinByteValue);
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Max Byte Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        System.out.println("Min Short Value = " + myMinShortValue);
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Max Short Value = " + myMaxShortValue);

        long myLongValue = 100L; // L: Read data as `long`
        long myMinLongValue = Long.MIN_VALUE;
        System.out.println("Min Long Value = " + myMinLongValue);
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Max Long Value = " + myMaxLongValue);

        // below will throw error:
            // default number type is `int`
//        long bigLongLiteralValue = 2_147_483_647_234;

        // add 'L' to denote 'long' number type
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        // shorts automatically interpereted as `short` as long as num is in range
        short bigShortLiteralValue = 32767;

//        *** ARITHMETIC AND CASTING ***

        // math operators work like normal
        int myTotal = (myMinIntValue / 2);

        // *** CASTING ***
            // Note: Java uses `int` by default for numbers
        // use CASTING to convert data types:
            // below statement will read `myNewByteValue` as `int` unless Cast/Converted to `byte`
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        System.out.println("My New Byte Value " + myNewByteValue);
        short myNewShortValue = (short) (myMinShortValue / 2);
        System.out.println("My New Short Value: " + myNewShortValue);

        byte practiceByte = 120;
        short practiceShort = 30000;
        int practiceInt = 1_000_000_000;
        long practiceLong = 50_000 + (10 * (practiceByte + practiceShort + practiceInt));
        System.out.println("Practice Long Output: " + practiceLong);
        System.out.println(practiceLong);
    }
}