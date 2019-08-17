package com.git.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Created Date 2019/8/17 14:52
 *
 * @author Tengda Ma
 */
public class FindAllNumbersDisappearedInAnArray {


    public static void main(String... args){

        FindAllNumbersDisappearedInAnArray array = new FindAllNumbersDisappearedInAnArray();
        System.out.println(array.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));

    }


    public List<Integer> findDisappearedNumbers(int[] nums) {

        ArrayList ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if((nums[Math.abs(nums[i])-1])>0){
                nums[Math.abs(nums[i])-1]=nums[Math.abs(nums[i])-1]*(-1);
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }

}
