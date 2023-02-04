package arrays.tests;

import java.util.Arrays;

import arrays.MyArray2;
import arrays.RandomArray;

public class ArrayTests {
    /* Modify these values to change the size and range of numbers when creating a random array */
    static int ARR_SIZE = 10;
    static int MAX_VAL = 25;
    
    
    /* Unit Tests */

    // EXAMPLE //WHY DO WE NEED THE SECOND LINE IN THIS FUNCTION??
    // static void test_addAll(int[] inputArr) {
    //     System.out.println("==========Testing Sum All==========");
    //     MyArray2 myClass = new MyArray2();    

    //     System.out.println("Input array: " + Arrays.toString(inputArr));
    //     System.out.println("Sum: " + MyArray2.addAll(inputArr));

    //     if(MyArray2.addAll(inputArr) == Arrays.stream(inputArr).sum())
    //         System.out.println("Add all test passed");
    //     else
    //         System.out.println("Add all test failed");
    // }

    //manual to string method
    public static String arrayToString(int[] array){
        String arrString=" ";
        for(int i=0; i <array.length; i++){
            arrString +=" " +array[i];
        }
        return arrString;
    }

    //
    static void test_copy(int[] inputArr){
        System.out.println("=====Testing copy()=====");
        //MyArray2 myClass = new MyArray2();
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + arrayToString(MyArray2.copy(inputArr)));
        System.out.println("=====Done test_copy()=====");
    }

    //tester for addAll
    static void test_addAll(int[] inputArr){
        System.out.println("=====Testing addAll()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.addAll(inputArr));
        System.out.println("=====Done testing addAll()=====");
    }

    //tester for addArrays
    static void test_addArrays(int[] inputArr, int[] inputArr2){
        System.out.println("=====Testing addArrays()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Input array2: " + arrayToString(inputArr2));
        System.out.println("Result: " + arrayToString(MyArray2.addArrays(inputArr, inputArr2)));
        System.out.println("=====Done testing addArrays()=====");
    }

    //tester for multiplyAll
    static void test_multiplyAll(int[] inputArr){
        System.out.println("=====Testing multiplyAll()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.multiplyAll(inputArr));
        System.out.println("=====Done testing multiplyAll()=====");
    }

    //findAverage tester
    static void test_findAverage(int[] inputArr){
        System.out.println("=====Testing findAverage()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.findAverage(inputArr));
        System.out.println("=====Done testing findAverage()=====");
    }

    //swap tester
    static void test_swap(int[] inputArr){
        int index1 = 1;
        int index2 = 2;
        System.out.println("=====Testing swap()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Input indecies: " + index1 + " and " + index2);
        System.out.println("Result: " + arrayToString(MyArray2.swap(inputArr, index1, index2)));
        System.out.println("=====Done testing swap()=====");
    }

    //tester for isElement
    static void test_isElement(int[] inputArr){
        int value = inputArr[inputArr.length - 1];
        System.out.println("=====Testing isElement()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Input value: " + value);
        System.out.println("Result expected positive: " + MyArray2.isElement(inputArr, value));
        value = MyArray2.findMax(inputArr)+1;
        System.out.println("Result expected negative: " + MyArray2.isElement(inputArr, value));
        System.out.println("=====Done testing isElement()=====");
    }

    //tester for indexOf
    static void test_indexOf(int[] inputArr){
        System.out.println("=====Testing indexOf()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        int value = inputArr[inputArr.length - 1];
        System.out.println("Result on value " + value + ": " + MyArray2.indexOf(inputArr, value));
        value = MyArray2.findMax(inputArr) + 1;
        System.out.println("Result on value " + value + ": " + MyArray2.indexOf(inputArr, value));
        System.out.println("=====Done testing indexOf()=====");
    }

    //findMin tester
    static void test_findMin(int[] inputArr){
        System.out.println("=====Testing findMin()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.findMin(inputArr));
        System.out.println("=====Done testing findMin()=====");
    }

    //findMinIndex tester
    static void test_findMinIndex(int[] inputArr){
        System.out.println("=====Testing findMinIndex()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.findMinIndex(inputArr));
        System.out.println("=====Done testing findMinIndex()=====");    
    }

    //findMax tester
    static void test_findMax(int[] inputArr){
        System.out.println("=====Testing findMax()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.findMax(inputArr));
        System.out.println("=====Done testing findMax()=====");    
    }

    //findMaxIndex tester
    public static void test_findMaxIndex(int[] inputArr){
        System.out.println("=====Testing findMaxIndex()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + MyArray2.findMaxIndex(inputArr));
        System.out.println("=====Done testing findMaxIndex()=====");    
    }

    //reverse tester
    public static void test_reverse(int[] inputArr){
        System.out.println("=====Testing reverse()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + arrayToString(MyArray2.reverse(inputArr)));
        System.out.println("=====Done testing reverse()=====");
    }

    //returnReverse tester
    public static void test_returnReverse(int[] inputArr){
        System.out.println("=====Testing returnReverse()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Result: " + arrayToString(MyArray2.returnReverse(inputArr)));
        System.out.println("=====Done testing returnReverse()=====");
    }

    //intersection tester
    public static void test_intersection(int[] inputArr, int[] inputArr2){
        System.out.println("=====Testing intersection()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Input array2: " + arrayToString(inputArr2));
        System.out.println("Result: " + arrayToString(MyArray2.intersection(inputArr, inputArr2)));
        System.out.println("=====Done testing intersection()=====");
    }

    //union tester
    public static void test_union(int[] inputArr, int[] inputArr2){
        System.out.println("=====Testing union()=====");
        System.out.println("Input array: " + arrayToString(inputArr));
        System.out.println("Input array2: " + arrayToString(inputArr2));
        System.out.println("Result: " + arrayToString(MyArray2.union(inputArr, inputArr2)));
        System.out.println("=====Done testing union()=====");
    }

    /* Main */
    public static void main(String[] args) {
        //Create a random array of size ARR_SIZE with integer values between 0 and MAX_VAL
        RandomArray randomArray = new RandomArray();
        int[] inputArr = randomArray.nextArray(ARR_SIZE, MAX_VAL);
        int[] inputArr2 = randomArray.nextArray(ARR_SIZE, MAX_VAL);

        //Run the unit tests
        test_copy(inputArr);
        test_addAll(inputArr);
        test_addArrays(inputArr, inputArr2);
        test_multiplyAll(inputArr);
        test_findAverage(inputArr);
        test_swap(inputArr);
        test_isElement(inputArr);
        test_indexOf(inputArr);
        test_findMin(inputArr);
        test_findMinIndex(inputArr);
        test_findMax(inputArr);
        test_findMaxIndex(inputArr);
        test_reverse(inputArr);
        test_returnReverse(inputArr);
        test_intersection(inputArr, inputArr2);
        test_union(inputArr, inputArr2);

        //you should test to see if union and intersection extra spaces affect the min and average. it does. dont know what i can do about that 
    }
}