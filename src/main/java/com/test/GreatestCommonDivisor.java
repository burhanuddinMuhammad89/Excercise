package com.test;

public class GreatestCommonDivisor {

    public int gcdProcessRecursion(int largerNumber, int smallerNumber){

        if(smallerNumber == 0){
            return largerNumber;
        }

        return gcdProcessRecursion(smallerNumber, largerNumber % smallerNumber);
    }

    public int gcdProcessIteration(int largerNumber, int smallerNumber){


        while(smallerNumber > 0){
            int modResult =  largerNumber % smallerNumber;
            largerNumber = smallerNumber;
            smallerNumber = modResult;
        }

        return largerNumber;

    }
}
