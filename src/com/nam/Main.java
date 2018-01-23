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


        int twoD[][] = new int[4][5];

        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                twoD[i][j] = i * 10 + j;

                System.out.print(" " + twoD[i][j]);
            }
            System.out.println();
        }


    }
}
