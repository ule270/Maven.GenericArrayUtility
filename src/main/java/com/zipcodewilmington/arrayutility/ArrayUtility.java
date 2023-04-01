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

    public T[] merge(T[] arrayToMerge){
        T[] mergedArray = Arrays.copyOf(inputArray, inputArray.length + arrayToMerge.length);
        System.arraycopy(arrayToMerge, 0, mergedArray, inputArray.length, arrayToMerge.length);
        inputArray = mergedArray;
        return inputArray;
    }

    public Integer countDuplicatesInMerge(T[] arrayToMerge, T valueToEvaluate){
        T[] mergedArray = Arrays.copyOf(inputArray, inputArray.length + arrayToMerge.length);
        System.arraycopy(arrayToMerge, 0, mergedArray, inputArray.length, arrayToMerge.length);
        inputArray = mergedArray;
        return getNumberOfOccurrences(valueToEvaluate);
//        calling most getNumberOfOccurrences();
//        int count =  0;
//        for (int i = 0; i < mergedArray.length; i++){
//            if (mergedArray[i] == valueToEvaluate){
//                count++;
//            }
//        }
//        return count;
    }
    public Integer getNumberOfOccurrences(T valueToEvaluate){
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == valueToEvaluate) {
                count++;
            }
        }
        return count;
    }
    public T[] removeValue(T valueToRemove){
        int num = 0;
        for (T element : inputArray) {
            if (!element.equals(valueToRemove)) {
                num++;
            }
        }
        T [] result = Arrays.copyOf(inputArray, num);
//        copied array with length of num since;
//        cannot make empty generic array with length bc no component type;
//        T[] result = new T [num];
        int resultIndex = 0;
        for (T element : inputArray) {
            if (!element.equals(valueToRemove)) {
                result[resultIndex] = element;
                resultIndex++;
            }
        }
        return result;
    }

    public T getMostCommonFromMerge(T[] arrayToMerge) {
//        calling method from above;
//        T[] mergedArray = Arrays.copyOf(inputArray, inputArray.length + arrayToMerge.length);
//        System.arraycopy(arrayToMerge, 0, mergedArray, inputArray.length, arrayToMerge.length);
//        inputArray = mergedArray;
        T[] mergedArray = merge(arrayToMerge);
        int maxcount = 0;
        T maxFreq = null;
        for (int i = 0; i < mergedArray.length; i++) {
            int count = 0;
            for (int j = 0; j < mergedArray.length; j++) {
                if (mergedArray[i] == mergedArray[j]) {
                    count++;
                }
            }
            if (count > maxcount) {
                maxcount = count;
                maxFreq = mergedArray[i];
            }
        } return maxFreq;
    }
}
