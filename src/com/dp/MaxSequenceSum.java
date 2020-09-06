package com.dp;

/**
 * 53. 最大子序和
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 示例:
 * 输入: [-2,1,-3,4,-1,2,1,-5,4]
 * 输出: 6
 * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 *
 * 进阶:
 * 如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的分治法求解。
 */
public class MaxSequenceSum {
    /**
     * 动态规划
     * 时间复杂度：O(N)。
     * 空间复杂度：O(N)
     * @param nums  整数数组
     * @return  最大和
     */
    public int maxSubArray(int[] nums) {
        //数组为空的情况
        if (nums.length == 0)
            return 0;
        //状态定义，dp[i]为以 nums[i] 结尾的连续子数组的最大和
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        //最大和
        int sum = dp[0];
        //遍历得出dp
        for (int i = 1; i < nums.length; i++){
            //dp[i]情况
            //1、没有加nums[i]时，dp[i-1]为负数，dp[i] = nums[i]
            //2、没有加nums[i]时，dp[i-1]为正数，dp[i] = dp[i-1]+nums[i]
            //即:状态方程为dp[i] = nums[i]和dp[i-1]中大的那个
            dp[i] = Math.max(nums[i], dp[i - 1] + nums[i]);
            //取出dp中最大和
            sum = Math.max(sum,dp[i]);
        }

        return sum;
    }
}
