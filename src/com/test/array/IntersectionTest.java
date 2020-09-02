package com.test.array;

import com.array.Intersection;

import java.util.Arrays;

public class IntersectionTest {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        //intersection.intersect(nums1,nums2);
        intersection.intersect_sort(nums1,nums2);
    }
}
