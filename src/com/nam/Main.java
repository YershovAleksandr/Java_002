package com.nam;

public class Main {

    public static void main(String[] args) {
        // write your code here

        byte mByte;         //8 bits or 1 byte
        short mShort;       //16 bits or 2 bytes
        int mInt;           //32 bits or 4 bytes
        long mLong;         //64 bits or 8 bytes

        float mFloat;       //32 bits
        double mDouble;     //64 bits

        char mChar;         //16 bits Unicode 0 .. 65536

        boolean mBoolean;

        int lightspeed;
        long days;
        long seconds;
        long distance;

        boolean b;

        b = false;
        System.out.println("b = " + b);

        b = true;
        System.out.println("b = " + b);

        if (b)
        {
            System.out.println("true");
        }

        b = !b;

        if (!b)
        {
            System.out.println("false");
        }

        System.out.println("Wtf " + (5 > 1));

        int x = 123_456_789_0;

        System.out.println("X = " + x);

    }
}
