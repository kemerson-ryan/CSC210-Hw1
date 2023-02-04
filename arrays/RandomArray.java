/* DO NOT MODIFY THIS FILE AND DO NOT SUBMIT IT TO GRADESCOPE */
package arrays;

//https://docs.oracle.com/javase/8/docs/api/java/util/Random.html
import java.util.Random;

public class RandomArray {
    /* This class does not have any constructors */
    /* Creates an integer array of a given where each element is between 0 and max */
    public int[] nextArray(int size, int max){
        Random random = new Random();//initialize random number generator
        int[] array = new int[size];
        for (int i = 0; i< array.length; i++) {
            array[i] = random.nextInt(max);//generate a random integer in the range 0 to max
        }
        return array;
    }
}