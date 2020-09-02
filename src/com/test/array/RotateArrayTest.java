package com.test.array;

import com.array.RotateArray;

public class RotateArrayTest {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] nums1 = {-1,-100,3,99};
        int[] nums2 = {-1,-100,3,99};
        int[] nums3 = {-1,-100,3,99};
        int[] nums4 = {-1,-100,3,99};

       rotateArray.rotate(nums1,2);
       rotateArray.rotate_assist(nums2,2);
       rotateArray.rotate_ring(nums3,2);
       rotateArray.rotate_reverse(nums4,2);
    }
}
