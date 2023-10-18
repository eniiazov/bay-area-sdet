package tests;

import java.util.Arrays;

public class Cup {

    public static void main(String[] args) {

        int [] nums = {11,45,2,3,57,3,11};
        System.out.println(sort(nums));

//        System.out.println(sort(nums));
//        System.out.println(top(2, nums));
    }

    public static String top(int q, int [] nums){
        int [] result = new int[q];
        sort(nums);
        int k = 0;
        for (int i = nums.length-q; i < nums.length; i++){
            System.out.println(i);
            result[k] = nums[i];
            k++;
        }
        return Arrays.toString(result);
    }

    public static String sort(int [] nums){

        for (int i = 0; i < nums.length; i++){
            int min = nums[i];
            int index = 0;
            for (int j = i+1; j < nums.length; j++){
                if (min > nums[j]){
                    min = nums[j];
                    index = j;
                }
            }
            int temp = 0;
            if (min < nums[i]){
                temp = nums[i];
                nums[i] = min;
                nums[index] = temp;
            }
        }
        return Arrays.toString(nums);
    }
}
