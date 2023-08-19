package com.test;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {


    public int head(int n){

        if(n == 0)return 0;
        if(n == 1)return 1;

        int fib1 = head(n-1);
        int fib2 = head(n-2);

        return fib1 + fib2;
    }

    public int tail(int n, int a, int b) {
        System.out.println("n:"+n+" a:"+a+" b:"+b);
        // implement your algorithm here

        if(n == 1) return b;

        return tail(n-1, b, a+b);
    }

    public List<Integer> iterationFor(int n) {

        // list containing the values
        List<Integer> nums = new ArrayList<>();
        // your implmenetation here
        int prevNumber = 0;
        int nextNumber = 0;
        int currentNumber;
        for(int a=0; a<n; a++){
            if(a==0) {
                currentNumber = a;
                nums.add(currentNumber);
                prevNumber = currentNumber;
                nextNumber = nextNumber+1;
                continue;
            }

            currentNumber = nextNumber;
            nextNumber = currentNumber + prevNumber;
            nums.add(currentNumber);
            prevNumber = currentNumber;

        }

        return nums;
    }

    public List<Integer> iterationWhile(int n) {

        // list containing the values
        List<Integer> nums = new ArrayList<>();

        // your implmenetation here
        int a = 0;
        int b = 1;

        while(nums.size() < n){
            nums.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }

        return nums;
    }
}
