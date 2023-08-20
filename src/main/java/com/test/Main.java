package com.test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        BigDecimal mortgageValue = BigDecimal.ZERO;
//        mortgageValue = mortgageValue.add(BigDecimal.ZERO);
//        String test = "D1010161110161110161210162016284201628520162852016286NNNNNNNND";
//        test = test.substring(7, 13);
//        SimpleDateFormat formatter = new SimpleDateFormat("ddmmyy");
//        Date date = null;
//        try {
//            date = formatter.parse(test);
//        } catch (ParseException e) {
//            throw new RuntimeException(e);
//        }
//        String formattedDateString = formatter.format(date);
//        System.out.println(date);
//        Factorial factorial =  new Factorial();
//        System.out.println(factorial.tail(2,1));
//        System.out.println(factorial.head(2));
//        if (mortgageValue.compareTo(new BigDecimal(2000)) < 1) {
//            System.out.println("Test True");
//        } else {
//            System.out.println("Test False");
//        }
//        Fibonacci fibonacci = new Fibonacci();
//        System.out.println(fibonacci.tail(6, 0, 1));
//          TowerOfHanoi towerOfHanoi = new TowerOfHanoi();
//          towerOfHanoi.solve(2,'A','B','C');

//        ReverseString reverseString = new ReverseString();
//        System.out.println(reverseString.randomString("Lansera"));

//        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
//        System.out.println(greatestCommonDivisor.gcdProcessIteration(24,18));
//          LinearSearch linearSearch = new LinearSearch();
          BinarySearch binarySearch = new BinarySearch();
          int[] myArray1 = {1, 5, -3, 10, 55, 100};
//          System.out.println(linearSearch.recursiveFind(myArray1, 10, 0));
          System.out.println(binarySearch.findByRecursive(myArray1,104,0, myArray1.length - 1));
    }
}
