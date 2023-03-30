package com.zipcodewilmington.arrayutility;

import java.util.Arrays;

/**
 * Created by leon on 3/6/18.
 */
public class ArrayUtility<T>{
    T[] inputArray;

    public ArrayUtility(T[] inputArray) {
        this.inputArray = inputArray;
    }
    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
//        merge arrays first then iterate through and count
        int count =  0;
        for (int i = 0; i < inputArray.length; i++){
            if (inputArray[i] == valueToEvaluate){
                count++;
            }
        }
        return count;
    }
    public long getNumberOfOccurrences(Integer[] inputArray){
        return -1;
    }
    public Integer removeValueTest(Integer[] inputArray){
        return 1;
    }
    public Integer getMostCommonFromMergeTest(Integer[] inputArray){
        return 1;
    }

}
