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

        lightspeed = 186000;    //light speed miles in seconds

        days = 1000;

        seconds = days * 24 * 60 * 60;

        distance = lightspeed * seconds;

        System.out.print("За " + days);
        System.out.print(" днец свет пройдёт около ");
        System.out.println(distance + " миль.");


        double pi, r , a;

        r = 10.8;
        pi = 3.1416;
        a = pi * r * r;

        System.out.println("Площадь круга равна " + a);

        char ch1;
        char ch2;

        ch1 = 88;   //code of 'X'
        ch2 = 'Y';

        System.out.print("ch1 and ch2: ");
        System.out.println(ch1 + " " + ch2);

        ch2++;
        System.out.println("ch2 =  " + ch2);



    }
}
