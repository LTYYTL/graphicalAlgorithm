package com.array;

import java.util.Arrays;

/**
 * 189. 旋转数组
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 *
 * 示例 2:
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的 原地 算法。
 */
public class RotateArray {
    /**
     *  方法一：暴力法
     *  时间复杂度：O(n*k)O(n∗k) 。每个元素都被移动 1 步（O(n)O(n)） k次（O(k)O(k)） 。
     *  空间复杂度：O(1)O(1) 。没有额外空间被使用。
     */
    public void rotate(int[] nums, int k ){
        int temp, previous;
        for (int i = 0 ;i < k;i++){
            previous = nums[nums.length - 1];
            for (int j = 0; j < nums.length; j++){
                temp = nums[j];
                nums[j] = previous;
                previous = temp;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     *  方法二：辅助数组
     *  时间复杂度： O(n)O(n) 。将数字放到新的数组中需要一遍遍历，另一边来把新数组的元素拷贝回原数组。
     *  空间复杂度： O(n)O(n)。另一个数组需要原数组长度的空间。
     */

    public void rotate_assist(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        for (int i = 0; i < len ; i++){
           int temp = (i+k)%len;
           res[temp] = nums[i];
        }

        System.out.println(Arrays.toString(res));
    }

    /**
     * 方法 3：使用环状替换
     * 时间复杂度：O(n)O(n) 。只遍历了每个元素一次。
     * 空间复杂度：O(1)O(1) 。使用了常数个额外空间。
     */
    public void rotate_ring(int[] nums, int k){
        k = k % nums.length;
        int count = 0;
        for (int start = 0 ;count < nums.length; start++){
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     * 方法 4：使用反转
     * 时间复杂度：O(n)O(n) 。 nn 个元素被反转了总共 3 次。
     * 空间复杂度：O(1)O(1) 。 没有使用额外的空间。
     */
    public void rotate_reverse(int[] nums, int k){
        k %= nums.length;
        reverse(nums ,0 ,nums.length - 1);
        reverse(nums,0,k - 1);
        reverse(nums, k,nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

    public void reverse(int[] nums ,int start ,int end){
        while (start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
