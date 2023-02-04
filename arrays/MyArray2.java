/* BEFORE YOU SUBMIT THIS FILE IN GRADESCOPE YOU MUST UNCOMMENT LINE 2 and COMMENT OUT LINE 3 */
//package com.gradescope.arrays;
package arrays;

/**
 * Hw1: MyArray2
 * @author Ryan(K) Emerson
 * @version January 31, 2023
*/

public class MyArray2{

    //makes copy of an array, returning the copy
    public static int[] copy(int[] array){
        //initializing an array to become copy
        int[] arrayCopy; //should this be allocated and initialized in the function or in the test?
        //copy same length as original
        arrayCopy = new int[array.length];
        //iterating through original's elements, adding to copy array
        for(int i=0; i < array.length; i++){
            arrayCopy[i] = array[i];
        }
        //returning copy
        return arrayCopy;
    }
    
    public static int addAll(int[] array){
        //allocate and initialize sum variable
        int sum = 0;
        //iterate through array elements, adding each to the previous sum of values
        for(int i=0; i < array.length; i++){
            sum = sum + array[i];
        }
        //returns sum of all values in array
        return sum;
    }

    public static int[] addArrays(int[] array, int[] array2){
        //allocate new array
        int[] arraysAdded;
        //make new array's capacity the same as the most extensive of the two existing arrays
        if(array.length > array2.length){
            arraysAdded = new int[array.length];
        }else{
            arraysAdded = new int[array2.length];
        }
        //iterate through the three arrays, adding the two existing values and declaring that sum as the value in the new array
        for(int i=0; i < arraysAdded.length; i++){
            arraysAdded[i] = array[i] + array2[i];
        }
        //return new array
        return arraysAdded;
    }

    //multiply all values in array by each other
    public static int multiplyAll(int[] array){
        //allocates and declares product variable to be multiplied against
        int product = 1;
        //iterates through array, multiplying each value by the existing product variable value
        for(int i=0; i < array.length; i++){
            product = product*array[i];
        }
        return product;
    }

    //find average of all values in an array
    public static int findAverage(int[]array){
        //allocate space for average variable
        int average;
        //initialize average variable as the average of values in array
        average=addAll(array)/array.length;
        return average;
    }

    //swap one value in array with another value, indiceated by indecies passed in
    public static int[] swap(int[] array, int index1, int index2){
        //allocating space for value variables
        int value1, value2;
        //storing the first index's value in value1
        value1 = array[index1];
        //storing the second index's value in value2
        value2 = array[index2];
        //changing values in array at index1 and index2 with the opposite values
        array[index1]=value2;
        array[index2]=value1;
        return array;
    }

    //boolean if array contains value
    public static boolean isElement(int[] array, int value){
        //iterating through elements in array
        for(int i=0; i< array.length; i++){
            //checking elements against value
            if(array[i] == value){
                //if value is found is in array
                return true;
            }
        }
        //if value not found in array
        return false;
    }

    //finding index of value within array
    public static int indexOf(int[] array, int value){
        //declaring index as -1
        int index = -1;
        //iterating through array
        for(int i=0; i < array.length; i++){
            //if array contains the value passed in, index will return as i
            if(array[i] == value){
                index = i;
            }
        }
        return index;
    }

    //findMin
    public static int findMin(int[] array){
        int min = array[0];
        for(int i=0; i < array.length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

    //findMinIndex
    public static int findMinIndex(int[] array){
        int index, min;
            index = -1;
            min = findMin(array);
            for(int i=0; i < array.length; i++){
                if(array[i] == min){
                    index=i;
                }
            }
        return index;
    }

    //findMax
    public static int findMax(int[] array){
        int max = array[0];
        for(int i=0; i < array.length; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        return max;
    }

    //findMaxIndex
    public static int findMaxIndex(int[] array){
        int index, max;
        index = -1;
        max = findMax(array);
        for(int i=0; i < array.length; i++){
            if(array[i] == max){
                index = i;
            }
        }
        return index;
    }

    //reverse
    public static int[] reverse(int[] array){
        int before, after;
        for(int i=0; i < array.length/2; i++){
            before=array[i];
            after=array[array.length-1-i];
            array[i]=after;
            array[array.length-1-i]=before;
        }
        return array;
    }

    //return new array in reversed order of original array
    public static int[] returnReverse(int[] array){
        int [] arrayReversed;
        arrayReversed = new int[array.length];
        for(int i=0; i < array.length; i++){
            arrayReversed[i] = array[array.length-1-i];
        }
        return arrayReversed;
    }

    //intersection
    public static int[] intersection(int[] array, int[] array2){
        int length;
        if(array.length < array2.length){
            length = array.length;
        }else{
            length = array2.length;
        }
        int[] arrayIntersection = new int[length];
        int k = 0;
        for(int i=0; i < arrayIntersection.length; i++){
            if(isElement(array2, array[i]) && !isElement(arrayIntersection, array[i])){
                arrayIntersection[k] = array[i];
                k++;
            }
        }
        return arrayIntersection;
    }

    //all values from two arrays joined into one array with no repeats
    public static int[] union(int[] array, int[] array2){
        
        int k = 0;
        int[] arrayUnion = new int[array.length + array2.length];
        for(int i=0; i < array.length; i++){
            if(!isElement(arrayUnion, array[i])){
                arrayUnion[k]=array[i];
                k++;
            }
        }
        for(int j=0; j < array2.length; j++){
            if(!isElement(arrayUnion, array2[j])){
                arrayUnion[k]=array2[j];
                k++;
            }
        }
        return arrayUnion;
    }

    public static void main(String[] args) {
        
    }
}
