package com.test;

public class BinarySearch {

    public int findByRecursive(int[] container, int item, int left, int right) {

        if (left > right) return -1;

        int middleIndex = (left + right)/2;

        if(container[middleIndex] == item) return middleIndex;

        if(middleIndex < right){
            return findByRecursive(container, item, left + 1, right);
        }

        return  findByRecursive(container, item, left, right -1);
    }

//    public int findByIteratione(int[] container, int item) {
//        int rightIndex = container.length - 1;
//        int middleIndex = 0;
//        for(int a=0; a<container.length; a = (middleIndex < rightIndex?a+1:a-1)){
//            if(a > rightIndex) return -1;
//            middleIndex = (a + rightIndex)/2;
//            if(container[middleIndex] == item) return  middleIndex;
//
//        }
//
//        return 0;
//    }
}