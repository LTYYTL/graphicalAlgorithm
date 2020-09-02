package com.test.array;

import com.array.TwoNumSum;

import java.util.Arrays;

public class TwoNumSumTest {
    public static void main(String[] args) {
        TwoNumSum twoNumSum = new TwoNumSum();
        int[] nums = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoNumSum.twoSum(nums,9)));
        System.out.println(Arrays.toString(twoNumSum.twoSum_hash(nums,9)));
    }
}
