package com.test.array;

import com.array.SituDelete;

public class SituDeleteTest {
    public static void main(String[] args) {
        SituDelete situDelete = new SituDelete();
        int[] nums = {0,1,0,3,12};
        System.out.println(situDelete.removeElement(new int[]{3,2,2,3},3));
        System.out.println(situDelete.removeDuplicates(new int[]{1,1,2}));
        situDelete.moveZeroes(nums);
    }
}
