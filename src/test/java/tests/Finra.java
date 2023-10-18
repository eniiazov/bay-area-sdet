package tests;

import io.restassured.RestAssured;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Finra {

    public static void main(String[] args) {
//[-1,0,1,2,-1,-4]

        int [] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        System.out.println(Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                a: for(int k = j+1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> te = new ArrayList<>();
                        te.add(nums[i]);
                        te.add(nums[j]);
                        te.add(nums[k]);
                        Collections.sort(te);
                        if (!result.contains(te)){
                            result.add(te);
                        }

                        System.out.println("i: "+ i + "\tj: " + j + "\tk: " + k);
                        System.out.println(te);
                        continue a;
                    }
                }
            }
        }
        return result;
    }
}
