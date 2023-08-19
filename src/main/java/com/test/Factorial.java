package com.test;

public class Factorial {

    public int head(int n){

        if(n == 1)return 1;

        int res1 = head(n-1);

        return n*res1;
    }

    public int tail(int b, int accumulator){

        if(b == 0)return accumulator;

        return tail(b-1, b* accumulator);
    }
}
