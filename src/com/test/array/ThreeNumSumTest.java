package com.test.array;

import com.array.ThreeNumSum;

public class ThreeNumSumTest {
    public static void main(String[] args) {
        ThreeNumSum threeNumSum = new ThreeNumSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeNumSum.threeSum(nums).toString());
    }
}
