package com.test.array;

import com.array.CommonPrefix;

public class CommonPrefixTest {
    public static void main(String[] args) {
        CommonPrefix commonPrefix = new CommonPrefix();
        String[] strs = {"flower","flow","flight"};
        System.out.println(commonPrefix.longestCommonPrefix(strs));
    }
}
