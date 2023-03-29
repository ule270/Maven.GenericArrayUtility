package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    T[] newArr;

    public ArrayUtility(T[] newArr) {
        this.newArr = newArr;
    }
    public Integer countDuplicatesInMerge(T[] inputArray, T valueToEvaluate){
        int count =  0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == valueToEvaluate){
                count = count +i;
            }
        }
        return count;
    }
    public long getNumberOfOccurrences(Integer[] inputArray){
        return -1;
    }

}
