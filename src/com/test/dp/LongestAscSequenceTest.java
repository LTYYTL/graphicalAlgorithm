package com.test.dp;

import com.dp.LongestAscSequence;

public class LongestAscSequenceTest {
    public static void main(String[] args) {
        LongestAscSequence longestAscSequence = new LongestAscSequence();
        int[] nums = {10,9,2,5,3,7,101,18};
        System.out.println(longestAscSequence.lengthOfLIS(nums));
    }
}
