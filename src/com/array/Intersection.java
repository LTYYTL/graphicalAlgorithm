package com.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 350. 两个数组的交集 II
 * 给定两个数组，编写一个函数来计算它们的交集。
 * 示例 1：
 * 输入：nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出：[2,2]
 *
 * 示例 2:
 * 输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出：[4,9]
 *
 * 说明：
 * 输出结果中每个元素出现的次数，应与元素在两个数组中出现次数的最小值一致。
 * 我们可以不考虑输出结果的顺序。
 *
 * 进阶：
 * 如果给定的数组已经排好序呢？你将如何优化你的算法？
 * 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
 * 如果 nums2 的元素存储在磁盘上，内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？
 */
public class Intersection {
    //哈希表法
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums1.length ; i++){
            int key = nums1[i];
            if (map.containsKey(key)){
                map.put(key,map.get(key)+1);
            }else {
                map.put(key,1);
            }
        }

        int temp = 0;//临时指针

        for (int i = 0 ; i<nums2.length ; i++){
            int key = nums2[i];
            if (map.containsKey(key) && map.get(key)>0){
                map.put(key,map.get(key)-1);
                nums2[temp] = key;
                temp++;
            }
        }

        int[] res = Arrays.copyOf(nums2,temp);
        System.out.println(Arrays.toString(res));

        return res;
    }

    //排序方法后(双指针)
    public int[] intersect_sort(int[] nums1,int[] nums2){

        if (nums1.length > nums2.length){
            return intersect_sort(nums2,nums1);
        };
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else {
                nums1[k] = nums1[i];
                i++;
                j++;
                k++;
            }
        }

        int[] res = Arrays.copyOf(nums1,k);
        System.out.println(Arrays.toString(res));

        return res;
    }
}
