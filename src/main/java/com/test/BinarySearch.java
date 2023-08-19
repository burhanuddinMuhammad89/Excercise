package com.test;

public class BinarySearch {

    public int find(int[] container, int item, int left, int right){

        if(right<left) return -1;

        int middleIndex = (left +right) / 2;

        if(container[middleIndex] == item) return middleIndex;

        if(container[middleIndex] < item){
            return find(container, item, middleIndex+1, right);
        }else{
            return find(container, item, left, middleIndex-1);
        }
    }
}
