package com.test.string;

import com.string.RotateString;

public class RotateStringTest {
    public static void main(String[] args) {
        RotateString rotateString = new RotateString();
        /**
         * 示例 1:
         * 输入: A = 'abcde', B = 'cdeab'
         * 输出: true
         */
        //暴力法
        System.out.println(rotateString.rotateString("abcde","cdeab"));
        //转换成A+A
        System.out.println(rotateString.rotateString_conversion("abcde","cdeab"));
        //kmp算法
        System.out.println(rotateString.rotateString_kmp("abcde","cdeab"));
        /**
         * 示例 2:
         * 输入: A = 'abcde', B = 'abced'
         * 输出: false
         */
        //暴力法
        System.out.println(rotateString.rotateString("abcde","abced"));
        //转换成A+A
        System.out.println(rotateString.rotateString_conversion("abcde","abced"));
        //kmp算法
        System.out.println(rotateString.rotateString_kmp("abcde","abced"));
    }
}
