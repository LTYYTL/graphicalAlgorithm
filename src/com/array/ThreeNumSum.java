package com.array;

import java.util.*;

/**
 * 15. 三数之和
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *
 * 示例：
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * 满足要求的三元组集合为：
 * [
 *   [-1, 0, 1],
 *   [-1, -1, 2]
 * ]
 */
public class ThreeNumSum {
    public List<List<Integer>> threeSum(int[] nums) {
        //数组排序
        Arrays.sort(nums);
        //结果变量
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++){
            //双指针
            int left = i + 1;
            int right = nums.length - 1;


            //数组排序好，当大于0以后其他的数和不会在等于0,所以跳出
            if (nums[i] > 0){
                break;
            }

            //双指针循环
            if (i==0 || nums[i] != nums[i-1]){
                while (left < right){
                    //临时变量
                    int temp = nums[i];
                    int temp_left = nums[left];
                    int temp_right = nums[right];
                    int sum = temp + temp_left + temp_right;

                    if (sum < 0){
                        left++;
                    }else if (sum > 0){
                        right--;
                    }else{
                        res.add(Arrays.asList(temp,temp_left,temp_right));
                        //去除重复
                        while (left < right && nums[left]  == nums[left+1]) left++;
                        while (left < right && nums[right]  == nums[right-1]) right--;
                        left++;
                        right--;
                    }
                }
            }
        }

        return res;
    }
}
