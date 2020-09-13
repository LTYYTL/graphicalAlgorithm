package com.test.string;

import com.string.ImplementstrStr;

public class ImplementstrStrTest {
    public static void main(String[] args) {
        ImplementstrStr implementstrStr = new ImplementstrStr();
        /** * 示例 1:
         * 输入: haystack = "hello", needle = "ll"
         * 输出: 2
         */
        System.out.println(implementstrStr.strStr("hello","ll"));
        /**
         * 示例 2:
         * 输入: haystack = "aaaaa", needle = "bba"
         * 输出: -1
         */
        System.out.println(implementstrStr.strStr("aaaaa","bba"));
    }
}
