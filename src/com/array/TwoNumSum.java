package com.array;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 示例:
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoNumSum {
    /**
     * 方法一：暴力法
     * 时间复杂度：O(n^2)，对于每个元素，我们试图通过遍历数组的其余部分来寻找它所对应的目标元素，这将耗费 O(n) 的时间。因此时间复杂度为 O(n^2)
     * 空间复杂度：O(1)。
     */
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0 ; i < nums.length ; i++){
            int temp = target - nums[i];
            for (int j = i +1; j < nums.length; j++){
                if (temp == nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    /**
     * 方法二：哈希表
     */
    public int[] twoSum_hash(int[] nums, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0 ; i<nums.length ; i++){
            int temp = target - nums[i];
            if(map.containsKey(temp)){
                return new int[]{map.get(temp),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
