package com.test;

public class Recursion {
    public void head(int n){
        if(n == 0)return;

        head(n-1);

        System.out.println("Result is " + n);
    }

    public void tait(int n){
        if(n == 0)return;

        System.out.println("Result is " + n);

        head(n-1);
    }

    public int factHead(int n){
        if(n == 0) {
            System.out.println("Base Case");
            return 1;
        }

        System.out.println("Before recursion n=" + n);
        int res = n * factHead(n-1);
        System.out.println("After recursion res=" + res);
        return res;
    }

    public int factTail(int n){
//        if(n == 0)return;
//
//        System.out.println("Result is " + n);
//
//        head(n-1);
        return 0;
    }
}
