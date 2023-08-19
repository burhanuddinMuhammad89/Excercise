package com.test;

public class ReverseString {

    public String reverseUsingWhile(String s){
        char[] test = s.toCharArray();
        char[] reverseChar = new char[test.length];
        int a = test.length - 1;
        while(a >= 0){
            reverseChar[(test.length - 1) - a] = test[a];
            a--;
        }

        return new String(reverseChar);
    }

    public String reverseUsingRecursion(String s){

        if(s.equalsIgnoreCase("")) return s;

        return reverseUsingRecursion(s.substring(1)) +  s.charAt(0);
    }

    public String randomString(String s){
        String konsonan = "bcdfghjklmnpqrstvwxyz";
        String[] word = s.split("");
        String[] storeWord1 = new String[word.length];
        String[] storeWord2 = new String[word.length];
        String[] reverseStoreWord1 = new String[storeWord1.length];
        String[] result = new String[reverseStoreWord1.length + storeWord2.length];

        int konsonanCount=0;
        int word2Count = 0;
        for(int a=0; a< word.length; a++){
            if(konsonan.contains(word[a]) || konsonan.toUpperCase().contains(word[a])){
                konsonanCount++;
            }else{
                konsonanCount--;
            }

            if(konsonanCount < 2 && (storeWord1[0] == null
                    || storeWord1[1] == null
                    || storeWord1[2] == null)){
                storeWord1[a] = word[a];
            }else{
                storeWord2[word2Count] = word[a];
                word2Count++;
            }
        }

        int a = storeWord1.length-1;
        while(a >= 0){
            if(storeWord1[a] == null){
                a--;
                continue;
            }

            reverseStoreWord1[(storeWord1.length - 1) - a] = storeWord1[a];
            a--;
        }

        System.arraycopy(storeWord2, 0, result, 0, storeWord2.length);
        System.arraycopy(reverseStoreWord1, 0, result, storeWord2.length, reverseStoreWord1.length);

        StringBuilder resultString = new StringBuilder();
        for (int b=0; b<result.length; b++){
            if(result[b] == null){
                continue;
            }
            resultString.append(result[b]);
        }

        return resultString.toString();
    }
}
