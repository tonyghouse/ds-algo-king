package dsalgoking.daywise.january2025.jan5;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        System.out.println("LeetCode-283(Easy) Move Zeros");
        int[] nums = new int[]{0,1,3,12,0,9};
        moveZeroes(nums);
        System.out.println("Result: "+ Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int i =0;
        int j = 0; //points to the required position

        while(i<nums.length){
            if(nums[i] == 0){
                //just ignore and go ahead
                i++;
            } else{
                swapped(nums, i, j);
                i++;
                j++;
            }
        }


    }

    private static void swapped(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;

    }
}
