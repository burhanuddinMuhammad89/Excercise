package com.test;

public class LinearSearch {

    public int searchItteration(int[] container, int item){
        int a=0;

        while(a<container.length){
            if(container[a] == item){
                return a;
            }
            a++;
        }

        return -1;
    }

    public int recursiveFind(int[] container, int item, int index) {
        // your implementation here
        if(container[index] == item) return index;
        if(container.length - 1 == index && container[index] != item) return -1;

        return recursiveFind(container,  item, index+1);
    }
}
