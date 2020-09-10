package com.dp;

/**
 * 198. 打家劫舍
 * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
 * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
 * 给定一个代表每个房屋存放金额的非负整数数组，计算你不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
 *
 * 示例 1：
 * 输入：[1,2,3,1]
 * 输出：4
 * 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
 *      偷窃到的最高金额 = 1 + 3 = 4 。
 *
 * 示例 2：
 * 输入：[2,7,9,3,1]
 * 输出：12
 * 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
 *      偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 *
 * 提示：
 * 0 <= nums.length <= 100
 * 0 <= nums[i] <= 400
 */
public class HouseRobber {
    /**
     * 方法一：动态规划
     * 时间复杂度：O(n)，其中 n 是数组长度。只需要对数组遍历一次。
     * 空间复杂度：O(n)。
     *
     * 动态方程分析：dp[i]：偷盗至第 i个房子时，所获取的最大利益
     * 这是因为：如果定义dp[i]:偷盗含第 i个房子时，所获取的最大利益，就需要取找寻金额最大的那个房间，再需要同时考虑两边的大小，就会进入一个恶性循环
     * 1、由于不可以在相邻的房屋闯入，所以至i房屋可盗窃的最大值，要么就是至 i-1 房屋可盗窃的最大值，要么就是至 i-2 房屋可盗窃的最大值加上当前房屋的值，
     * 二者之间取最大值，即：dp[i] = max(dp[i-2]+nums[i], dp[i-1])
     *
     * 2、当只有一间房子时，那就偷窃这间，即：dp[0] = nums[0]
     *
     * 3、当有两间房子时，偷窃最大的那间，即：dp[1] = max(nums[0],nums[1])
     *
     * @param nums 房间金额数组
     * @return 最大收益
     */
    public int rob(int[] nums) {
        //数组为空的情况
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //房子的总数
        int len = nums.length;
        //构建状态方程，表示偷取至第i个房间的最大收益
        int[] dp = new int[len];
        //只有一间房子的情况
        dp[0] = nums[0];
        //有两间房子的情况
        dp[1] = Math.max(dp[0],nums[1]);
        //计算到第i个房间的dp[i]
        for (int i = 2; i < len; i++){
            //取至 i-1 房屋可盗窃的最大值和至 i-2 房屋可盗窃的最大值加上当前房屋的值中的最大值
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        //最后一间房子的最大值，即为最终偷窃的最大值
        return dp[len-1];
    }

    /**
     * 方法二：动态规划 + 空间优化（原地修改）
     * 时间复杂度：O(n)，其中 nn 是数组长度。只需要对数组遍历一次。
     * 空间复杂度：O(1)。
     *
     * 空间优化：在小贼偷盗的过程中，不可能转回头去到自己已经偷过的房间！小偷只需要每次将财物搬到下一个房间就行！
     *
     * @param nums 房间金额数组
     * @return 最大收益
     */
    public int rob_zeroStructure(int[] nums) {
        //数组为空的情况
        if (nums == null || nums.length == 0) {
            return 0;
        }
        //房子的总数
        int len = nums.length;
        //只有一间房子的情:nums[0];
        //有两间房子的情况
        nums[1] = Math.max(nums[0],nums[1]);
        //计算到第i个房间的最大收益存入nums[i]中
        for (int i = 2; i < len; i++){
            //取至 i-1 房屋可盗窃的最大值和至 i-2 房屋可盗窃的最大值加上当前房屋的值中的最大值
            nums[i] = Math.max(nums[i-1],nums[i-2]+nums[i]);
        }
        //最后一间房子的最大值，即为最终偷窃的最大值
        return nums[len-1];
    }
}
