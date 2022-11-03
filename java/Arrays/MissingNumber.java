
 
import java.util.*;
import java.util.Arrays;
//  Given an array that consists of elements from range 1 to n. One of the elements is missing from the given list. Find the missing number in the given array.
// example:
// arr=[1,3,5,2,6,4,8,9,10].
// output: the missing number is  7.
class MissingNumber {
 
    public static int getMissingNumber(int[] nums, int n)
    {
        // fint the sum of the numbers:/
        int sum = ((n + 1) * (n + 2)) / 2;
        //////////////////////////////
        for (int i = 0; i < n; i++)
            sum -= nums[i];
        return sum;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = arr.length;
        System.out.println(getMissingNumber(arr, n));
    }
}


