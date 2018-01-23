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


        int twoD[][] = new int[4][];

        int k = 0;

        for (int i = 0; i < 4; i++)
        {
            twoD[i] = new int [i + 1];

            for (int j = 0; j < i + 1; j++)
            {
                twoD[i][j] = k++;

                System.out.print(" " + twoD[i][j]);
            }
            System.out.println();
        }


    }
}
