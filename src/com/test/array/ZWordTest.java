package com.test.array;

import com.array.ZWord;

public class ZWordTest {
    public static void main(String[] args) {
        ZWord zWord = new ZWord();
        String str = "LEETCODEISHIRING";
        System.out.println(zWord.convert(str,3));
        System.out.println(zWord.convert_two(str,3));
    }
}
