package com.test.dp;

import com.dp.MaxSequenceSum;

public class MaxSequenceSumTest {
    public static void main(String[] args) {
        MaxSequenceSum maxSequenceSum = new MaxSequenceSum();

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSequenceSum.maxSubArray(nums));
    }
}
