
 
import java.util.*;
import java.util.Arrays;
 //  Given an array that consists of elements from range 1 to n. One of the elements is missing from the given list. Find the missing number in the given array.
// example:
// arr=[1,3,5,2,6,4,8,9,10].
// output: the missing number is  7.
class MissingNumber2 {
 
    public static int getMissingNumber(int[] nums, int n)
    {
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != (nums[i+1]-1)){
                // System.out.println(nums[i+1]+1);
                return nums[i+1]-1;
            }
        }
        return 1;
    }
 
    // Driver code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = arr.length;
        System.out.print("The missing Number is : ");
        System.out.println(getMissingNumber(arr, n));
    }
}
// solution by izzMalakh