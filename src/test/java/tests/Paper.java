package tests;

import java.util.Arrays;

public class Paper {

    public static void main(String[] args) {
        int [] nums = {2,4,1,6,7,45,23,12,34};
        topK(nums, 2);
    }

    public static void topK(int [] nums, int a){
        sortIt(nums);
//        for (int i = 0; i < a; i++){
//            nums[i] = nums[nums.length-(i+1)];
//        }
//        System.out.println(Arrays.toString(nums));
    }

    public static int [] sortIt(int [] nums){
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] > nums[i]){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }


}
