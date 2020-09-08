package com.test.dp;

import com.dp.TriangleMinNum;

import java.util.ArrayList;
import java.util.List;

public class TriangleMinNumTest {
    public static void main(String[] args) {
        TriangleMinNum triangleMinNum = new TriangleMinNum();

        List<Integer> list1 = new ArrayList<>();
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);

        List<Integer> list3 = new ArrayList<>();
        list3.add(6);
        list3.add(5);
        list3.add(7);

        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(1);
        list4.add(8);
        list4.add(3);

        List<List<Integer>> res = new ArrayList<>();
        res.add(list1);
        res.add(list2);
        res.add(list3);
        res.add(list4);

        System.out.println(res.toString());

        System.out.println(triangleMinNum.minimumTotal(res));
        System.out.println(triangleMinNum.minimumTotal_structure(res));


    }
}
